package me.sungbin.ch11;

import java.util.Properties;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : PropertiesEx4
 * @date : 2022/07/31
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/31       rovert         최초 생성
 */

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();

        System.out.println("java.version : " + sysProp.getProperty("java.version"));
        System.out.println("user.language : " + sysProp.getProperty("user.language"));

        sysProp.list(System.out);
    }
}
