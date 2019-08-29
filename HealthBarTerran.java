import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
// (Trabajar los colores de la barra)

/**
 * Write a description of class HealtBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBarTerran extends Actor
{

    int health1 = 100, healthMed1 = 100;

    int health1Guer=100,health1Const=100;
    

        int healthBarWidth = 100;
        int healthBarHeight = 15;
        int pixelsPerHealthPoint = (int)healthBarWidth/((health1Guer+health1Const+healthMed1)/3);
    public HealthBarTerran(){
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);


        myImage.fillRect(1, 1, ((health1Guer+health1Const+healthMed1)/3)*pixelsPerHealthPoint, healthBarHeight);

    }
    public void act() 
    {
        //Add your action code here. Barra de vida del protoss
        update();
    }    
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);


     myImage.fillRect(1, 1, ((health1Guer+health1Const+healthMed1)/3)*pixelsPerHealthPoint, healthBarHeight);

    }
    public void loseHealthTerranGuerrero()
    {
        health1Guer =health1Guer-10;
    }
    public void loseHealthConst(){
        health1Guer=health1Guer-2;
    }

     public void loseHealthGuerreroaMed(){
         healthMed1=healthMed1-10;
    }
    public void loseHealthConstaMed(){
        healthMed1=healthMed1-2;  
    }
    
    
    public void loseHealthGuerreroaConst()
    {
        health1Const =health1Const-10;
    }
    public void loseHealthConstaConst(){
        health1Const=health1Const-2;
    }
    public boolean muerteGuer(){
    if(health1Guer<=0){

        return true;
    }
    return false;
}
    public boolean muerteConst(){
    if(health1Const==0){
        return true;
    }
 return false;
}
     public boolean muerteMedico1(){
        if(healthMed1<=0){
            return true;
    }

    return false;
}
}
