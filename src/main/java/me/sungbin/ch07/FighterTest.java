package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : FighterTest
 * @date : 2022/06/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/20       rovert         최초 생성
 */

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {

}

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}

class Fighter extends Unit implements Fightable {

    @Override
    public void move(int x, int y) {
        // 내용 생력
    }

    @Override
    public void attack(Unit u) {
        // 내용 생력
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("f는 Unit클래스 하위타입입니다.");
        }

        if (f instanceof Fightable) {
            System.out.println("f는 Fightable 인터페이스를 구현하였습니다.");
        }

        if (f instanceof Movable) {
            System.out.println("f는 Movable 인터페이스를 구현했습니다.");
        }

        if (f instanceof Attackable) {
            System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
        }

        if (f instanceof Object) {
            System.out.println("f는 Object클래스의 하위 타입입니다.");
        }
    }
}
