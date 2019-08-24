import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorZerg extends Zerg
{
    /**
     * Act - do whatever the ConstructorZerg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int posX;         
      private int posY;  
      
     public ConstructorZerg()
    {
        posX = 7;
        posY = 7;
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
       if (isTouching(GerreroTerran.class)||isTouching(ConstructorTerran.class)||isTouching(MedicoTerran.class)){
           posX = -posX;
        }
        if(isTouching(Roca.class)||isTouching(Tronco.class)){
            posX = -posX;
    }
    }
}

  
  