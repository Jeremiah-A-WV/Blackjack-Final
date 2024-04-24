import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{

    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 1100x619 cells with a cell size of 1x1 pixels.
        super(1100, 619, 1);
        this.prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ExitButton exitButton = new ExitButton();
        
        JoinButton joinButton = new JoinButton();
        UnjoinButton unjoinButton = new UnjoinButton();
        
        StartButton startButton = new StartButton();
        OptionsButton optionsButton = new OptionsButton(this);
        
        RulesButton rulesButton = new RulesButton(this);
        
        addObject(joinButton, 460, 375);
        addObject(unjoinButton, 640, 375);
        
        addObject(startButton, 550, 465);
        addObject(optionsButton, 550, 555);
        
        addObject(rulesButton, 950, 555);
        addObject(exitButton, 990, 64);
    }
}
