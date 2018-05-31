
/*Ativar tiros -- hj
 *Descontar recursos -- amanha
 *Finalizar jogo -- sab 
 *pontuar -- sab 
 *rank  -- dom 
 *artes -- segunda 
 * */





package View;

import Model.ArcMap;
import java.awt.BorderLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.GraphicAttribute;

import javax.swing.JFrame;

import Controller.CanvasThread;
import Controller.Player;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class GameFrame extends JFrame {

	private GameCanvas canvas;
	CanvasThread repaintThread;
	private ArcMap archive;
	private int width;
	private int hight;
	public static final int AREA = 60;
	private Player player;

	public GameFrame(ArcMap archve) {
		this.archive = archve;
		
		this.width = archve.getArcWidth();
		this.hight = archive.getArcHeight();
		
		canvas = new GameCanvas(archive);
		player = new Player(archve, canvas);
		System.out.println(player.weaponry(2));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setLayout(new BorderLayout());
		setTitle("Stellar Battle");
		getContentPane().add(BorderLayout.WEST, canvas);
		setResizable(false);

		// Define largura e altura da janela principal
		setSize(AREA * width,AREA * hight);
		setLocationRelativeTo(null);

		// setVisible(true);

		// Inicia Thread com timer para redesenhar a tela.
		repaintThread = new CanvasThread(canvas);
		repaintThread.start();
		canvas.addMouseListener(new MouseListener() {

			@Override
			
			public void mouseReleased(MouseEvent e) {
				repaint();
				
				int x = e.getX();
				int y = e.getY();

				int x_pos = x / canvas.AREA;
				int y_pos = y / canvas.AREA;
				
				//mudar(x y canvas)
				
				

				System.out.println(canvas.getShot(x_pos, y_pos));
				//System.out.println(x_pos);

				//System.out.println( y_pos);


				//player.setPowerDestroyRow(x_pos, y_pos);
				
				//canvas.oque();

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
	
	

}
