
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel = new Label(score, 80);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1, false);
        Dog k = new Dog("Kayvon");
        addObject(k, 100, 350);
        Pig r = new Pig("Raymond");
        addObject(r, 500, 350);

        for(int i = 0; i < 1; i++)
        {
            placeFruit();

        }
        for(int i = 0; i < 1; i++)
        {
            placeFruit2();

        }
        
        addObject(scoreLabel, 30, 30);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
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

    
}