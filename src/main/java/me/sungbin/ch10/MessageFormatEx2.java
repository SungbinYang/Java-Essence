package me.sungbin.ch10;

import java.text.MessageFormat;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : MessageFormatEx2
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', {2}, ''{3}'');";

        Object[][] arguments = {
                {"양성빈", "02-123-4567", "27", "05-22"},
                {"김프로", "032-333-1234", "33", "10-07"}
        };

        for (Object[] argument : arguments) {
            String result = MessageFormat.format(msg, argument);
            System.out.println(result);
        }
    }
}
