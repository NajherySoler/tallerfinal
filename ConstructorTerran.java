import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorTerran extends Terran
{
    public int energia=100;
   
    /**
     * Act - do whatever the ConstructorTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      private int posX;         
      private int posY;  
    
    
    public ConstructorTerran()
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
    
     private boolean estaChocando(){
       if (isTouching(Zerg.class)){
           return true;
        }
        else{
          return false;
        }
    }
    private boolean edegfer(){
       if(isTouching(Roca.class)||isTouching(Bomba.class)){
            return true;
        }
        else{
          return false;
        }  
    }    
   private boolean dsgetdh(){
    if(isTouching(MedicoTerran.class)){
            return true;
        }
        else{
          return false;
        }     
    }
}
       

