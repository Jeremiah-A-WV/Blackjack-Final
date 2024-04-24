import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Button
{
    public ExitButton() {
        super(80, 80);
    }
    
    public void onClick() {
        System.exit(0);
    }
}
