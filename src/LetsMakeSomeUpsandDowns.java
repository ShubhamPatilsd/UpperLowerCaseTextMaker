import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class LetsMakeSomeUpsandDowns {
    private static Container c;
    private static JFrame frame;
    public static JTextField textenter;
    public static String toBeChanged;
    public static JLabel label;
    public static  JButton copy;
    public static void main(String[] args) throws IOException {
        frame=new JFrame("Lets Make Some Ups and Downs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        c=frame.getContentPane();
        c.setBackground(Color.white);
        c.setLayout(null);

        label=new JLabel("Ha ha text go brrr:");
        label.setBounds(100,30,500,50);
        c.add(label);

        JLabel directions=new JLabel("<html>I have no clue why I made this. I was bored.<br>Type the text so it can be made into the upper and lower case thing.<br>Click teh go button to do it<br>Click copy to copy the meme text to clipboard</html>",SwingConstants.CENTER);
        directions.setBounds(100,170,500,300);
        c.add(directions);

        textenter=new JTextField();
        textenter.setBounds(100,100,400,25);
        c.add(textenter);

        JButton go=new JButton("Go!");
        goButtonClick goButton=new goButtonClick();
        go.setBounds(425,150,75,30);
        go.addActionListener(goButton);
        c.add(go);

        copy=new JButton("Copy");
        copy.setBounds(100,150,100,30);
        copyButtonClick copyButton=new copyButtonClick();
        copy.addActionListener(copyButton);
        c.add(copy);

        JustToPutImage images=new JustToPutImage();
        images.putImage(c);

        frame.setSize(600,400);

        frame.setVisible(true);
    }
}
