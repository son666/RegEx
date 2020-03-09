package ru.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
*
* Символьные классы []
 */
public class CharacterClassesLesson {
    public static void main(String[] args) {

        /*
        * ]\^- специальные символы для классов симоволо []
        * [a-zA-Z0-9] цифры и буквы
        * [+] найдет "+"
         */
        Pattern p = Pattern.compile("[0-5a-zA-Z%_=]");
        Matcher m = p.matcher("abcdc49%_=");
        while (m.find()) {
            System.out.print(m.start() + "-" + m.group() + " ");
        }

        //
        Pattern p1 = Pattern.compile("gr[ae]y");
        Matcher m1 = p1.matcher("gray");
        while (m1.find()) {
            System.out.print(m1.start() + "-" + m1.group() + " ");
        }

        //
        Pattern p2 = Pattern.compile("q[^u]"); //отрицание u после q
        Matcher m2 = p2.matcher("Iraq is a country");
        while (m2.find()) {
            System.out.print(m2.start() + "-" + m2.group() + " ");
        }

        // [\\x] [x^] [^]x] [-x] [x-]
        // [\Q[-]\E] ищем один из трех символов
        Pattern p3 = Pattern.compile("[x^]"); //Отрицание уже не работает т.к ^ после x
        Matcher m3 = p3.matcher("x");
        while (m3.find()) {
            System.out.print(m3.start() + "-" + m3.group() + " ");
        }

        /*
        * \d - [0-9]      \D - [^d\]
        * \w - [a-zA-Z]   \W - [^w\]
        * \s - [ \t]      \S - [^s\]
        * [\s\d] или пробел ил цифра
        * [\D\S] соответствует всему
        */
        Pattern p4 = Pattern.compile("\\d"); //тоже самое [0-9]
        Matcher m4 = p4.matcher("xasd5g67");
        while (m4.find()) {
            System.out.print(m4.start() + "-" + m4.group() + " ");
        }

        Pattern p5 = Pattern.compile("[0-9]+"); //цифры в тексте или слове идут подряд
        Matcher m5 = p5.matcher("xasd1223ыв3456");
        while (m5.find()) {
            System.out.print(m5.start() + "-" + m5.group() + " ");
        }
    }
}
