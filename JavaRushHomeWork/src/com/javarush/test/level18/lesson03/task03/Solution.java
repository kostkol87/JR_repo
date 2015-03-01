package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String fileName = bufferedReader.readLine();

        int[] bytes = new int[128];             //array to count bytes

        File file = new File(fileName);
        FileInputStream fos = new FileInputStream(file);
        while (fos.read()!=-1){
           arr.add(fos.read());
        }

        for (Integer x : arr){
            if (x>=0 && x<128)
            bytes[x]+=1;
        }
        int tmp = 0;
        for(int x : bytes){
            if (x>tmp) tmp=x;
        }
        int whatAByte=-1;
        for (int i = 0; i < bytes.length; i++)
        {
            if (bytes[i]==tmp) whatAByte=i;
        }
        System.out.println(whatAByte);

    }

}
