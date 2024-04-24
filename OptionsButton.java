import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OptionsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OptionsButton extends Button
{
    public OptionsButton (World link) {
        super(170, 80);
        setLink(new OptionsWorld(link));
    }
    
    public void onClick() {
        Greenfoot.setWorld(this.getLink());
    }
}
