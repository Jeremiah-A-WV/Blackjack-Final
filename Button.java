import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private World link;
    
    public Button (int width, int height) {
        this.getImage().scale(width, height);
        setImage(this.getImage());
    }
    
    public void setLink(World link) {
        this.link = link;
    }
    
    public World getLink() {
        return link;
    }
    
    public void onClick() {}
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
    }
}
