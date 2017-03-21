import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Ball  extends Actor
{
    private int dirx;
    private int diry;
    private World r;
    private PongWorld z;
    private boolean empezar;
    public Ball()
    {
      int aleatorioX=(int)(Math.random()*2);
      if(aleatorioX==0){
         aleatorioX=-1;
        }
      int aleatorioY = (int)(Math.random()*2);
      if(aleatorioY==0){
         aleatorioY=-1;
        }
      dirx=aleatorioX*5;
      diry=aleatorioY*5;
      empezar=false;
    }
    public void act() 
    {
      r= this.getWorld();
      z= (PongWorld)this.getWorld();
      if(empezar==false)
      {
      if(z.punt1==5)
      {
         z.checar("Player 1");
         Greenfoot.stop();
      }
      if(z.punt2==5)
      {
         z.checar("Player 2");
         Greenfoot.stop();
      }
          Greenfoot.delay(35);
          empezar=true;
      }
      else{
      if (this.getX()+dirx > r.getWidth() || this.getX() <= 0)    {
            dirx = -dirx;
        }
      if (this.isTouching(Paddle.class)) {
            diry = -diry;
        }
      this.setLocation(this.getX()+dirx,this.getY());
      this.setLocation(this.getX(),this.getY()+diry);
      if (this.getY()+diry > r.getHeight()) {
            z.sumaPunt1();
            r.addObject(new Ball(),350, 250);
            r.removeObject(this);
        }
      else{
      if (this.getY() <= 1) {
            z.sumaPunt2();
            r.addObject(new Ball(),350, 250);
            r.removeObject(this);
        }
      }
     }
    }
}
