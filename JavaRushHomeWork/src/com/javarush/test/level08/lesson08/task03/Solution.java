package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Sidr");
        map.put("Mijalkov", "Mihail");
        map.put("Teterev", "Ivan");
        map.put("Putin", "Vova");
        map.put("Medvedev", "Dima");
        map.put("Baskov", "Kolya");
        map.put("Valuev", "Kolya");
        map.put("Smirnov", "Petr");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int count=0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if (value.equals(name)) count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        int count=0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if (key.equals(familiya)) count++;
        }
        return count;

    }
}
