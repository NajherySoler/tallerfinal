import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GerreroTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GerreroTerran extends Terran
{
    /**
     * Act - do whatever the GerreroTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      private int posX;         
      private int posY;  
      
     public GerreroTerran()
    {
        posX = 4;
        posY = 4;
         getImage().scale(getImage().getWidth()/20,getImage().getHeight()/20);
    }
    
    public void act() 
    {
        move();
    }
    
    public void move()
    {
        setLocation (getX() + posX, getY() + posY);
        estaTocandoBorde();
        estaChocando();
    }
   
    private void estaTocandoBorde()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1) {
            posX = -posX;
        }
        if (getY() == 0 || getY() == getWorld().getHeight()-1) {
            posY = -posY;
        }
    }
    
     private void estaChocando(){
       if (isTouching(GerreroZerg.class)||isTouching(ConstructorZerg.class)||isTouching(MedicoZerg.class)){
           posX = -posX;
        }
    if(isTouching(Roca.class)||isTouching(Bomba.class)){
            posX = -posX;
    }
}
}


  
  