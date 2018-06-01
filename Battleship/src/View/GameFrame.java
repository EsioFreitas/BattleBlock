
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

import Controller.Thread.CanvasThread;
import Controller.Player;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.util.Locale;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class GameFrame extends JFrame {
    
        public static final int AREA = 60;

	private GameCanvas canvas;
	CanvasThread repaintThread;
	private ArcMap archive;
        private Player player;
        
	private int width;
	private int hight;
        
	public GameFrame(ArcMap archve) {
		this.archive = archve;
		
		this.width = archve.getArcWidth();
		this.hight = archive.getArcHeight();
		
		canvas = new GameCanvas(archive);
		player = new Player(archve, canvas);
                
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		setTitle("Stellar Battle");
		setResizable(false);
		setSize(AREA * width,AREA * hight);
		setLocationRelativeTo(null);
                
          
                
                getContentPane().add(BorderLayout.CENTER, canvas);



		repaintThread = new CanvasThread(canvas);
		repaintThread.start();
		canvas.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
                            				
				int x = e.getX();
				int y = e.getY();

				int x_pos = x / canvas.AREA;
				int y_pos = y / canvas.AREA;
				
				int opc = archve.getPosition(canvas.getExplosionMatrix(), x_pos, y_pos);
				
				if (opc == 1) {
					player.setShot(x_pos, y_pos);
				} else if  (opc == 0){
					player.waterShot(x_pos, y_pos);
				}
				//mudar(x y canvas)
				
				

				//System.out.println(canvas.getShot(x_pos, y_pos));
				//System.out.println(x_pos);

				//System.out.println( y_pos);


				//player.setPowerDestroyRow(x_pos, y_pos);
				
				//
                                
                                canvas.oque();

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
