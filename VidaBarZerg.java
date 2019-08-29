import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class VidaBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VidaBarZerg extends Actor
{
    int vida2=4;
    int vidaAncho2=80;
    int vidaLargo2=15;
    int pixelporvida2=vidaAncho2/vida2;
    
    
    /**
     * Act - do whatever the VidaBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public VidaBarZerg(){
                actualizar2();

    }
    public void act() 
    {
        actualizar2();
    }  
    public void actualizar2() 
    {
        setImage( new GreenfootImage(vidaAncho2+2,vidaLargo2+2));
        GreenfootImage imagen=getImage();
        imagen.setColor(greenfoot.Color.WHITE);
       imagen.drawRect(0,0,vidaAncho2+1,vidaLargo2+1);
        imagen.setColor(greenfoot.Color.GREEN);
        imagen.fillRect(1,1,vida2*pixelporvida2,vidaLargo2);
        
    }  
    public void podervida(){
        vida2--;
    }
}
