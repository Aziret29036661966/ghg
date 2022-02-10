package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner df = new Scanner(System.in);
        int n = df.nextInt();
        System.out.println("Ваши числа: " + y(n));
    }
    static int y(int n)
    {
        int sum = 0, j = 1;
        for (int i = 1; i <= n; i++)
        {
            sum = sum + j;
            j = (j * 10);
        }

        return sum;
    }
}

