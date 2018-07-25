package com.example.administrator.lotterytest;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.lotterytest.lottery.Single;
import com.example.administrator.lotterytest.lottery.SingleBonus;
import com.example.administrator.lotterytest.ui.NewActivity;
import com.example.administrator.lotterytest.ui.SSCActivity;
import com.example.administrator.lotterytest.util.VolleyRequestCllBack;
import com.example.administrator.lotterytest.util.VolleyRequestUtil;
import com.example.administrator.lotterytest.view.AppleDialog;
import com.gongwen.marqueen.MarqueeView;
import com.gongwen.marqueen.SimpleMF;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.ssc)
    TextView ssc;
    @InjectView(R.id.dlt)
    TextView dlt;
    @InjectView(R.id.syxw)
    TextView syxw;
    @InjectView(R.id.qxc)
    TextView qxc;
    @InjectView(R.id.qlc)
    TextView qlc;
    @InjectView(R.id.pls)
    TextView pls;
    @InjectView(R.id.plw)
    TextView plw;
    @InjectView(R.id.ssq)
    TextView ssq;
    @InjectView(R.id.ry_main)
    RecyclerView ryMain;
    @InjectView(R.id.tv1)
    TextView tv1;
    @InjectView(R.id.tv2)
    TextView tv2;
    @InjectView(R.id.tv3)
    TextView tv3;
    @InjectView(R.id.tv4)
    TextView tv4;
    @InjectView(R.id.tv5)
    TextView tv5;
    @InjectView(R.id.tv6)
    TextView tv6;
    @InjectView(R.id.tv7)
    TextView tv7;
    @InjectView(R.id.news1)
    TextView news1;
    @InjectView(R.id.news2)
    TextView news2;
    @InjectView(R.id.news3)
    TextView news3;
    @InjectView(R.id.news4)
    TextView news4;
    @InjectView(R.id.news5)
    TextView news5;
    @InjectView(R.id.news6)
    TextView news6;
    @InjectView(R.id.news7)
    TextView news7;
    @InjectView(R.id.news8)
    TextView news8;
    @InjectView(R.id.news9)
    TextView news9;
    @InjectView(R.id.news10)
    TextView news10;
    private Dialog dialog;
    private RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        queue = Volley.newRequestQueue(MainActivity.this);
        dialog = AppleDialog.createLoadingDialog(MainActivity.this, "数据加载中");
        dialog.show();
        final List<String> datas = Arrays.asList("时时彩APP客户端更新了",
                "双色球大奖到底花落谁家呢？",
                "今天的开奖号码，你看了吗？");
