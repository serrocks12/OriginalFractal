public void setup()
{
  size(500,500);
  noLoop();
}
public void draw()
{
  background(0);
  stroke(0,255,0);
  ellipse(255,255,50,50);
  sizeCircle(250,250,50,50);
}
public void sizeCircle(int x,int y,int sizeX,int sizeY)
{
  int a;
  int b; 
  a = 10 + sizeX;
  b = 10 + sizeY;
  ellipse(x, y, a,b);
  if(x> 0)
  {
   sizeCircle(x-20,y-20, a,b);
  }
 
}  
