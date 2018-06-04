package View;

import Controller.Player;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoosePowersPanel extends JPanel implements ActionListener {

    JButton shotButton = new JButton("Shot");
    JButton powerDestroy2x2Button = new JButton("Destroy 2x2");
    JButton powerDestroyRowButton = new JButton("Destroy Row");
    JButton powerDestroyColButton = new JButton("Destroy Col");
    JButton powerSeeButton = new JButton("See 2x2");
    JButton backButton = new JButton("Back");

    JLabel shotLabel = new JLabel();
    JLabel powerDestroy2x2Label = new JLabel();
    JLabel powerDestroyRowLabel = new JLabel();
    JLabel powerDestroyColLabel = new JLabel();
    JLabel powerSeeLabel = new JLabel();
    JLabel whiteLabel = new JLabel();

    private Player player;

    private String name;
    private int pointers;

    private int id = 0;

    private int amauntShots;
    private int amauntpowerDestroy2x2;
    private int amauntpowerDestroyRow;
    private int amauntpowerDestroyCol;
    private int amauntpowerSee;

    private int pointer;
    private GameFrame gameFrame;

    public ChoosePowersPanel(Player player, GameFrame gameFrame) {
        this.gameFrame = gameFrame;
        this.player = player;
        this.name = player.getName();
        amauntShots = player.amountShots();
        amauntpowerDestroy2x2 = player.getAmauntpowerDestroy2x2();
        amauntpowerDestroyRow = player.getAmauntpowerDestroyRow();
        amauntpowerDestroyCol = player.getAmauntpowerDestroyCol();
        amauntpowerSee = player.getAmauntpowerSee();

        setLayout(new GridLayout(6, 2));

        add(shotLabel);
        add(shotButton);
        shotButton.addActionListener(this);

        add(powerSeeLabel);
        add(powerSeeButton);
        powerSeeButton.addActionListener(this);

        add(powerDestroy2x2Label);
        add(powerDestroy2x2Button);
        powerDestroy2x2Button.addActionListener(this);

        add(powerDestroyRowLabel);
        add(powerDestroyRowButton);
        powerDestroyRowButton.addActionListener(this);

        add(powerDestroyColLabel);
        add(powerDestroyColButton);
        powerDestroyColButton.addActionListener(this);

        add(whiteLabel);
        add(backButton);
        backButton.addActionListener(this);

        shotLabel.setText("You have: " + amauntShots);
        powerDestroy2x2Label.setText("You have: " + amauntpowerDestroy2x2);
        powerDestroyColLabel.setText("You have: " + amauntpowerDestroyCol);
        powerDestroyRowLabel.setText("You have: " + amauntpowerDestroyRow);
        powerSeeLabel.setText("You have: " + amauntpowerSee);
        whiteLabel.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == shotButton) {
            player.setId(player.DESTROY1X1);
            amauntShots -= 1;
        } else if (e.getSource() == powerDestroy2x2Button) {
            player.setId(player.DESTROY2X2);
            amauntpowerDestroy2x2 -= 1;
        } else if (e.getSource() == powerDestroyRowButton) {
            player.setId(player.DESTROYROW);
        } else if (e.getSource() == powerDestroyColButton) {
            player.setId(player.DESTROYCOL);
        } else if (e.getSource() == powerSeeButton) {
            player.setId(player.SEE2X2);
        } else if (e.getSource() == backButton) {
            backButtonActionPerformed(e);
        }
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new RulesFrame().setVisible(true);
        gameFrame.dispose();

    }

    public void loadLabel(int id) {

        switch (id) {
            case 0:

                this.amauntShots -= 1;
                if (amauntShots <= 0) {
                    shotLabel.setText("Without powers");
                } else {
                    shotLabel.setText("You have: " + amauntShots);
                }
                player.setAmauntShots(amauntShots);

                break;

            case 1:
                this.amauntpowerDestroy2x2 = player.getAmauntpowerDestroy2x2();
                if (amauntpowerDestroy2x2 <= 0) {
                    powerDestroy2x2Label.setText("Without powers");
                } else {
                    powerDestroy2x2Label.setText("You have: " + amauntpowerDestroy2x2);
                }
                player.setAmauntpowerDestroy2x2(amauntpowerDestroy2x2);
                break;

            case 2:
                this.amauntpowerDestroyRow = player.getAmauntpowerDestroyRow();
                if (amauntpowerDestroyRow <= 0) {
                    powerDestroyRowLabel.setText("Without powers");
                } else {
                    powerDestroyRowLabel.setText("You have: " + amauntpowerDestroyRow);
                }
                player.setAmauntpowerDestroyRow(amauntpowerDestroyRow);
                break;

            case 3:
                this.amauntpowerDestroyCol = player.getAmauntpowerDestroyCol();
                if (amauntpowerDestroyCol <= 0) {
                    powerDestroyColLabel.setText("Without powers");
                } else {
                    powerDestroyColLabel.setText("You have: " + amauntpowerDestroyCol);
                }
                player.setAmauntpowerDestroyCol(amauntpowerDestroyCol);
                break;

            case 4:
                this.amauntpowerSee = player.getAmauntpowerSee();
                if (amauntpowerSee <= 0) {
                    powerSeeLabel.setText("Without powers");
                } else {
                    powerSeeLabel.setText("You have: " + amauntpowerSee);
                }
                player.setAmauntpowerSee(amauntpowerSee);
                break;
            default:
                break;
        }

    }

    public void setId(int id) {
        this.id = id;
    }

}
