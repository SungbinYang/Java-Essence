package me.sungbin.ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : InnerEx7
 * @date : 2022/06/25
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/25       rovert         최초 생성
 */

public class InnerEx7 {
    public static void main(String[] args) {
        Button button = new Button("Start");
        button.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!");
    }
}
