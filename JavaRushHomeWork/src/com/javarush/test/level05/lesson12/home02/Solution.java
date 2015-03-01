package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man man1 = new Man("Man1", 12,"street1");
        Man man2 = new Man("Man2", 21,"street2");
        Woman woman1 = new Woman("woMan1", 21,"street1");
        Woman woman2 = new Woman("woMan2", 21,"street2");

        // Выведи их на экран тут
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    // Напиши тут свои классы
    public static class Man{
        String name, address;
        int age;


        Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }

    }
    public static class Woman{
        String name, address;
        int age;

        Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
}
