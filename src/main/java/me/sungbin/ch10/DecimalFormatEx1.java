package me.sungbin.ch10;

import java.text.DecimalFormat;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : DecimalFormatEx1
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class DecimalFormatEx1 {
    public static void main(String[] args) {
        double number = 1234567.89;
        String[] pattern = {
                "0", "#", "0.0", "#.#",
                "0000000000.0000",
                "##########.####",
                "#.#-", "-#.#",
                "#,###.##", "#,####.##",
                "#E0", "0E0", "##E0", "00E0",
                "####E0", "0000E0", "#.#E0", "0.0E0",
                "0.000000000E0",
                "00.00000000E0",
                "000.0000000E0",
                "#.#########E0",
                "##.########E0",
                "###.#######E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "#.#\u2030",
                "\u00A4 #,###",
                "'#'#,###",
                "''#,###"
        };

        for (String s : pattern) {
            DecimalFormat df = new DecimalFormat(s);
            System.out.printf("%19s : %s\n", s, df.format(number));
        }
    }
}
