import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartButton extends Button
{
    public RestartButton() {
        super(80, 80);
        setLink(new StartWorld());
    }
    
    public void onClick() {
        Greenfoot.setWorld(this.getLink());
    }
}
