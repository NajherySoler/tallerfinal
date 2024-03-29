import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
// (Trabajar los colores de la barra)

/**
 * Write a description of class HealtBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int healthConst=100,healthGuer=100, healthMed=100;
    int health = ((healthConst+healthGuer+healthMed)/3);
        int healthBarWidth = 100;
        int healthBarHeight = 15;
        int pixelsPerHealthPoint = (int)healthBarWidth/((healthConst+healthGuer+healthMed)/3);
        
    public HealthBar(){
    
       setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, ((healthConst+healthGuer+healthMed)/3)*pixelsPerHealthPoint, healthBarHeight);
    }
    public void act() 
    {

        update();
    }    
    public void update()
    {
        
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, ((healthConst+healthGuer+healthMed)/3)*pixelsPerHealthPoint, healthBarHeight);
    }
    
    public void loseHealthProtossGuerrero()
    {
        healthGuer=healthGuer-10;
    }
    public void loseHealthConst(){
        healthGuer=healthGuer-2;
    }
    public void loseHealthGuerreroaCons()
    {
        healthConst=healthConst-10;
    }
    public void loseHealthConstaConst(){
        healthConst=healthGuer-2;
    }
    public void loseHealthGuerreroaMed(){
         healthMed=healthMed-10;
    }
    public void loseHealthConstaMed(){
        healthMed=healthMed-10;  

        healthConst=healthConst-2;

    }
    public boolean muerteConst(){
    if(healthConst<=0){
        return true;
    }
    return false;
    }
    public boolean muerteGuerrero(){
    if(healthGuer<=0){
        return true;
    }
    return false;
    }
    public boolean muerteMedico(){
        if(healthMed<=0){
            return true;
    }
    return false;
}
}
