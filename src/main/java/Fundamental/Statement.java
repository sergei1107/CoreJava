package Fundamental;

import java.util.*;

/**
 * Created by Сергей on 11.03.2015.
 *///
public class Statement {


    public static void main(String[] args) {
     /*   if(4>3){
            System.out.println("Statement.main");
        }
        else if (5<2) {
            System.out.println("true = " + true);
        }
        do
        {
            int in = 3;
        }
        while(4<1);

        for(int i =0;i<3;i++)
            System.out.println("Statement.main");
*/
     /*   long i = 0;
        for(double di = 0.0;di!=10;di+=0.1)
            i++;
        System.out.println(i);*/

/*

        switch (4*/
/* char,int,byte,short *//*
){
            case 1:
                System.out.println("Statement.main");
                break;
            case 2:
                System.out.printf("sasa");

        }


        Map<String,Integer> map = new LinkedHashMap<String,Integer>();

        for(int i =0;i<1000000;i++) {
                StringBuilder sb = new StringBuilder();
            for(int j=0;j<6;j++) {
                int ran = (int)(Math.random()*56);
                String string = String.valueOf(ran);
                sb.append(string);
                continue;
            }

            String lotterynumber = sb.toString();
           if( map.containsKey(lotterynumber)) {
             Integer in = (Integer) map.get(lotterynumber);
               in++;
               map.remove(lotterynumber);
               map.put(lotterynumber,in);
           }else map.put(lotterynumber,1);





        }

        System.out.println(map);

        Arrays.



        }
*/


        int[][] i = {{1,2,3,4,5,6,},{1,3,7,4}};
        System.out.println(Arrays.deepToString(i));
        System.out.println(i[0][0]);
        System.out.println(i[0][1]);
        System.out.println(i[0][2]);
        System.out.println(i[0][3]);
        System.out.println(i[0][4]);
        System.out.println(i[1][0]);
        System.out.println(i[1][1]);
        System.out.println(i[1][2]);
    }

    }






