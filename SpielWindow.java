import javax.swing.JFrame;
import javax.swing.Timer;
import java.util.Random;

public class SpielWindow extends JFrame{
  
  Random rand = new Random();
  
  //constructor
  public SpielWindow() {
    super();
    
    setTitle("Spiel");
    setSize(600, 410);
    
    Spiel content = new Spiel(1, 140, 573, 140, rand.nextInt(460) + 160, rand.nextInt(330) + 120, 2, 3);
    getContentPane().add(content);
    
    addMouseListener(content);
    addKeyListener(content);
    
  }
}
