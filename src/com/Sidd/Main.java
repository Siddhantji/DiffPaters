package com.Sidd;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows you want.");
        int num = sc.nextInt();
//        int h =0;
        System.out.println("Choose the patterns you want.");
        System.out.println("1 :- If you want pattern to decrease columns left to right");
        System.out.println("2 :- If you want pattern to decrease columns right to left");
        System.out.println("3 :- If you want both");
        System.out.println("4 :- If you want vertical pyramid.");
        System.out.println("5 :- If you want right hand triangle.");
        System.out.println("6 :- If you want downwards right hand triangle.");
        System.out.println("7 :- If you want triangle with gaps.");
        int a = sc.nextInt();
        switch (a) {
            case 1 -> lToR(num);
            case 2 -> rToL(num);
            case 3 -> both(num);
            case 5 -> rTriangle(num );
            case 6 -> orTriangle(num);
            case 4 -> vaTriangle(num);
            case 7 -> gTriangle(num);
        }

    }
    static void lToR(int m){
        for(int i =0; i < m; i++){
            System.out.println();
            for(int j = 0 ; j< i; j++){
                System.out.print(" ");
            }
            for(int j = i ; j < m; j++){
                System.out.print("*");
            }
        }
    }
    static void rToL(int m){
        for(int i =0; i < m; i++){
            System.out.println();
            for(int j = i ; j < m; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j< i; j++){
                System.out.print(" ");
            }

        }
    }
    static void vaTriangle(int m){
        rTriangle(m);
//        int c =1;
        orTriangle(m );
        }


    static void both(int m){
        lToR(m);System.out.println();
        rToL(m);
    }
    static void rTriangle(int m){
        for(int i = 0 ; i < m ; i++){
            for(int j  = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void orTriangle(int m  ){
        for(int i = m ; i > 0 ; i--){
            for( int j = 0;j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void gTriangle(int m){
        System.out.println("*");
        for(int i = 2 ; i < m; i++) {
            System.out.print("*");
            for(int j = 2 ; j <i ; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i = 0 ; i < m; i++){
            System.out.print("*");
        }
    }
}
