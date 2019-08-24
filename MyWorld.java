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
        addObject (new ConstructorTerran(), 50, getHeight() / 7);
        addObject (new GerreroTerran(), 60, getHeight() / 7);
        addObject (new MedicoTerran(), 70, getHeight() / 7);
       addObject (new ConstructorZerg(),700, getHeight() / 7);
       addObject (new GerreroZerg(), 710, getHeight() / 7);
       addObject (new MedicoZerg(), 720, getHeight() / 7);
       addObject (new Roca(), 444, getHeight() / 3);
        addObject (new Tronco(), 200, getHeight() / 4);
        addObject (new Roca(), 367, getHeight() / 2);
        addObject (new Tronco(), 745, getHeight() / 6);
        addObject (new Roca(), 600, getHeight() / 7);
        addObject (new Tronco(), 344, getHeight() / 5);
          addObject (new Cofres(), 100, getHeight() / 7);
        addObject (new Diamante(), 300, 500);
        
       
        
   
    }
}
