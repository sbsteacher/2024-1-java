package com.green.day23;

//Vo (Value Object)
public class BuySelVo {
    private String memId;
    private int buyCount;

    public BuySelVo(String memId, int buyCount) {
        this.memId = memId;
        this.buyCount = buyCount;
    }

    public String getMemId() {
        return memId;
    }

    public int getBuyCount() {
        return buyCount;
    }

    @Override
    public String toString() {
        return "BuySelVo{" +
                "memId='" + memId + '\'' +
                ", buyCount=" + buyCount +
                '}';
    }
}
