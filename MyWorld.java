import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1);
        Dog k = new Dog("Kayvon");
        addObject(k, 100, 350);
        Pig r = new Pig("Raymond");
        addObject(r, 500, 350);

        for(int i = 0; i < 2; i++)
        {
            placeFruit();

        }
        for(int i = 0; i < 2; i++)
        {
            placeFruit2();

        }
    }

    public void placeFruit()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Fruit berry = new Fruit();
        addObject(berry, x, y);
    }

    public void placeFruit2()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Fruit2 apple = new Fruit2();
        addObject(apple, x, y);
    }

    public void elimFruit()
    {
        int y = getActor()
        if( y > 500)
        {
            removeObject(Fruit.class);
        }
    }
}