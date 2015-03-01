package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> map = Solution.createMap();
        Solution.removeAllSummerPeople(map);
        for (Map.Entry<String, Date>pair : map.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Путин", new Date("SEPTEMBER 1 1980"));
        map.put("Михайлов", new Date("FEBRUARY 1 1980"));
        map.put("Каюзон", new Date("JUNE 1 1980"));
        map.put("Медведев", new Date("DECEMBER 1 1980"));
        map.put("Альюатросов", new Date("JUNE 1 1980"));
        map.put("Череззаборногузадерищенко", new Date("MARCH 1 1980"));
        map.put("Нунихренасебефамилия", new Date("JUNE 1 1980"));
        map.put("Бухайло", new Date("MAY 1 1980"));
        map.put("ТерминатАйлбибеков", new Date("JUNE 1 1980"));

        //Напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator  = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();
            Date value = pair.getValue();
            if (value.getMonth() == 05 || value.getMonth() == 06 || value.getMonth() == 07){
                iterator.remove();
            }
        }

    }
}
