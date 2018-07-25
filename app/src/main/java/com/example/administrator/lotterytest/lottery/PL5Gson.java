package com.example.administrator.lotterytest.lottery;

import java.util.List;

/**
 * Created by Administrator on 2018/7/22.
 */

public class PL5Gson {

    /**
     * code : 10000
     * charge : true
     * msg : 查询成功,扣费
     * result : {"status":"0","msg":"ok","result":{"total":"4131","start":"0","num":"10","caipiaoid":"17","list":[{"opendate":"2018-07-21","officialopendate":"","issueno":"18195","number":"4 8 4 0 8","refernumber":"","saleamount":"9512168","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"30","singlebonus":"100000"}]},{"opendate":"2018-07-20","officialopendate":"","issueno":"18194","number":"6 0 5 8 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-19","officialopendate":"","issueno":"18193","number":"3 8 2 3 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-18","officialopendate":"","issueno":"18192","number":"9 3 9 3 1","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"26","singlebonus":"100000"}]},{"opendate":"2018-07-17","officialopendate":"","issueno":"18191","number":"3 4 0 4 5","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"23","singlebonus":"100000"}]},{"opendate":"2018-07-16","officialopendate":"","issueno":"18190","number":"0 3 1 5 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"40","singlebonus":"100000"}]},{"opendate":"2018-07-15","officialopendate":"","issueno":"18189","number":"2 6 9 1 1","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"64","singlebonus":"100000"}]},{"opendate":"2018-07-14","officialopendate":"","issueno":"18188","number":"0 6 8 1 1","refernumber":"","saleamount":"9493570","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-13","officialopendate":"","issueno":"18187","number":"5 0 7 7 0","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"23","singlebonus":"100000"}]},{"opendate":"2018-07-12","officialopendate":"","issueno":"18186","number":"3 5 0 0 0","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"84","singlebonus":"100000"}]}]}}
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
         * result : {"total":"4131","start":"0","num":"10","caipiaoid":"17","list":[{"opendate":"2018-07-21","officialopendate":"","issueno":"18195","number":"4 8 4 0 8","refernumber":"","saleamount":"9512168","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"30","singlebonus":"100000"}]},{"opendate":"2018-07-20","officialopendate":"","issueno":"18194","number":"6 0 5 8 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-19","officialopendate":"","issueno":"18193","number":"3 8 2 3 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-18","officialopendate":"","issueno":"18192","number":"9 3 9 3 1","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"26","singlebonus":"100000"}]},{"opendate":"2018-07-17","officialopendate":"","issueno":"18191","number":"3 4 0 4 5","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"23","singlebonus":"100000"}]},{"opendate":"2018-07-16","officialopendate":"","issueno":"18190","number":"0 3 1 5 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"40","singlebonus":"100000"}]},{"opendate":"2018-07-15","officialopendate":"","issueno":"18189","number":"2 6 9 1 1","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"64","singlebonus":"100000"}]},{"opendate":"2018-07-14","officialopendate":"","issueno":"18188","number":"0 6 8 1 1","refernumber":"","saleamount":"9493570","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-13","officialopendate":"","issueno":"18187","number":"5 0 7 7 0","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"23","singlebonus":"100000"}]},{"opendate":"2018-07-12","officialopendate":"","issueno":"18186","number":"3 5 0 0 0","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"84","singlebonus":"100000"}]}]}
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
             * total : 4131
             * start : 0
             * num : 10
             * caipiaoid : 17
             * list : [{"opendate":"2018-07-21","officialopendate":"","issueno":"18195","number":"4 8 4 0 8","refernumber":"","saleamount":"9512168","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"30","singlebonus":"100000"}]},{"opendate":"2018-07-20","officialopendate":"","issueno":"18194","number":"6 0 5 8 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-19","officialopendate":"","issueno":"18193","number":"3 8 2 3 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-18","officialopendate":"","issueno":"18192","number":"9 3 9 3 1","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"26","singlebonus":"100000"}]},{"opendate":"2018-07-17","officialopendate":"","issueno":"18191","number":"3 4 0 4 5","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"23","singlebonus":"100000"}]},{"opendate":"2018-07-16","officialopendate":"","issueno":"18190","number":"0 3 1 5 9","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"40","singlebonus":"100000"}]},{"opendate":"2018-07-15","officialopendate":"","issueno":"18189","number":"2 6 9 1 1","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"64","singlebonus":"100000"}]},{"opendate":"2018-07-14","officialopendate":"","issueno":"18188","number":"0 6 8 1 1","refernumber":"","saleamount":"9493570","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"29","singlebonus":"100000"}]},{"opendate":"2018-07-13","officialopendate":"","issueno":"18187","number":"5 0 7 7 0","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"23","singlebonus":"100000"}]},{"opendate":"2018-07-12","officialopendate":"","issueno":"18186","number":"3 5 0 0 0","refernumber":"","saleamount":"0","totalmoney":"0","prize":[{"prizename":"排列五直选","require":"","num":"84","singlebonus":"100000"}]}]
             */

            private String total;
            private String start;
            private String num;
            private String caipiaoid;
            private List<ListBean> list;

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getCaipiaoid() {
                return caipiaoid;
            }

            public void setCaipiaoid(String caipiaoid) {
                this.caipiaoid = caipiaoid;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                /**
                 * opendate : 2018-07-21
                 * officialopendate :
                 * issueno : 18195
                 * number : 4 8 4 0 8
                 * refernumber :
                 * saleamount : 9512168
                 * totalmoney : 0
                 * prize : [{"prizename":"排列五直选","require":"","num":"30","singlebonus":"100000"}]
                 */

                private String opendate;
                private String officialopendate;
                private String issueno;
                private String number;
                private String refernumber;
                private String saleamount;
                private String totalmoney;
                private List<PrizeBean> prize;

                public String getOpendate() {
                    return opendate;
                }

                public void setOpendate(String opendate) {
                    this.opendate = opendate;
                }

                public String getOfficialopendate() {
                    return officialopendate;
                }

                public void setOfficialopendate(String officialopendate) {
                    this.officialopendate = officialopendate;
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
                     * prizename : 排列五直选
                     * require :
                     * num : 30
                     * singlebonus : 100000
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
}
