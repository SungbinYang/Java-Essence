package me.sungbin.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : MessageFormatEx4
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class MessageFormatEx4 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        String tableName = "CUST_INFO";
        String fileName = "data4.txt";
        String msg = "INSERT INTO " + tableName + " VALUES ({0}, {1}, {2}, {3});";

        Scanner s = new Scanner(new File(fileName));

        String pattern = "{0}, {1}, {2}, {3}";
        MessageFormat mf = new MessageFormat(pattern);

        while (s.hasNextLine()) {
            String line = s.nextLine();
            Object[] objs = mf.parse(line);
            System.out.println(MessageFormat.format(msg, objs));
        }

        s.close();
    }
}
