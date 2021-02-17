import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ant extends Actor
{
    int score;
    
    /**
     * Act - do whatever the ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        win();
        getWorld().showText("Score: "+score,50,25);
        keepScore();
    }    
    public ant()
    {
    score=0;
    }
    public void keepScore()
    {
        if (isTouching(Bill.class))
        {
        score++;
        removeTouching(Bill.class);
        }
        
    }
    public int getTheScore()
    {
        return score;
    }
    public void win()
    {
    if (score == 35 )
    {
        Greenfoot.stop();
        getWorld().showText("You Win!",250,350);
    }
    }
}
