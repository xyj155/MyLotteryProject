package com.example.administrator.lotterytest.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.lotterytest.R;
import com.example.administrator.lotterytest.lottery.SingleBonus;
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

public class LotteryDetailActivity extends AppCompatActivity {

    @InjectView(R.id.qihao)
    TextView qihao;
    @InjectView(R.id.luck1)
    TextView luck1;
    @InjectView(R.id.tv_date)
    TextView tvDate;
    @InjectView(R.id.die_date)
    TextView dieDate;
    @InjectView(R.id.ry_main)
    RecyclerView ryMain;
    @InjectView(R.id.sale)
    TextView sale;
    @InjectView(R.id.ry_lottery)
    RecyclerView ryLottery;
    private RequestQueue queue;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery_detail);
        ButterKnife.inject(this);
        dialog = AppleDialog.createLoadingDialog(LotteryDetailActivity.this, "数据加载中");
        dialog.show();
        Intent intent = getIntent();
        String caipiaoid = intent.getStringExtra("caipiaoid");
        String issueno = intent.getStringExtra("issueno");
        queue = Volley.newRequestQueue(LotteryDetailActivity.this);
        Map<String, String> map = new HashMap<>();
        map.put("caipiaoid", caipiaoid);
        map.put("issueno", issueno);
        map.put("appkey", "d3a62ea686a062d5a5ba1b91fda4f1df");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(LotteryDetailActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        ryLottery.setLayoutManager(linearLayoutManager);
        queue.add(VolleyRequestUtil.RequestWithParams("https://way.jd.com/jisuapi/query3", map, new VolleyRequestCllBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                SingleBonus singleBonus = gson.fromJson(result, SingleBonus.class);
                if (singleBonus.getCode().equals("10000")) {
                    SingleBonus.ResultBeanX.ResultBean result1 = singleBonus.getResult().getResult();
                    tvDate.setText("开奖日期：" + result1.getOpendate());
                    dieDate.setText("截止日期：" + result1.getDeadline());
                    String[] split = result1.getNumber().split(" ");
                    List<String> list = new ArrayList<String>();
                    for (int i = 0; i < split.length; i++) {
                        list.add(split[i]);
                    }
                    Adapter s = new Adapter(list);
                    ryLottery.setAdapter(s);
                    luck1.setText(result1.getRefernumber());
                    sale.setText("销售金额：" + result1.getSaleamount() + "元");
                    qihao.setText("期号： 第" + result1.getIssueno() + "期");
                    ryMain.setLayoutManager(new LinearLayoutManager(LotteryDetailActivity.this));
                    ryMain.setNestedScrollingEnabled(false);
                    BonusAdapter adapter = new BonusAdapter(result1.getPrize());
                    ryMain.setAdapter(adapter);
                dialog.dismiss();
                }else {
                    dialog.dismiss();
                    Toast.makeText(LotteryDetailActivity.this, "服务器繁忙", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onError(String error) {
                dialog.dismiss();
                Toast.makeText(LotteryDetailActivity.this, "服务器繁忙", Toast.LENGTH_SHORT).show();
            }
        }));
    }

    private class Adapter extends BaseQuickAdapter<String, BaseViewHolder> {

        public Adapter(@Nullable List<String> data) {
            super(R.layout.lottery_globeitem, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, String item) {
            helper.setText(R.id.item, item);
            if (helper.getPosition() == 1) {
                helper.setBackgroundRes(R.id.item, R.drawable.circle_blue)
                        .setTextColor(R.id.item, 0xff0000ff);
            }
        }
    }

    private class BonusAdapter extends BaseQuickAdapter<SingleBonus.ResultBeanX.ResultBean.PrizeBean, BaseViewHolder> {

        public BonusAdapter(@Nullable List<SingleBonus.ResultBeanX.ResultBean.PrizeBean> data) {
            super(R.layout.lotterty_awards, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, SingleBonus.ResultBeanX.ResultBean.PrizeBean item) {
            helper.setText(R.id.rank, item.getPrizename())
                    .setText(R.id.bonus, item.getSinglebonus())
                    .setText(R.id.num, item.getNum());
        }
    }
}
