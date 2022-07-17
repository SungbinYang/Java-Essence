package me.sungbin.ch10;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : MessageFormatEx3
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class MessageFormatEx3 {
    public static void main(String[] args) throws ParseException {
        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('jacob', '02-123-4567', 27, '07-09');",
                "INSERT INTO CUST_INFO VALUES ('robert', '032-333-1234', 33, '10-07');"
        };

        String pattern = "INSERT INTO CUST_INFO VALUES ({0}, {1}, {2}, {3});";
        MessageFormat mf = new MessageFormat(pattern);

        for (int i = 0; i < data.length; i++) {
            Object[] objs = mf.parse(data[i]);

            for (int j = 0; j < objs.length; j++) {
                System.out.print(objs[j] + ",");
            }
            System.out.println();
        }
    }
}
