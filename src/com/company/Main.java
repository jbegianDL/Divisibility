package com.company;

public class Main {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE; //sets max int for Java

        for(int num = 1; num < max; num++){
            //if num%range = 0 print out number
            if ((num%1)==0 && (num%2)==0 && (num%3)==0 && (num%4)==0 && (num%5)==0 && (num%6)==0 && (num%7)==0 && (num%8)==0 && (num%9)==0 && (num%10)==0){
                System.out.println(num);
                break; //breaks out at lowest number
            }
        }
    }
}

