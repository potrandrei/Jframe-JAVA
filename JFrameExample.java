import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;

public class JFrameExample{
    static GraphicsConfiguration gc;
    public static void main(String args[]){
            JFrame frame = new JFrame(gc);
            frame.setVisible(true);
            frame.setTitle("Welcome to Java");
            frame.setSize(400,200);
            frame.setVisible(true);
}
}