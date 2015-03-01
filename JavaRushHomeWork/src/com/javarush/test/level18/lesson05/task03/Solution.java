package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую половину.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(bufferedReader.readLine());
        File file2 = new File(bufferedReader.readLine());
        File file3 = new File(bufferedReader.readLine());

        FileInputStream fis = new FileInputStream(file1);

        FileOutputStream fos2 = new FileOutputStream(file2);
        FileOutputStream fos3 = new FileOutputStream(file3);

        while (fis.available()>0){

            if (fis.available()%2==0){
                byte[] buff1= new byte[fis.available()/2];
                byte[] buff2= new byte[fis.available()/2];
                int count1 = fis.read(buff1);
                int count2 = fis.read(buff2);
                fos2.write(buff1,0,count1);
                fos3.write(buff1,0,count2);
            }else {
                byte[] buff1 = new byte[fis.available()/2+1];
                byte[] buff2 = new byte[fis.available()/2];
                int count1 = fis.read(buff1);
                int count2 = fis.read(buff2);
                fos2.write(buff1,0,count1);
                fos3.write(buff1,0,count2);
            }

        }

        bufferedReader.close();
        fis.close();
        fos2.close();
        fos3.close();

    }
}
