import javax.swing.JFrame;
import javax.swing.Timer;

public class SpielWindow extends JFrame{
  public SpielWindow() {
    super();
    
    setTitle("Spiel");
    setSize(620, 410);
    
    Spiel content = new Spiel();
    
    addMouseListener(content);
    addKeyListener(content);
  }
}