//Варіант 13
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num = 0;
	//do
	//{
	 System.out.println("Введить вік(20-69)");
	 num = in.nextByte();
    //}
	//while (num<20 || num > 69);
        switch (num) {
            case 21,31,41,51,61:
                System.out.println(num + " рік");
                break;
            case 22,23,24,32,33,34,42,43,44,52,53,54,62,63,64:
                System.out.println(num + " роки");
                break;
            case 25,26,27,28,29,30,35,36,37,38,39,40,45,46,47,48,49,50,55,56,57,58,59,60,65,66,67,68,69:
                System.out.println(num + " років");
                break;
            default:
                System.out.println("Не в діапазоні заданих чисел");
        }
    }
}
