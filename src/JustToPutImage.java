
import javax.swing.*;
import java.awt.*;


public class JustToPutImage {
    public ImageIcon githubicon;
    public void putImage(Container c){

            //githubicon = new ImageIcon(String.valueOf(getClass().getClassLoader().getResourceAsStream("resources/githublogo.png")));
        //githubicon = new ImageIcon(getClass().getResource("/resources/githublogo.png"));
        java.net.URL githubiconURL= getClass().getResource("githublogo.png");
        Icon githubicon=new ImageIcon(githubiconURL);
        //ImageIcon githubicon=new ImageIcon("githublogo.png");
        JButton githubprofile=new JButton(githubicon);







        githubprofile.setBounds(10,275,75,75);
        openGitHub inBrowser=new openGitHub();
        githubprofile.addActionListener(inBrowser);
        c.add(githubprofile);


        JLabel myGitHub=new JLabel("<html>Check out my <br>GitHub</html>");
        myGitHub.setBounds(10,200,150,100);
        c.add(myGitHub);

    }
}
