package me.sungbin.ch10;

import java.text.MessageFormat;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : MessageFormatEx1
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";
        Object[] arguments = {
                "양성빈", "02-123-4567", "27", "05-22"
        };

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
