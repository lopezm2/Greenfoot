import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bill extends Actor
{
    public int score;
    /**
     * Act - do whatever the Bill wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        lose();
        setRotation(90);
        counter();
    }    
    public void movement()
    { 
        if (Greenfoot.getRandomNumber(100)>50)
        {
            move(1); 
        }
    }
    public void lose()
    {
        if ( isAtEdge() )
        {
            Greenfoot.stop();
            getWorld().showText("You Lose", 250,200) ;
        }
    }
    public void counter()
    {
        if ( isTouching(bullet.class) )
        {
            removeTouching(bullet.class);
            setLocation(490,690);
        }
    }
    public void getScore()
    {
        if (isTouching(ant.class))
        {
            getWorld().removeObject(this);
        }
    }
}

