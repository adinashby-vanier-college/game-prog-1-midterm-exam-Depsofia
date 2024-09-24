import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PigWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     * 
     */
    public PigWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger = new Burger();
        addObject(burger,109,46);
        Burger burger2 = new Burger();
        addObject(burger2,267,134);
        Burger burger3 = new Burger();
        addObject(burger3,370,48);
        Burger burger4 = new Burger();
        addObject(burger4,538,126);
        Burger burger5 = new Burger();
        addObject(burger5,399,249);
        Burger burger6 = new Burger();
        addObject(burger6,216,315);
        Snake snake = new Snake();
        addObject(snake,489,354);
        Pig pig = new Pig();
        addObject(pig,86,239);
    }
}
