package com.green.day16.ch7;
//          문제 1
//        Product p = new Product(1000); //price=1000, bonusPoint=100
//        System.out.println(p); //price: 1000, bonusPoint: 100
//        Product p2 = new Product(500); //price=500, bonusPoint=50
//        System.out.println(p2); //price: 500, bonusPoint: 50

/*
        문제 2
        Tv tv = new Tv();
        System.out.println(tv); //Tv price: 100, bonusPoint: 10

        Computer com = new Computer();
        System.out.println(com);

        Sofa sofa = new Sofa();
        System.out.println(sofa);
         */

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());
        buyer.showMeTheMoney(); //haveMoney: ?, haveBonusPoint: ?
    }
}
class Buyer {
    private int haveMoney;
    private int haveBonusPoint;

    Buyer(int haveMoney) {
        this.haveMoney = haveMoney;
    }

    void buy(Product p) {
        haveMoney -= p.getPrice();
        haveBonusPoint += p.getBonusPoint();
        System.out.printf("%s을(를) 구매하였습니다.\n", p);
    }

    void showMeTheMoney() {
        System.out.printf("haveMoney: %,d, haveBonusPoint: %,d\n"
                , haveMoney, haveBonusPoint);
    }

}

class Sofa extends Product {
    Sofa() { super(80); }
    @Override
    public String toString() {
        return String.format("Sofa %s", super.toString());
    }
}

class Computer extends Product {
    Computer() { super(200); }
    @Override
    public String toString() {
        return String.format("Computer %s", super.toString());
    }
}


class Tv extends Product {
    Tv() { super(100); }
    @Override
    public String toString() {
        return String.format("Tv %s", super.toString());
    }
}

class Product {
    private final int price;
    private final int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("price: %,d, bonusPoint: %,d", price, bonusPoint);
    }
}
