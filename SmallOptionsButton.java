import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallOptionsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallOptionsButton extends Button
{
    public SmallOptionsButton(World link) {
        super(80, 80);
        setLink(new RulesWorld(link));
    }
    
    public void onClick() {
        Greenfoot.setWorld(this.getLink());
    }
}
