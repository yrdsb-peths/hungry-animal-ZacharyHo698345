import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    String name;
    
    public Pig(String name)
    {
        this.name = name;
    }

    public void act()
    {
        
        if(Greenfoot.isKeyDown("1")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("3")){
            move(4);
        }
        if(isTouching(Fruit.class)){
            removeTouching(Fruit.class);
            
        }
    }

}   

