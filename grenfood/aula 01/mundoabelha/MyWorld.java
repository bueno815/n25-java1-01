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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,62,55);
        Mosca mosca = new Mosca();
        addObject(mosca,43,330);
        abelha abelha = new abelha();
        addObject(abelha,33,181);
        aranha.setLocation(31,33);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,81,352);
        mosca2.setLocation(87,323);
        mosca.setLocation(31,328);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,35,376);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,88,376);
        mosca.setLocation(22,275);
        mosca2.setLocation(99,272);
        mosca4.setLocation(99,324);
        abelha.setLocation(41,167);
    }
}
