package com.ooj.comp;

public class Main {
    public static void warmup1(){
        for(int i = 100; i > 0; i-= 5){
            System.out.println(i);
        }

        for(int i = 0; i < 100; i += 10){
            System.out.println(i);
        }
        for(int i = 0; i < 100; i += 10){
            if(i % 20 == 0) {
                System.out.println(i+" Java");
            }else{
                System.out.println(i);
            }
        }
    }
    public static boolean timeToSki(int depth){
        if(depth > 30){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(timeToSki(1));

    }

}
