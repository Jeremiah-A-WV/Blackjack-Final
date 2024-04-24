import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Button
{
    
    public StartButton () {
        super(170, 80);
        setLink(new BlackjackWorld());
    }
    
    public void onClick() {
        Greenfoot.setWorld(this.getLink());
    }
}
