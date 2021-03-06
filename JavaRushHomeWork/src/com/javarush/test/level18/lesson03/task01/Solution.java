package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        int tmp = 0;
        File file = new File(fileName);
        FileInputStream fos = new FileInputStream(file);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (fos.read() !=-1){
            arr.add(fos.read());
        }
        fos.close();
        for (Integer x : arr){
            if (x>tmp) tmp=x;
        }
        System.out.println(tmp);

    }
}
