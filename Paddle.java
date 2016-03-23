public class Paddle{
  //member variables
  private int xPaddle;
  private int yPaddle;
  
  //constructor
  public Paddle(int xPaddle, int yPaddle) {
    this.xPaddle = xPaddle;
    this.yPaddle = yPaddle;
  }
  
  //member methods
  public void setYPaddle(int newY) {
    yPaddle = newY;
  }
  
  public int getXPaddle() {
    return xPaddle;
  }
  
  public int getYPaddle() {
    return yPaddle;
  }
}
