package com.Test0000;


import java.util.*;

public class SakthiTest {


    public static void main(String[] args) {



        String name="love";

        HashMap <Character,Integer> map=new HashMap<>();

        char names[]=name.toCharArray();

        for(char c:names){


            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }

            else map.put(c,1);


        }

        System.out.println(map);


    }
}
