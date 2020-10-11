import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class goButtonClick implements ActionListener {
    private char[] charGoChac;
    @Override
    public void actionPerformed(ActionEvent e) {
        LetsMakeSomeUpsandDowns.copy.setText("Copy");
        ArrayList<String> idklol=new ArrayList<String>();
        LetsMakeSomeUpsandDowns.toBeChanged=LetsMakeSomeUpsandDowns.textenter.getText();
        charGoChac=LetsMakeSomeUpsandDowns.toBeChanged.toCharArray();
        int counter=0;
        for(char c:charGoChac){
            if(counter%2!=0){
                idklol.add(String.valueOf(c).toUpperCase());
            }else{
                idklol.add(String.valueOf(c).toLowerCase());
            }
            counter++;
        }
        LetsMakeSomeUpsandDowns.toBeChanged=String.join("",idklol);
        LetsMakeSomeUpsandDowns.label.setText(LetsMakeSomeUpsandDowns.toBeChanged);
    }
}
