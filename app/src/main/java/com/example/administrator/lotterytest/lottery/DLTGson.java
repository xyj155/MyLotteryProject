package com.example.administrator.lotterytest.lottery;

import java.util.List;

/**
 * Created by Administrator on 2018/7/22.
 */

public class DLTGson {

    /**
     * rows : 5
     * code : dlt
     * info : 免费接口随机延迟3-6分钟，实时接口请访问www.opencai.net查询、购买或续费
     * data : [{"expect":"2018084","opencode":"06,11,17,22,35+11,12","opentime":"2018-07-21 20:33:20","opentimestamp":1532176400},{"expect":"2018083","opencode":"07,12,25,27,28+10,11","opentime":"2018-07-18 20:33:20","opentimestamp":1531917200},{"expect":"2018082","opencode":"01,02,14,17,18+08,10","opentime":"2018-07-16 20:33:20","opentimestamp":1531744400},{"expect":"2018081","opencode":"02,10,13,21,35+01,12","opentime":"2018-07-14 20:33:20","opentimestamp":1531571600},{"expect":"2018080","opencode":"07,16,24,26,31+10,11","opentime":"2018-07-11 20:33:20","opentimestamp":1531312400}]
     */

    private int rows;
    private String code;
    private String info;
    private List<DataBean> data;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * expect : 2018084
         * opencode : 06,11,17,22,35+11,12
         * opentime : 2018-07-21 20:33:20
         * opentimestamp : 1532176400
         */

        private String expect;
        private String opencode;
        private String opentime;
        private int opentimestamp;

        public String getExpect() {
            return expect;
        }

        public void setExpect(String expect) {
            this.expect = expect;
        }

        public String getOpencode() {
            return opencode;
        }

        public void setOpencode(String opencode) {
            this.opencode = opencode;
        }

        public String getOpentime() {
            return opentime;
        }

        public void setOpentime(String opentime) {
            this.opentime = opentime;
        }

        public int getOpentimestamp() {
            return opentimestamp;
        }

        public void setOpentimestamp(int opentimestamp) {
            this.opentimestamp = opentimestamp;
        }
    }
}
