package com.javarush.test.level03.lesson04.task01;

/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        int[] test = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(Solution.invert(test)));


    }
    public static int[] invert(int[] data){
        int[] tmp = new int[data.length];
        for (int i = data.length-1; i >=0 ; i--)
        {
            tmp[data.length-i-1]=data[i];

        }

        return tmp;
    }
}