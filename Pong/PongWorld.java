import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PongWorld  extends World
{
    protected int punt1;
    protected int punt2;
    public PongWorld()
    {  
        super(700, 500, 1);
        addObject(new Paddle(), 350, 30);
        addObject(new Paddle(), 350, 470);
        addObject(new Ball(), 350, 250);
        this.showText("Player 1:" + punt1,70,50);
        this.showText("Player 2:" + punt2,70,350);
    }
    
    public void sumaPunt1()
    {
        punt1++;
        this.showText("Player 1:" + punt1,70,50);
    }
    
    public void sumaPunt2()
    {
        punt2++;
        this.showText("Player 2:" + punt2,70,350);
    }
    
    public void checar(String ganador)
    {
        this.showText("El ganador es el " + ganador,350,250);
    }
}
