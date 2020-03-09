package ru.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
*
* Литераллы
*/
public class LiteralCharactersLesson {
    public static void main(String[] args) {
        // Символ
        Pattern p1 = Pattern.compile("a");
        Matcher m1 = p1.matcher("Jack is a boy");
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
        }
        //Слово
        Pattern p2 = Pattern.compile("cat");
        Matcher m2 = p2.matcher("About cat and dogs or cat");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group());
        }
        /*Special metacharacter
        * []\^$.|?*+()
        * Pattern p3 = Pattern.compile("1//+1=2");
        * Pattern p3 = Pattern.compile("\\Q1+1=2\\E");
        */
        Pattern p3 = Pattern.compile("1+1=2");
        Matcher m3 = p3.matcher("1+1=2");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group());
        }

    }
}
