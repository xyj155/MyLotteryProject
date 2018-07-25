package com.example.administrator.lotterytest.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.lotterytest.R;
import com.example.administrator.lotterytest.lottery.New;
import com.example.administrator.lotterytest.util.VolleyRequestCllBack;
import com.example.administrator.lotterytest.util.VolleyRequestUtil;
import com.example.administrator.lotterytest.view.AppleDialog;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class NewActivity extends AppCompatActivity {
    private static final String TAG = "NewActivity";
    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.ry_news)
    RecyclerView ryNews;
    private RequestQueue queue;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        ButterKnife.inject(this);
        dialog = AppleDialog.createLoadingDialog(NewActivity.this, "数据加载中");
        dialog.show();
        queue = Volley.newRequestQueue(NewActivity.this);
        Map<String, String> map = new HashMap<>();
        Intent intent = getIntent();
        String name = intent.getStringExtra("code");
        toolbar.setTitle(name);
        toolbar.setTitleTextColor(0xffffffff);
        map.put("channel", name);
        map.put("num", String.valueOf(30));
        map.put("appkey", "d3a62ea686a062d5a5ba1b91fda4f1df");
        map.put("start", String.valueOf(0));
        ryNews.setLayoutManager(new LinearLayoutManager(NewActivity.this));
        queue.add(VolleyRequestUtil.RequestWithParams("https://way.jd.com/jisuapi/get", map, new VolleyRequestCllBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Log.i(TAG, "onSuccess: " + result);
                dialog.dismiss();
                New aNew = gson.fromJson(result, New.class);
                if (aNew.getResult().getResult().getList().size() > 0) {
                    NewsAdapter adapter = new NewsAdapter(aNew.getResult().getResult().getList());
                    ryNews.setAdapter(adapter);
                }else {
                    Toast.makeText(NewActivity.this, "服务器繁忙，请重试！", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onError(String error) {
                Toast.makeText(NewActivity.this, "服务器繁忙，请重试！", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        }));
    }

    private class NewsAdapter extends BaseQuickAdapter<New.ResultBeanX.ResultBean.ListBean, BaseViewHolder> {

        public NewsAdapter(@Nullable List<New.ResultBeanX.ResultBean.ListBean> data) {
            super(R.layout.item_news, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, final New.ResultBeanX.ResultBean.ListBean item) {
            helper.setText(R.id.title, item.getTitle())
                    .setText(R.id.tag1, item.getCategory())
                    .setText(R.id.tag2, item.getSrc())
                    .setText(R.id.content, item.getContent())
                    .setText(R.id.time, item.getTime())
                    .setOnClickListener(R.id.ll, new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent in = new Intent(NewActivity.this, WebViewActiviry.class);
                            in.putExtra("url", item.getWeburl());
                            startActivity(in);
                        }
                    });
            ImageView view = helper.getView(R.id.img);
            Glide.with(NewActivity.this).load(item.getPic()).asBitmap().error(R.mipmap.ic_launcher).into(view);
        }
    }
}
