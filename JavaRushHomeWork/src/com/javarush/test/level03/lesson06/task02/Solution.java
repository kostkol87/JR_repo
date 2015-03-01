package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран надпись: таблицу умножения 10 на 10:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        for (int i = 1; i <= 10; i++){
            System.out.println();
            for (int k = 1; k <= 10; k++){
                System.out.print(i*k+" ");
            }
        }

    }
}