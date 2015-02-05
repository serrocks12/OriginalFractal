import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

private double fractionLength = .8f; 
private int smallestBranch = 10; 
private double branchAngle = .2f;  
public void setup() 
{   
	size(640,480);    
	noLoop();

} 
public void draw() 
{   
	background(0);   
	stroke(0,255,0);   
	ellipse(320,480,100,100);   
	drawBranches(320,380,100,3*Math.PI/2);  //will add later 
} 
public void drawBranches(int x,int y, double branchLength, double angle) 
{   
	double angle1;
    double angle2;
	angle1 = angle + branchAngle;
	angle2 = angle - branchAngle;
	branchLength = branchLength * fractionLength;
	int endX1 = (int)(branchLength*Math.cos(angle1) + x);
    int endY1 = (int)(branchLength*Math.sin(angle1) + y);
    int endX2 = (int)(branchLength*Math.cos(angle2) + x);
    int endY2 = (int)(branchLength*Math.sin(angle2) + y);
    ellipse(x,y,endX1,endY1);
    
    if (branchLength > smallestBranch)
    {
       drawBranches(endX1/2,endY1/2, branchLength, angle1);
	   
    }
   //your code here    
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
