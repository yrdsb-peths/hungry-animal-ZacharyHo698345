import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Dog extends Actor
{
    String name;
    
    public Dog(String name)
    {
        this.name = name;
    }

    public void act()
    {
        
        if(Greenfoot.isKeyDown("a")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("d")){
            move(4);
        }
        if(isTouching(Fruit.class)){
            removeTouching(Fruit.class);
            placeFruit();
        }
    }

}

