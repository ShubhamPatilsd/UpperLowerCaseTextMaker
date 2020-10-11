import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class openGitHub implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String os=System.getProperty("os.name").toLowerCase();
        System.out.println(os);
        Runtime rt = Runtime.getRuntime();
        String url = "https://github.com/ShubhamPatilsd";
        if(os.indexOf("mac")>=0) {

            try {
                rt.exec("open " + url);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }else if(os.indexOf("win")>=0){

            try {
                rt.exec("rundll32 url.dll,FileProtocolHandlers "+url);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }else if(os.indexOf("nix")>=0 || os.indexOf("nux")>=0){
            try {
                rt.exec("xdg-open "+url);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
