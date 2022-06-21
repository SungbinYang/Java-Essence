package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : ParserTest
 * @date : 2022/06/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/20       rovert         최초 생성
 */

interface Parseable {
    public abstract void parse(String filename);
}

class ParserManager {
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();

            return p;
        }
    }
}

class XMLParser implements Parseable {

    @Override
    public void parse(String filename) {
        System.out.println(filename + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {

    @Override
    public void parse(String filename) {
        System.out.println(filename + "- HTML parsing completed");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");

        parser = ParserManager.getParser("HTML");
        parser.parse("index.html");
    }
}
