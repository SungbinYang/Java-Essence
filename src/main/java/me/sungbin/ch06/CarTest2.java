package me.sungbin.ch06;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch06
 * @fileName : CarTest2
 * @date : 2022/06/13
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/13       rovert         최초 생성
 */

class Car2 {
    String color;
    String gearType;
    int door;

    public Car2() {
        this("white", "auto", 4);
    }

    public Car2(String color) {
        this(color, "auto", 4);
    }

    public Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}
