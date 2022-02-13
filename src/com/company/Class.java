package com.company;
/*Class деген класс тузунуз
        ал класстын номер деген бутун сан сактаган, соз деген соз сактаган жана массив деген сан сактаган массив бар
        конструктор жазыныз
        мейн методтон Classтын объектисин тузунуз
        объекттин полелерине конструктор аркылуу маани бериниз
        ошол объекттин полелерин консольго чыгарыныз.*/

import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private static int[] ints;


    public static void allInfo() {
        for (int counterInt : ints) {
            System.out.print(counterInt + " ");
        }

    }

    public Class(int number, String word, int[] ints) {
        this.number = number;
        this.word = word;
        this.ints = ints;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

}
