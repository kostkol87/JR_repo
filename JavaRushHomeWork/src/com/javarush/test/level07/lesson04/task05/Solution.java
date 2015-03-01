package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < bigArr.length; i++)
        {
            bigArr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < bigArr.length; i++)
        {
            if (i<10){
                arr1[i]=bigArr[i];
            }   else {
                arr2[i-10]=bigArr[i];
            }
        }
        for (int x : arr2){
            System.out.println(x);
        }

    }
}
