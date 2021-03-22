package com.company;

import java.util.Arrays;

/**
 * Программа выводит текст
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Task 1 ===");
        System.out.println("Starting project");
        System.out.println();

        System.out.println("=== Task 2.1-2 ===");
        byte v_b = 1;
        System.out.println("This is a byte: " + v_b);
        short v_sh = 10;
        System.out.println("This is a short: " + v_sh);
        char v_ch = 'a';
        System.out.println("This is a char: " + v_ch);
        int v_i = 10000;
        System.out.println("This is an int: " + v_i);
        long v_l = 1000000;
        System.out.println("This is a long: " + v_l);
        float v_fl = 0.6f;
        System.out.println("This is a float: " + v_fl);
        double v_d = 0.05;
        System.out.println("This is a double: " + v_d);
        boolean v_bl = true;
        System.out.println("This is a boolean: " + v_bl);
        System.out.println();

        System.out.println("=== Task 2.3 ===");
        byte v_byte = 120;
        System.out.println("This is a byte: " + v_byte);
        short v_short = 129;
        System.out.println("This is a short: " + v_short);
        char v_char = 'a';
        System.out.println("This is a char: " + v_char);
        int v_int = 65999;
        System.out.println("This is an int: " + v_int);
        long v_long = 4294967296l;
        System.out.println("This is a long: " + v_long);
        float v_float = 0.33333334f;
        System.out.println("This is a float: " + v_float);
        double v_double = 0.3333333333333333;
        System.out.println("This is a double: " + v_double);
        boolean v_boolean = true;
        System.out.println("This is a boolean: " + v_boolean);
        System.out.println();

        System.out.println("=== Task 3.1 ===");
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('a' + i));
        }
        System.out.println();
        System.out.println();

        System.out.println("=== Task 3.2 ===");
        long begin = new java.util.Date().getTime();
        int n = 0;
        while (n != 100000000)
            n++;
        long end = new java.util.Date().getTime();
        System.out.println("with int: " + (end - begin));
        begin = new java.util.Date().getTime();
        long m = 0;
        while (m != 100000000)
            m++;
        end = new java.util.Date().getTime();
        System.out.println("with long: " + (end - begin));
        System.out.println();

        System.out.println("=== Task 5.1 ===");
        int[] mas = {12, 43, 12, -65, 778, 123, 32, 76};
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i]) max = mas[i];
        }
        System.out.println("answer: " + max);
        System.out.println();

        System.out.println("=== Task 5.2 ===");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j]=(int)Math.round(Math.random()*10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] Tmatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                Tmatrix[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(Tmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
