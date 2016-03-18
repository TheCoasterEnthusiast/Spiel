import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

import java.util.Random;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Spiel extends JPanel implements MouseListener, KeyListener, ActionListener{
  //member variables
  public boolean isEndScreen = false;
  public boolean mlgModeOn = false;
  
  
  private boolean mouseInside = false;
  
  private boolean keyUp = false;
  private boolean keyDown = false;
  
  // temporary constructor
  public Spiel() {
    super();
    setBackground(new Color(0, 0, 0));
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
 
  
  // temporary key pressed
  public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_UP) {
      keyUp = false;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      keyDown = false;
    }
 }
  
  // temporary key released
  public void keyReleased(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_UP) {
      keyDown = false;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      keyDown = false;
    }
  }
  
  // temporary key released
  public void keyTyped(KeyEvent e) {}
 
}