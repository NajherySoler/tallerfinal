import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   HealthBar healthBarProtoss = new HealthBar(); 
    HealthBarTerran healthBarTerran = new HealthBarTerran();
    HealthBarZE healthBarZE = new HealthBarZE();//fin
   public HealthBar getHealthBar()
    {
        return healthBarProtoss;
        
    }
    
    
    public HealthBarTerran getHealthBar1()
    {
        return healthBarTerran;
    }
    public HealthBarZE getHealthBar2()
    {
        return healthBarZE;
    }//fin 
    
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
        addObject (new Bomba(), 200, getHeight() / 4);
        addObject (new Roca(), 367, getHeight() / 2);
        addObject (new Bomba(), 745, getHeight() / 6);
        addObject (new Roca(), 600, getHeight() / 7);
        addObject (new Bomba(), 344, getHeight() / 5);
          addObject (new Cofres(), 100, getHeight() / 7);
        addObject (new Diamante(), 300, 500);
        
   
    }
    private void prepare(){
        //barra de vida
        addObject(healthBarProtoss, 480, 15);
        addObject(healthBarTerran, 760, 18);
        addObject(healthBarZE, 950, 20);
    }
}
