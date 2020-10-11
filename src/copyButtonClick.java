import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class copyButtonClick implements ActionListener {
    private static boolean fiveSecondsPassed;
    @Override
    public void actionPerformed(ActionEvent e) {
        fiveSecondsPassed=false;
        StringSelection stringSelection=new StringSelection(LetsMakeSomeUpsandDowns.toBeChanged);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);
        LetsMakeSomeUpsandDowns.copy.setText("Copied");
        }

    }


