import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class VidaBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VidaBarTerran extends Actor
{
    int vida=50;
    int vidaAncho=80;
    int vidaLargo=15;
    int pixelporvida=vidaAncho/vida;
    
    
    /**
     * Act - do whatever the VidaBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public VidaBarTerran(){
                actualizar();
   
    }
    public void act() 
    {
        actualizar();
        podervida();
    }  
    public void actualizar() 
    {
        setImage( new GreenfootImage(vidaAncho+2,vidaLargo+2));
        GreenfootImage imagen=getImage();
        imagen.setColor(greenfoot.Color.WHITE);
       imagen.drawRect(0,0,vidaAncho+1,vidaLargo+1);
        imagen.setColor(greenfoot.Color.RED);
        imagen.fillRect(1,1,vida*pixelporvida,vidaLargo);
        
    }  
    public void podervida(){
       
        vida=vida-1; 
    }
}
