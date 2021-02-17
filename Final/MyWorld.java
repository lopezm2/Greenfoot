import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private ant ant;
    private int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1); 
        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,188,528);
        Wall wall2 = new Wall();
        addObject(wall2,225,526);
        Wall wall3 = new Wall();
        addObject(wall3,225,564);
        Wall wall4 = new Wall();
        addObject(wall4,225,564);
        Wall wall5 = new Wall();
        addObject(wall5,188,558);
        Wall wall6 = new Wall();
        addObject(wall6,268,537);
        Wall wall7 = new Wall();
        addObject(wall7,276,574);
        Wall wall8 = new Wall();
        addObject(wall8,317,539);
        wall5.setLocation(188,554);
        wall.setLocation(188,540);
        wall2.setLocation(218,540);
        wall3.setLocation(248,555);
        wall6.setLocation(248,540);
        wall7.setLocation(278,556);
        wall8.setLocation(278,541);
        wall4.setLocation(218,554);
        Bill bill = new Bill();
        addObject(bill,80,60);
        Bill bill2 = new Bill();
        addObject(bill2,140,60);
        Bill bill3 = new Bill();
        addObject(bill3,200,60);
        Bill bill4 = new Bill();
        addObject(bill4,260,60);
        Bill bill5 = new Bill();
        addObject(bill5,320,60);
        Bill bill6 = new Bill();
        addObject(bill6,380,60);
        Bill bill7 = new Bill();
        addObject(bill7,440,60);

        Bill bill8 = new Bill();
        addObject(bill8,80,120);
        Bill bill9 = new Bill();
        addObject(bill9,80,180);
        Bill bill10 = new Bill();
        addObject(bill10,80,240);
        Bill bill11 = new Bill();
        addObject(bill11,80,300);
        //ROW2
        Bill bill12 = new Bill();
        addObject(bill12,140,120);
        Bill bill13 = new Bill();
        addObject(bill13,200,120);
        Bill bill14 = new Bill();
        addObject(bill14,260,120);
        Bill bill15 = new Bill();
        addObject(bill15,320,120);
        Bill bill16 = new Bill();
        addObject(bill16,380,120);
        Bill bill17 = new Bill();
        addObject(bill17,440,120);
        //ROW3
        Bill bill18 = new Bill();
        addObject(bill18,140,180);
        Bill bill19 = new Bill();
        addObject(bill19,200,180);
        Bill bill20 = new Bill();
        addObject(bill20,260,180);
        Bill bill21 = new Bill();
        addObject(bill21,320,180);
        Bill bill22 = new Bill();
        addObject(bill22,380,180);
        Bill bill23 = new Bill();
        addObject(bill23,440,180);
        //ROW4
        Bill bill24 = new Bill();
        addObject(bill24,140,240);
        Bill bill25 = new Bill();
        addObject(bill25,200,240);
        Bill bill26 = new Bill();
        addObject(bill26,260,240);
        Bill bill27 = new Bill();
        addObject(bill27,320,240);
        Bill bill28 = new Bill();
        addObject(bill28,380,240);
        Bill bill29 = new Bill();
        addObject(bill29,440,240);
        Bill bill30 = new Bill();
        addObject(bill30,143,302);
        //row5
        Bill bill31 = new Bill();
        addObject(bill31,200,300);
        Bill bill32 = new Bill();
        addObject(bill32,260,300);
        Bill bill33 = new Bill();
        addObject(bill33,320,300);
        Bill bill34 = new Bill();
        addObject(bill34,380,300);
        Bill bill35 = new Bill();
        addObject(bill35,440,300);
        bill32.turn(90);
        Man man = new Man();
        addObject(man,244,655);
        man.setLocation(233,643);
        bill32.turn(270);
        ant ant = new ant();
        addObject(ant,493,684);
        ant.setLocation(497,697);
    }

}



