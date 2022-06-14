package me.sungbin.ch06;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch06
 * @fileName : CarTest
 * @date : 2022/06/13
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/13       rovert         최초 생성
 */

class Car {
    String color;
    String gearType;
    int door;

    public Car() {
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}
