import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class TwoSection{
      
    public TwoSection(){
        Frame frame = new Frame("Two Section");
        frame.setLayout(new BorderLayout());

        Panel leftPanel = new Panel();
        leftPanel.setBackground(Color.BLUE);

        Button btnLeft = new Button("Left");
        leftPanel.add(btnLeft);
        leftPanel.setPreferredSize(new Dimension(200, 400));

        frame.add(leftPanel, BorderLayout.WEST);

        Panel rightPanel = new Panel();
        rightPanel.setBackground(Color.RED);

        Label label = new Label("Right");
        rightPanel.add(label);

        rightPanel.setPreferredSize(new Dimension(200, 400));
        frame.add(rightPanel, BorderLayout.CENTER);

         btnLeft.addActionListener(new ActionListener(){
            
           public void actionPerformed(ActionEvent e){
                label.setText("hello");
            }
         });
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new TwoSection();
    }
}
