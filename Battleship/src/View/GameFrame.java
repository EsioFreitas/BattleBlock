
/*Ativar tiros -- hj            ok
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
import java.awt.GridLayout;
import java.util.Locale;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicArrowButton;

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
		setSize(100+AREA * width, canvas.AREA * hight);
		setLocationRelativeTo(null);
                
                
                
                
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
                
                JPanel choosePowers = new JPanel(new GridLayout(5,2)); 
                
                choosePowers.add(shotLabel);
                                choosePowers.add(shotButton);

                choosePowers.add(powerDestroy2x2Label);
                                choosePowers.add(powerDestroy2x2Button);

                choosePowers.add(powerDestroyRowLabel);
                                choosePowers.add(powerDestroyRowButton);

                choosePowers.add(powerDestroyColLabel);
                                choosePowers.add(powerDestroyColButton);

                choosePowers.add(powerSeeLabel);
                
                choosePowers.add(powerSeeButton);
                
          
                
                getContentPane().add(BorderLayout.CENTER, canvas);
                getContentPane().add(BorderLayout.EAST, choosePowers);



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
                                
				                        System.out.println("quero esse aqui");
                                                        System.out.println(opc);
                                                        
                                int board1;
                                int board2;
                                int board3;
                                int board4;
                                int board5;
                                
				if (opc > 0) {
                                    //player.Attention(x_pos, y_pos);
                                    player.shot(x_pos, y_pos);
                                    switch (opc) {
                                        case 1:
                                            //player.power 
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        default:
                                            break;
                                    }
				}else{
                                    player.waterShot(x_pos, y_pos);
				}
				//mudar(x y canvas)
				
				

				//System.out.println(canvas.getShot(x_pos, y_pos));
				//System.out.println(x_pos);

				//System.out.println( y_pos);


				//player.setPowerDestroyRow(x_pos, y_pos);
				
				//
                                

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
