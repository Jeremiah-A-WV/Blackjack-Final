import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallRulesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallRulesButton extends Button
{
    public SmallRulesButton(World link) {
        super(80, 80);
        setLink(new RulesWorld(link));
    }
    
    public void onClick() {
        Greenfoot.setWorld(this.getLink());
    }
}
