import javax.swing.JFrame;

public class EntryPoint{
  public static void main (String[] args) {
    SpielWindow window = new SpielWindow();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}