package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        boolean isExit = false;
        int result = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (!isExit){
            String summ = bufferedReader.readLine();
            if (summ.equals("сумма")){
                System.out.println(result);
                isExit=true;
            }else {
                result+=Integer.parseInt(summ);
            }
        }
    }
}
