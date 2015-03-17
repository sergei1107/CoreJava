package Fundamental;

import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Created by Сергей on 11.03.2015.
 */
public class Fundamental {
    enum Size {SMALL,MEDIUM};

    public static void main(String[] args) {
//Integer Types byte
        Size sz = Size.MEDIUM;
        System.out.println( sz.name());
        int i = 4; //2billion
        short s = 2;//-32768 to 32676
        long l = 8;// 9* 10.pow(18)
        byte b =1;//-128 to 127
//floating point
        float f = (float) 4.0;
        double d = 8;
     //logical operation && || <  > <= >=
        StrictMath strictMath ;// for more pricahe counting
        int n = 12345555;
        float fn =(float) n;
        System.out.println(fn);
        //Enum type


    }
}
