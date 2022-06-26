package me.sungbin.ch07;

import java.awt.*;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : InnerEx8
 * @date : 2022/06/25
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/25       rovert         최초 생성
 */

public class InnerEx8 {
    public static void main(String[] args) {
        Button button = new Button("Start");
        button.addActionListener(e -> System.out.println("Action Event occurred!"));
    }
}
