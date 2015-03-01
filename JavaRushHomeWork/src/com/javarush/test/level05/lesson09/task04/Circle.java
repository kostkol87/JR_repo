package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- int centerX,int centerY,int radius ,int width,int color
*/

public class Circle
{
    //Напишите тут ваш код
    int centerX, centerY, radius , width, color ;

    Circle(int centerX,int centerY,int radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }

    Circle(int centerX,int centerY,int radius ,int width){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
    }

    Circle(int centerX,int centerY,int radius ,int width,int color){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }


}
