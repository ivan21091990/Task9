package com.itProger;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива и нажмите Enter: ");

        int x = scanner.nextInt();
        int array[] = new int[x];

        for(int i = 0; i< array.length; i++)
        {
            System.out.println("Введите " + (i+1) + "-е число и нажмите Enter: ");
            array[i] = scanner.nextInt();
        }

        int i=1;

        for (int element: array)
        {
            System.out.println("Вывод " + (i++) + "-го числа, умноженного на 2:");
            System.out.println(element*2);
        }
    }
}
