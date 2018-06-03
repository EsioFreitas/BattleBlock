package View;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoosePowersPanel extends JPanel implements ActionListener{

    JButton shotButton = new JButton("Shot");
    JButton powerDestroy2x2Button = new JButton("Destroy 2x2");
    JButton powerDestroyRowButton = new JButton("Destroy Row");
    JButton powerDestroyColButton = new JButton("Destroy Col");
    JButton powerSeeButton = new JButton("See 2x2");

    JLabel shotLabel = new JLabel("You have: 0");
    JLabel powerDestroy2x2Label = new JLabel("You have: 1");
    JLabel powerDestroyRowLabel = new JLabel("You have: 2");
    JLabel powerDestroyColLabel = new JLabel("You have: 3");
    JLabel powerSeeLabel = new JLabel("You have: 4");

    public ChoosePowersPanel() {
        setLayout(new GridLayout(5, 2));

        add(shotLabel);
        add(shotButton);

        add(powerDestroy2x2Label);
        add(powerDestroy2x2Button);

        add(powerDestroyRowLabel);
        add(powerDestroyRowButton);

        add(powerDestroyColLabel);
        add(powerDestroyColButton);

        add(powerSeeLabel);
        add(powerSeeButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == shotButton){
            
        } else if(e.getSource() == powerDestroy2x2Button){
            
        }else if(e.getSource() == powerDestroyRowButton){
            
        }else if(e.getSource() == powerDestroyColButton){
            
        }else if(e.getSource() == powerSeeButton){
            
        }
    }

}
