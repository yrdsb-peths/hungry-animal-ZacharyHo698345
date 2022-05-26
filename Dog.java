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
    GreenfootImage[] idle = new GreenfootImage[5];
    
    public Dog()
    {
        for(int i=0; i<5; i++)
        {
            idle[i] = new GreenfootImage("images/dog_idle/tile00" + i +".png");
        }
        setImage(idle[0]);
        
    }
    int imageIndex = 0;
    public void animateDog()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
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
            MyWorld world = (MyWorld) getWorld();
            world.placeFruit();
            world.increaseScore();
            Greenfoot.playSound("sounds/bearmp3.mp3");
        }
        if(isTouching(Fruit2.class)){
            removeTouching(Fruit2.class);
            MyWorld world = (MyWorld) getWorld();
            world.placeFruit2();
            world.increaseScore();
            Greenfoot.playSound("sounds/bearmp3.mp3");
        }
        
    }

}

