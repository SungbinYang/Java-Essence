package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : PolyArgumentTest2
 * @date : 2022/06/19
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/19       rovert         최초 생성
 */

class Product2 {
    int price;
    int bonusPoint;

    public Product2() {
    }

    public Product2(int price) {
        this.price = price;
        this.bonusPoint = (int) (this.price / 10.0);
    }
}

class Tv3 extends Product2 {
    public Tv3() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    public Computer2() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product2 {
    public Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;

    Product2[] item = new Product2[10];

    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;

        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (Product2 product2 : item) {
            if (product2 == null) break;

            sum += product2.price;
            itemList += product2 + ", ";
        }

        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv3());
        b.buy(new Computer2());
        b.buy(new Audio());
        b.summary();
    }
}
