import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackjackWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackjackWorld extends World
{

    /**
     * Constructor for objects of class BlackjackWorld.
     * 
     */
    public BlackjackWorld()
    {    
        // Create a new world with 1100x800 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1);
        
        RestartButton restartButton = new RestartButton();
        SmallOptionsButton optionsButton = new SmallOptionsButton(this);
        SmallRulesButton rulesButton = new SmallRulesButton(this);
        ExitButton exitButton = new ExitButton();
        
        addObject(restartButton, 720, 64);
        addObject(optionsButton, 810, 64);
        addObject(rulesButton, 900, 64);
        addObject(exitButton, 990, 64);
        
        HitButton hitButton = new HitButton();
        StandButton standButton = new StandButton();
        addObject(hitButton, 730, 735);
        addObject(standButton, 390, 735);
    }
}
