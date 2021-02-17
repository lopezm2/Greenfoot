import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    private int timer;
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
    }    

    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("space"))
        {
            fire();

        }

    }

    public void fire()
    {

        if (timer > 0) timer--; // run timer
        if (timer == 0 && Greenfoot.isKeyDown("space"))
        {
            bullet b = new bullet();
            getWorld().addObject( b , getX(), getY());
            timer = 10; 
        }
    }
}
