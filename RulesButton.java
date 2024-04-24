import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RulesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RulesButton extends Button
{
    public RulesButton(World link) {
        super(170, 80);
        setLink(new RulesWorld(link));
    }
    
    public void onClick() {
        Greenfoot.setWorld(this.getLink());
    }
}
