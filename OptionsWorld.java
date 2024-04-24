import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OptionsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OptionsWorld extends World
{

    /**
     * Constructor for objects of class OptionsWorld.
     * 
     */
    public OptionsWorld(World link)
    {    
        // Create a new world with 1100x619 cells with a cell size of 1x1 pixels.
        super(1100, 619, 1); 
        ExitButton exitButton = new ExitButton();
        
        MusicButton musicButton = new MusicButton();
        MuteButton muteButton = new MuteButton();
        
        BackButton backButton = new BackButton(link);
        addObject(backButton, 990, 555);
        
        addObject(musicButton, 550, 375);
        addObject(muteButton, 550, 475);
        addObject(exitButton, 990, 64);
    }
}
