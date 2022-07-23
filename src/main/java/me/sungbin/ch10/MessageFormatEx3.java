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

        for (String datum : data) {
            Object[] objs = mf.parse(datum);

            for (Object obj : objs) {
                System.out.print(obj + ",");
            }
            System.out.println();
        }
    }
}
