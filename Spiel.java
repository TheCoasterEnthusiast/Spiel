import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;
//temp
import java.awt.Rectangle;
import java.awt.Button;
//temp
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Spiel extends JPanel implements MouseListener, KeyListener, ActionListener{
  //member variables
  private Paddle leftPaddle;
  private Paddle rightPaddle;
  private PlayerBall myPlayerBall;
  
  public boolean isEndScreen = false;
  public boolean mlgModeOn = false;
  
  private boolean mouseInside = false;
  
  private boolean w = false;
  private boolean s = false;
  
  private int paddleSpeed = 1;
  //temp
  private Button tempButton;
  //temp
  //constructor
  public Spiel(int paddle1StartXPos, int paddle1StartYPos, int paddle2StartXPos, int paddle2StartYPos, int tempPlayerBallX, int tempPlayerBallY, int tempPlayerBallXIncrement, int tempPlayerBallYIncrement) {
    super();
    setBackground(new Color(0, 0, 0));
    
    leftPaddle = new Paddle(paddle1StartXPos, paddle1StartYPos);
    rightPaddle = new Paddle(paddle2StartXPos, paddle2StartYPos);
    myPlayerBall = new PlayerBall(tempPlayerBallX, tempPlayerBallY, tempPlayerBallXIncrement, tempPlayerBallYIncrement);
  }
  
  //member methods
  //compute position
  private void computePosition(Paddle paddle) {
       if(w == true) {
            leftPaddle.setYPaddle((leftPaddle.getYPaddle()) - paddleSpeed);
       } else if(s == true) {
            leftPaddle.setYPaddle((leftPaddle.getYPaddle()) + paddleSpeed);
       }
  }
  
  
  
  // temporary new frame
  public void actionPerformed (ActionEvent e) {
  repaint ();
 }
  
  // temporary mouse inside
  public void mouseEntered(MouseEvent e) {
    mouseInside = true;
 }
  
  // temporary mouse outside
  public void mouseExited(MouseEvent e) {
    mouseInside = false;
 }
  
  // temporary mouse pressed
  public void mousePressed (MouseEvent e) {}
 
  // temporary mouse released
  public void mouseReleased (MouseEvent e) {}
  
  // temporary mouse clicked
  public void mouseClicked (MouseEvent e) {}
 
  
 /* // temporary key pressed
  public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_UP) {
      keyUp = false;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      keyDown = true;
    }
 }
  
  // temporary key released
  public void keyReleased(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_UP) {
      keyUp = false;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      keyDown = false;
    }
  }
  
  // temporary key typed
  public void keyTyped(KeyEvent e) {}
*/
  
  //key  pressed
  public void keyPressed(KeyEvent e) {
       if(e.getKeyCode() == KeyEvent.VK_W) {
            w = true;
//            leftPaddle.setYPaddle((leftPaddle.getYPaddle()) - paddleSpeed);
       } else if(e.getKeyCode() == KeyEvent.VK_S) {
            s = true;
//            leftPaddle.setYPaddle((leftPaddle.getYPaddle()) + paddleSpeed);
       }
  }
  
  //key released
  public void keyReleased(KeyEvent e) {}
  
  //key typed
  public void keyTyped(KeyEvent e) {}
  
  //paint
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    g.setColor(Color.gray);
    
    //draws left paddle
    g.drawRect(leftPaddle.getXPaddle(), leftPaddle.getYPaddle(), 10, 120);
    g.fillRect(leftPaddle.getXPaddle(), leftPaddle.getYPaddle(), 10, 120);
    
    //draws right paddle
    g.drawRect(rightPaddle.getXPaddle(), rightPaddle.getYPaddle(), 10, 120);
    g.fillRect(rightPaddle.getXPaddle(), rightPaddle.getYPaddle(), 10, 120);
    
    computePosition(leftPaddle);
    computePosition(rightPaddle);
  }
  
  
}
