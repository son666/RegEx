package ru.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern p5 = Pattern.compile("[0-9]+"); //цифры идут подряд
        Matcher m5 = p5.matcher("xasd1223ыв3456");
        while (m5.find()) {
            System.out.print(m5.start() + "-" + m5.group() + " ");
        }
    }
}
