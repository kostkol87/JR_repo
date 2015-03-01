package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        boolean isExit=false;
        while (!isExit){
            int num = Integer.parseInt(bufferedReader.readLine());
            sum+=num;
            if (num==(-1)){
                isExit=true;
                System.out.println(sum);
            }
        }
    }
}
