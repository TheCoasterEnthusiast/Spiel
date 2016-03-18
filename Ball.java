public class Ball{
  
  //member variables
  public int xPos;
  public int yPos;
  public int xVelocityIncrement;
  public int yVelocityIncrement;
  
  //constructor
  public Ball(int xPos, int yPos, int xVelocityIncrement, int yVelocityIncrement) {
    this.xPos = xPos;
    this.yPos = yPos;
    this.xVelocityIncrement = xVelocityIncrement;
    this.yVelocityIncrement = yVelocityIncrement;
  }
}