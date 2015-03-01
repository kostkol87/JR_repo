package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //Напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int readInt() throws Exception
    {
        //Напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();

    }

    public static double readDouble() throws Exception
    {
        //Напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();

    }

    public static void readLn() throws Exception
    {
        //Напишите тут ваш код
        readString();

    }
}
