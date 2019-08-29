import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicoZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoZerg extends Zerg
{
    /**
     * Act - do whatever the MedicoZerg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int posX;         
      private int posY;  
      
     public MedicoZerg()
    {
        posX = 5;
        posY = 5;
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
       if (isTouching(GerreroTerran.class)||isTouching(ConstructorTerran.class)||isTouching(MedicoTerran.class)){
           posX = -posX;
        }
        if(isTouching(Roca.class)||isTouching(Bomba.class)){
            posX = -posX;
    }
    }
}

  
  