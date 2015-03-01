package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки ввода-вывода

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        int count=0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(bufferedReader.readLine());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        char[] tmp;
        while ((s = br.readLine())!= null){
            tmp = s.toCharArray();
            for (int i = 0; i < tmp.length; i++)
            {
                if (tmp[i] == 44){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
