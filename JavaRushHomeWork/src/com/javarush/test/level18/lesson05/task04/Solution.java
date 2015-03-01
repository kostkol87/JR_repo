package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(bufferedReader.readLine());
        File file2 = new File(bufferedReader.readLine());
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        byte[] buff = new byte[fis.available()];
        byte[] reverse = new byte[buff.length];
        while (fis.available()>0){
            fis.read(buff);
        }
        for (int i = 0; i < buff.length; i++)
        {
            reverse[i]=buff[buff.length-i-1];
        }
        fos.write(reverse);



    }
}