//SimpleMarqueeView<T>，SimpleMF<T>：泛型T指定其填充的数据类型，比如String，Spanned等
        MarqueeView marqueeView = (MarqueeView) findViewById(R.id.marqueeView);
        SimpleMF<String> marqueeFactory = new SimpleMF(this);
        marqueeFactory.setData(datas);
        marqueeView.setMarqueeFactory(marqueeFactory);
        marqueeView.startFlipping();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Map<String, String> map = new HashMap<String, String>();
                map.put("caipiaoid", "13");
                map.put("issueno", "2018077");
                map.put("appkey", "d3a62ea686a062d5a5ba1b91fda4f1df");
                queue.add(VolleyRequestUtil.RequestWithParams("https://way.jd.com/jisuapi/query3", map, new VolleyRequestCllBack() {
                    @Override
                    public void onSuccess(String result) {
                        dialog.dismiss();
                        System.out.println(result);
                        Gson gson = new Gson();
                        Single dltGson = gson.fromJson(result, Single.class);
                        if (dltGson.getResult().getStatus().equals("0")) {
                            String[] split = dltGson.getResult().getResult().getNumber().split(" ");
                            tv1.setText(split[0]);
                            tv2.setText(split[1]);
                            tv3.setText(split[2]);
                            tv4.setText(split[3]);
                            tv5.setText(split[4]);
                            tv6.setText(split[5]);
                            tv7.setText(split[6]);
                        } else {
                            Toast.makeText(MainActivity.this, "服务器繁忙", Toast.LENGTH_SHORT).show();
                        }


                    }

                    @Override
                    public void onError(String error) {
                        Toast.makeText(MainActivity.this, "服务器繁忙，请重试！", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }));
            }
        }, 1200);
        ryMain.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        queue.add(VolleyRequestUtil.Request("https://way.jd.com/jisuapi/query3?caipiaoid=13&issueno=2018079&appkey=d3a62ea686a062d5a5ba1b91fda4f1df", new VolleyRequestCllBack() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                dialog.dismiss();
                SingleBonus singleBonus = gson.fromJson(result, SingleBonus.class);
                BonusAdapter adapters = new BonusAdapter(singleBonus.getResult().getResult().getPrize());
                ryMain.setAdapter(adapters);
            }

            @Override
            public void onError(String error) {
                dialog.dismiss();
            }
        }));

    }

    private static final String TAG = "MainActivity";

    @OnClick({R.id.ssc, R.id.dlt, R.id.syxw, R.id.qxc, R.id.qlc, R.id.pls, R.id.plw, R.id.ssq, R.id.news1, R.id.news2, R.id.news3, R.id.news4, R.id.news5, R.id.news6, R.id.news7, R.id.news8, R.id.news9, R.id.news10})
    public void onViewClicked(View view) {
        Intent intent = new Intent(MainActivity.this, SSCActivity.class);
        switch (view.getId()) {
            case R.id.ssc:
                intent.putExtra("id", "13");
                intent.putExtra("date", "2018077");
                intent.putExtra("name", ssc.getText().toString());
                startActivity(intent);
                break;
            case R.id.dlt:
                intent.putExtra("id", "17");
                intent.putExtra("date", "18196");
                intent.putExtra("name", dlt.getText().toString());
                startActivity(intent);
                break;
            case R.id.syxw:
                intent.putExtra("id", "14");
                intent.putExtra("date", "18086");
                intent.putExtra("name", syxw.getText().toString());
                startActivity(intent);
                break;
            case R.id.qxc:
                intent.putExtra("id", "11");
                intent.putExtra("date", "2018067");
                intent.putExtra("name", qxc.getText().toString());
                startActivity(intent);
                break;
            case R.id.qlc:
                intent.putExtra("id", "12");
                intent.putExtra("name", qlc.getText().toString());
                intent.putExtra("date", "2018067");
                startActivity(intent);
                break;
            case R.id.pls:
                intent.putExtra("id", "24");
                intent.putExtra("date", "2018084");
                intent.putExtra("name", pls.getText().toString());
                startActivity(intent);
                break;
            case R.id.plw:
                intent.putExtra("id", "17");
                intent.putExtra("name", plw.getText().toString());
                intent.putExtra("date", "18085");
                startActivity(intent);
                break;
            case R.id.ssq:
                intent.putExtra("id", "16");
                intent.putExtra("name", ssq.getText().toString());
                intent.putExtra("date", "18085");
                startActivity(intent);
                break;
            case R.id.news1:
                newIntent("头条");
                break;
            case R.id.news2:
                newIntent("新闻");
                break;
            case R.id.news3:
                newIntent("财经");
                break;
            case R.id.news4:
                newIntent("娱乐");
                break;
            case R.id.news5:
                newIntent("育儿");
                break;
            case R.id.news6:
                newIntent("军事");
                break;
            case R.id.news7:
                newIntent("教育");
                break;
            case R.id.news8:
                newIntent("NBA");
                break;
            case R.id.news9:
                newIntent("股票");
                break;
            case R.id.news10:
                newIntent("健康");
                break;
        }

    }

    private void newIntent(String code) {
        Intent intent = new Intent(MainActivity.this, NewActivity.class);
        intent.putExtra("code", code);
        startActivity(intent);
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
