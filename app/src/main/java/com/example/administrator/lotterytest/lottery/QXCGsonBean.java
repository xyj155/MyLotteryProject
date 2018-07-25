package com.example.administrator.lotterytest.lottery;

import java.util.List;

/**
 * Created by Administrator on 2018/7/22.
 */

public class QXCGsonBean {

    /**
     * code : 10000
     * charge : true
     * msg : 查询成功,扣费
     * result : {"status":"0","msg":"ok","result":{"total":"4739","start":"0","num":"10","caipiaoid":"12","list":[{"opendate":"2018-03-14","officialopendate":"","issueno":"2018066","number":"0 9 5","refernumber":"2 4 6","saleamount":"47555650","totalmoney":"15198428","prize":[{"prizename":"直选","require":"定位中3码","num":"9959","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"23895","singlebonus":"173"}]},{"opendate":"2018-03-13","officialopendate":"","issueno":"2018065","number":"8 4 8","refernumber":"1 9 8","saleamount":"47186352","totalmoney":"27281010","prize":[{"prizename":"直选","require":"定位中3码","num":"17384","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"23787","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-12","officialopendate":"","issueno":"2018064","number":"3 3 9","refernumber":"4 0 6","saleamount":"48205822","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"17713","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"16369","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-11","officialopendate":"","issueno":"2018063","number":"6 1 3","refernumber":"9 8 9","saleamount":"46520988","totalmoney":"29052846","prize":[{"prizename":"直选","require":"定位中3码","num":"21064","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"37041","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-10","officialopendate":"","issueno":"2018062","number":"7 9 2","refernumber":"2 1 7","saleamount":"44589900","totalmoney":"15042647","prize":[{"prizename":"直选","require":"定位中3码","num":"9493","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"26913","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-09","officialopendate":"","issueno":"2018061","number":"5 2 5","refernumber":"6 4 2","saleamount":"46719902","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"18534","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"15522","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-08","officialopendate":"","issueno":"2018060","number":"7 6 7","refernumber":"4 5 3","saleamount":"46477714","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"13530","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"13990","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-07","officialopendate":"","issueno":"2018059","number":"9 4 7","refernumber":"7 0 2","saleamount":"47146198","totalmoney":"13567692","prize":[{"prizename":"直选","require":"定位中3码","num":"8263","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"26048","singlebonus":"173"}]},{"opendate":"2018-03-06","officialopendate":"","issueno":"2018058","number":"7 2 3","refernumber":"3 0 4","saleamount":"45436898","totalmoney":"25759502","prize":[{"prizename":"直选","require":"定位中3码","num":"18104","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"36051","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-05","officialopendate":"","issueno":"2018057","number":"9 7 7","refernumber":"7 4 3","saleamount":"47393740","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"18573","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"23725","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]}]}}
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
         * result : {"total":"4739","start":"0","num":"10","caipiaoid":"12","list":[{"opendate":"2018-03-14","officialopendate":"","issueno":"2018066","number":"0 9 5","refernumber":"2 4 6","saleamount":"47555650","totalmoney":"15198428","prize":[{"prizename":"直选","require":"定位中3码","num":"9959","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"23895","singlebonus":"173"}]},{"opendate":"2018-03-13","officialopendate":"","issueno":"2018065","number":"8 4 8","refernumber":"1 9 8","saleamount":"47186352","totalmoney":"27281010","prize":[{"prizename":"直选","require":"定位中3码","num":"17384","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"23787","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-12","officialopendate":"","issueno":"2018064","number":"3 3 9","refernumber":"4 0 6","saleamount":"48205822","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"17713","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"16369","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-11","officialopendate":"","issueno":"2018063","number":"6 1 3","refernumber":"9 8 9","saleamount":"46520988","totalmoney":"29052846","prize":[{"prizename":"直选","require":"定位中3码","num":"21064","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"37041","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-10","officialopendate":"","issueno":"2018062","number":"7 9 2","refernumber":"2 1 7","saleamount":"44589900","totalmoney":"15042647","prize":[{"prizename":"直选","require":"定位中3码","num":"9493","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"26913","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-09","officialopendate":"","issueno":"2018061","number":"5 2 5","refernumber":"6 4 2","saleamount":"46719902","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"18534","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"15522","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-08","officialopendate":"","issueno":"2018060","number":"7 6 7","refernumber":"4 5 3","saleamount":"46477714","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"13530","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"13990","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-07","officialopendate":"","issueno":"2018059","number":"9 4 7","refernumber":"7 0 2","saleamount":"47146198","totalmoney":"13567692","prize":[{"prizename":"直选","require":"定位中3码","num":"8263","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"26048","singlebonus":"173"}]},{"opendate":"2018-03-06","officialopendate":"","issueno":"2018058","number":"7 2 3","refernumber":"3 0 4","saleamount":"45436898","totalmoney":"25759502","prize":[{"prizename":"直选","require":"定位中3码","num":"18104","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"36051","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-05","officialopendate":"","issueno":"2018057","number":"9 7 7","refernumber":"7 4 3","saleamount":"47393740","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"18573","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"23725","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]}]}
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
             * total : 4739
             * start : 0
             * num : 10
             * caipiaoid : 12
             * list : [{"opendate":"2018-03-14","officialopendate":"","issueno":"2018066","number":"0 9 5","refernumber":"2 4 6","saleamount":"47555650","totalmoney":"15198428","prize":[{"prizename":"直选","require":"定位中3码","num":"9959","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"23895","singlebonus":"173"}]},{"opendate":"2018-03-13","officialopendate":"","issueno":"2018065","number":"8 4 8","refernumber":"1 9 8","saleamount":"47186352","totalmoney":"27281010","prize":[{"prizename":"直选","require":"定位中3码","num":"17384","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"23787","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-12","officialopendate":"","issueno":"2018064","number":"3 3 9","refernumber":"4 0 6","saleamount":"48205822","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"17713","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"16369","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-11","officialopendate":"","issueno":"2018063","number":"6 1 3","refernumber":"9 8 9","saleamount":"46520988","totalmoney":"29052846","prize":[{"prizename":"直选","require":"定位中3码","num":"21064","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"37041","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-10","officialopendate":"","issueno":"2018062","number":"7 9 2","refernumber":"2 1 7","saleamount":"44589900","totalmoney":"15042647","prize":[{"prizename":"直选","require":"定位中3码","num":"9493","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"26913","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-09","officialopendate":"","issueno":"2018061","number":"5 2 5","refernumber":"6 4 2","saleamount":"46719902","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"18534","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"15522","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-08","officialopendate":"","issueno":"2018060","number":"7 6 7","refernumber":"4 5 3","saleamount":"46477714","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"13530","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"13990","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]},{"opendate":"2018-03-07","officialopendate":"","issueno":"2018059","number":"9 4 7","refernumber":"7 0 2","saleamount":"47146198","totalmoney":"13567692","prize":[{"prizename":"直选","require":"定位中3码","num":"8263","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"26048","singlebonus":"173"}]},{"opendate":"2018-03-06","officialopendate":"","issueno":"2018058","number":"7 2 3","refernumber":"3 0 4","saleamount":"45436898","totalmoney":"25759502","prize":[{"prizename":"直选","require":"定位中3码","num":"18104","singlebonus":"1040"},{"prizename":"组六","require":"不定位中3码","num":"36051","singlebonus":"173"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"}]},{"opendate":"2018-03-05","officialopendate":"","issueno":"2018057","number":"9 7 7","refernumber":"7 4 3","saleamount":"47393740","totalmoney":"0","prize":[{"prizename":"直选","require":"定位中3码","num":"18573","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"23725","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"0","singlebonus":"173"}]}]
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
                 * opendate : 2018-03-14
                 * officialopendate :
                 * issueno : 2018066
                 * number : 0 9 5
                 * refernumber : 2 4 6
                 * saleamount : 47555650
                 * totalmoney : 15198428
                 * prize : [{"prizename":"直选","require":"定位中3码","num":"9959","singlebonus":"1040"},{"prizename":"组三","require":"不定位中3码","num":"0","singlebonus":"346"},{"prizename":"组六","require":"不定位中3码","num":"23895","singlebonus":"173"}]
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
                     * prizename : 直选
                     * require : 定位中3码
                     * num : 9959
                     * singlebonus : 1040
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
