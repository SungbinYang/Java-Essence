package me.sungbin.ch11;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : PropertiesEx1
 * @date : 2022/07/31
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/31       rovert         최초 생성
 */

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while (e.hasMoreElements()) {
            String element = (String) e.nextElement();
            System.out.println("element = " + prop.getProperty(element));
        }

        System.out.println();
        prop.setProperty("size", "20");

        System.out.println("size = " + prop.getProperty("size"));
        System.out.println("capacity = " + prop.getProperty("capacity", "20"));
        System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));

        System.out.println(prop);
        prop.list(System.out);
    }
}
