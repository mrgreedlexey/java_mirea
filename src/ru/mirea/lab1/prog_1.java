package ru.mirea.lab1;
import java.util.Scanner;

public class prog_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of length array: ");
        int num = in.nextInt();
        int[] a = new int [num];
        System.out.print("I");
        for (int i = 0; i < num; i++)
        {

            a[i] = in.nextInt();
        }
        for(int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (a[i] < a[j])
                {
                    int k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
        }
        for (int i = 0; i < num; i++)
            System.out.println(a[i]);

    }
}
