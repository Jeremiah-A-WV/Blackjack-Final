import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Button
{
    public BackButton(World link) {
        super(80, 80);
        setLink(link);
    }
    
    public void onClick() {
        Greenfoot.setWorld(this.getLink());
    }
}
