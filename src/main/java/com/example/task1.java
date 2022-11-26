//Задача 1 Вычислить n-ое треугольного число(сумма чисел от 1 до n),n!(произведение чисел от 1 до n)

package com.example;

import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the sum of all integers from 1 to n program");
        System.out.println("=================================================");
        System.out.print("Please enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.print(i + "+");
            sum += i;
        }
        sum += n;
        System.out.print(n + "=" + sum);
    }
}

// public class task1{
// static int calculateFactorial(int n) {
// int result = 1;
// for (int i = 1; i <= n; i++) {
// result = result * i;
// }
// return result;
// }

// public static void main(String[] args) {
// System.out.println(calculateFactorial(4));
// }
// }