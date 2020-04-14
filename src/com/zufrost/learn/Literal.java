package com.zufrost.learn;

public class Literal {
    public static void main(String[] args) {

        //Отметьте 3 варианта правильного использования знака подчёркивания в представлении литералов
        double m1 = 5_000_000.75;
        System.out.println(m1);

        //wrong
        /*long m2 = _5_000_000;
        System.out.println(m2);*/

        //wrong
        /*int m =  0b_1010;
        System.out.println(m);*/

        int m4 = 5_000_000;
        System.out.println(m4);

        int m5 = 0_10;
        System.out.println(m5);

        //wrong
        /*int m6 = 5_000_000_;
        System.out.println(m6);*/

        //Какие из следующих идентификаторов являются корректными? Выберите 3
//        int 2int; //wrong
//        int int_#; //wrong
        int _int;
        int _2_;
        int $int;
//        int #int; //wrong


    }
}
