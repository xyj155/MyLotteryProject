package com.example.administrator.lotterytest.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.lotterytest.R;
import com.example.administrator.lotterytest.lottery.QLCGsonBean;
import com.example.administrator.lotterytest.util.VolleyRequestCllBack;
import com.example.administrator.lotterytest.util.VolleyRequestUtil;
import com.example.administrator.lotterytest.view.AppleDialog;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SSCActivity extends AppCompatActivity {
    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    private RecyclerView ry_lottery;
    private RequestQueue queue;
    private Dialog dialog;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssc);
        ButterKnife.inject(this);
        Intent intent = getIntent();
        id = intent.getStringExtra("id");
        final String date = intent.getStringExtra("date");
        ry_lottery = (RecyclerView) findViewById(R.id.ry_lottery);
        toolbar.setTitle(intent.getStringExtra("name"));
        toolbar.setTitleTextColor(0xffffffff);
        ry_lottery.setLayoutManager(new LinearLayoutManager(SSCActivity.this));
        queue = Volley.newRequestQueue(SSCActivity.this);
        dialog = AppleDialog.createLoadingDialog(SSCActivity.this, "数据加载中");
        dialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Map<String, String> map = new HashMap<String, String>();
                map.put("caipiaoid", id);
                map.put("issueno", date);
                map.put("appkey", "d3a62ea686a062d5a5ba1b91fda4f1df");
                queue.add(VolleyRequestUtil.RequestWithParams("https://way.jd.com/jisuapi/history", map, new VolleyRequestCllBack() {
                    @Override
                    public void onSuccess(String result) {
                        dialog.dismiss();
                        System.out.println(result);
                        Gson gson = new Gson();
                        QLCGsonBean dltGson = gson.fromJson(result, QLCGsonBean.class);
                        Adapter adapter = new Adapter(dltGson.getResult().getResult().getList());
                        ry_lottery.setAdapter(adapter);
                    }

                    @Override
                    public void onError(String error) {
                        Toast.makeText(SSCActivity.this, "服务器繁忙，请重试！", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }));
            }
        }, 1200);

    }

    private class Adapter extends BaseQuickAdapter<QLCGsonBean.ResultBeanX.ResultBean.ListBean, BaseViewHolder> {

        public Adapter(List<QLCGsonBean.ResultBeanX.ResultBean.ListBean> data) {
            super(R.layout.lottery_item, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, final QLCGsonBean.ResultBeanX.ResultBean.ListBean item) {
            helper.setText(R.id.tv_date, "开奖日期" + item.getOpendate())
                    .setOnClickListener(R.id.ll, new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(SSCActivity.this, LotteryDetailActivity.class);
                            intent.putExtra("caipiaoid", id);
                            intent.putExtra("issueno", item.getIssueno());
                            startActivity(intent);
                        }
                    });
            RecyclerView view = helper.getView(R.id.ry_lottery);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SSCActivity.this);
            linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            view.setLayoutManager(linearLayoutManager);
            List<String> list = new ArrayList<String>();
            String number = item.getNumber();
            String[] split = number.split(" ");
            for (int i = 0; i < split.length; i++) {
                list.add(split[i]);
            }
            GlobeAdapter a = new GlobeAdapter(list);
            view.setAdapter(a);
        }


    }

    private class GlobeAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

        public GlobeAdapter(List<String> data) {
            super(R.layout.lottery_globeitem, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, String item) {

            if (helper.getPosition() == 0) {
                Log.i(TAG, "convert: " + item + "///" + helper.getPosition());
                helper.setText(R.id.item, item)
                        .setBackgroundRes(R.id.item, R.drawable.circle_blue)
                        .setTextColor(R.id.item, 0xff0000ff);
            }
            helper.setText(R.id.item, item);

        }
    }
}
