package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = Solution.createMap();
        Solution.removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() +" : " +pair.getValue());
        }
    }
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        {
            Set<String> setNames = new HashSet<String>();
            Set<String> duplicateNames = new HashSet<String>();

            for ( Map.Entry<String, String> pair : map.entrySet() )
            {
                String name = pair.getValue();

                if ( setNames.contains( name ) )
                {
                    duplicateNames.add( name );
                }
                else
                {
                    setNames.add( name );
                }
            }

            for ( String name : duplicateNames )
            {
                removeItemFromMapByValue( map, name );
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
