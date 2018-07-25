package com.example.administrator.lotterytest.lottery;

import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */

public class SingleBonus {

    /**
     * code : 10000
     * charge : true
     * msg : 查询成功,扣费
     * result : {"status":"0","msg":"ok","result":{"caipiaoid":"13","issueno":"2018079","number":"03 09 10 15 24 26 27","refernumber":"01","opendate":"2018-07-09","deadline":"2018-09-07","saleamount":"5940646","totalmoney":"0","prize":[{"prizename":"一等奖","require":"中7+0","num":"25","singlebonus":"23961"},{"prizename":"二等奖","require":"中6+1","num":"45","singlebonus":"1901"},{"prizename":"三等奖","require":"中6+0","num":"1404","singlebonus":"400"},{"prizename":"四等奖","require":"中5+1","num":"1771","singlebonus":"200"},{"prizename":"五等奖","require":"中5+0","num":"18913","singlebonus":"50"},{"prizename":"六等奖","require":"中4+1","num":"16370","singlebonus":"10"},{"prizename":"七等奖","require":"中4+0","num":"118318","singlebonus":"5"}]}}
     */

    private String code;
    private boolean charge;
    private String msg;
    private ResultBeanX result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isCharge() {
        return charge;
    }

    public void setCharge(boolean charge) {
        this.charge = charge;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBeanX getResult() {
        return result;
    }

    public void setResult(ResultBeanX result) {
        this.result = result;
    }

    public static class ResultBeanX {
        /**
         * status : 0
         * msg : ok
         * result : {"caipiaoid":"13","issueno":"2018079","number":"03 09 10 15 24 26 27","refernumber":"01","opendate":"2018-07-09","deadline":"2018-09-07","saleamount":"5940646","totalmoney":"0","prize":[{"prizename":"一等奖","require":"中7+0","num":"25","singlebonus":"23961"},{"prizename":"二等奖","require":"中6+1","num":"45","singlebonus":"1901"},{"prizename":"三等奖","require":"中6+0","num":"1404","singlebonus":"400"},{"prizename":"四等奖","require":"中5+1","num":"1771","singlebonus":"200"},{"prizename":"五等奖","require":"中5+0","num":"18913","singlebonus":"50"},{"prizename":"六等奖","require":"中4+1","num":"16370","singlebonus":"10"},{"prizename":"七等奖","require":"中4+0","num":"118318","singlebonus":"5"}]}
         */

        private String status;
        private String msg;
        private ResultBean result;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public ResultBean getResult() {
            return result;
        }

        public void setResult(ResultBean result) {
            this.result = result;
        }

        public static class ResultBean {
            /**
             * caipiaoid : 13
             * issueno : 2018079
             * number : 03 09 10 15 24 26 27
             * refernumber : 01
             * opendate : 2018-07-09
             * deadline : 2018-09-07
             * saleamount : 5940646
             * totalmoney : 0
             * prize : [{"prizename":"一等奖","require":"中7+0","num":"25","singlebonus":"23961"},{"prizename":"二等奖","require":"中6+1","num":"45","singlebonus":"1901"},{"prizename":"三等奖","require":"中6+0","num":"1404","singlebonus":"400"},{"prizename":"四等奖","require":"中5+1","num":"1771","singlebonus":"200"},{"prizename":"五等奖","require":"中5+0","num":"18913","singlebonus":"50"},{"prizename":"六等奖","require":"中4+1","num":"16370","singlebonus":"10"},{"prizename":"七等奖","require":"中4+0","num":"118318","singlebonus":"5"}]
             */

            private String caipiaoid;
            private String issueno;
            private String number;
            private String refernumber;
            private String opendate;
            private String deadline;
            private String saleamount;
            private String totalmoney;
            private List<PrizeBean> prize;

            public String getCaipiaoid() {
                return caipiaoid;
            }

            public void setCaipiaoid(String caipiaoid) {
                this.caipiaoid = caipiaoid;
            }

            public String getIssueno() {
                return issueno;
            }

            public void setIssueno(String issueno) {
                this.issueno = issueno;
            }

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public String getRefernumber() {
                return refernumber;
            }

            public void setRefernumber(String refernumber) {
                this.refernumber = refernumber;
            }

            public String getOpendate() {
                return opendate;
            }

            public void setOpendate(String opendate) {
                this.opendate = opendate;
            }

            public String getDeadline() {
                return deadline;
            }

            public void setDeadline(String deadline) {
                this.deadline = deadline;
            }

            public String getSaleamount() {
                return saleamount;
            }

            public void setSaleamount(String saleamount) {
                this.saleamount = saleamount;
            }

            public String getTotalmoney() {
                return totalmoney;
            }

            public void setTotalmoney(String totalmoney) {
                this.totalmoney = totalmoney;
            }

            public List<PrizeBean> getPrize() {
                return prize;
            }

            public void setPrize(List<PrizeBean> prize) {
                this.prize = prize;
            }

            public static class PrizeBean {
                /**
                 * prizename : 一等奖
                 * require : 中7+0
                 * num : 25
                 * singlebonus : 23961
                 */

                private String prizename;
                private String require;
                private String num;
                private String singlebonus;

                public String getPrizename() {
                    return prizename;
                }

                public void setPrizename(String prizename) {
                    this.prizename = prizename;
                }

                public String getRequire() {
                    return require;
                }

                public void setRequire(String require) {
                    this.require = require;
                }

                public String getNum() {
                    return num;
                }

                public void setNum(String num) {
                    this.num = num;
                }

                public String getSinglebonus() {
                    return singlebonus;
                }

                public void setSinglebonus(String singlebonus) {
                    this.singlebonus = singlebonus;
                }
            }
        }
    }
}
