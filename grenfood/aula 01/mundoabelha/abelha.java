import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta é uma classe que representará uma abelha.
 * 
 * @author Gizelle Bueno 
 * @version 2025-06-04
 */
public class abelha extends Actor
{

    /**
     * Act - do whatever the abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (Greenfoot.isKeyDown("left")){
            turn(-5);

        }
        if (Greenfoot.isKeyDown("right")){
            turn(5);

        }

    }
}
