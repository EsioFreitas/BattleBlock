package View;

import Model.ArcMap;
import java.awt.BorderLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import Controller.Thread.CanvasThread;
import Controller.Player;
import Model.DatePlayer;

public class GameFrame extends JFrame {

    public static final int AREA = 60;

    private GameCanvas canvas;
    CanvasThread repaintThread;
    private ArcMap archive;
    private Player player;
    private ChoosePowersPanel choosePowersPanel;

    private int width;
    private int hight;
    private DatePlayer datePlayer;

    private int id;

    public GameFrame(ArcMap archve, DatePlayer datePlayer) {
        this.archive = archve;
        this.datePlayer = datePlayer;

        this.width = archve.getArcWidth();
        this.hight = archive.getArcHeight();

        canvas = new GameCanvas(archive);
        player = new Player(archve, canvas, this);
        choosePowersPanel = new ChoosePowersPanel(player, this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        setTitle("Stellar Battle");
        setResizable(false);
        if (width < 10) {
            setSize(150 + AREA * width, canvas.AREA * hight);
        } else {
            setSize(70 + AREA * width, canvas.AREA * hight);

        }
        setLocationRelativeTo(null);

        getContentPane().add(BorderLayout.WEST, canvas);
        getContentPane().add(BorderLayout.EAST, choosePowersPanel);

        repaintThread = new CanvasThread(canvas);

        repaintThread.start();
        canvas.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {

                int x = e.getX();
                int y = e.getY();

                int x_pos = x / canvas.AREA;
                int y_pos = y / canvas.AREA;

                player.shot(x_pos, y_pos);
                choosePowersPanel.loadLabel(player.getId());

            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });
    }

    public DatePlayer getDatePlayer() {
        return datePlayer;
    }

}
