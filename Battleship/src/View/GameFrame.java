
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
import java.awt.FlowLayout;
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
        private ChoosePowersPanel choosePowersPanel;
        
	private int width;
	private int hight;
        
        private int id;
        
	public GameFrame(ArcMap archve) {
		this.archive = archve;
		
		this.width = archve.getArcWidth();
		this.hight = archive.getArcHeight();
		
		canvas = new GameCanvas(archive);
		player = new Player(archve, canvas);
                choosePowersPanel = new ChoosePowersPanel(player);
                
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		setTitle("Stellar Battle");
		setResizable(false);
                if(width < 10){
                    setSize(150+AREA * width, canvas.AREA * hight);
                }else{
                    setSize(70+AREA * width, canvas.AREA * hight);

                }
		setLocationRelativeTo(null);
                
                JLabel text = new JLabel(", your core is: ");

                
                JPanel flow = new JPanel(new FlowLayout());
                flow.add(choosePowersPanel);
                
                JPanel rightGame = new JPanel(new BorderLayout());
                rightGame.add(BorderLayout.CENTER, text);
                rightGame.add(BorderLayout.SOUTH, flow);
                
                getContentPane().add(BorderLayout.WEST, canvas);
                getContentPane().add(BorderLayout.EAST, rightGame);



		repaintThread = new CanvasThread(canvas);
                
		repaintThread.start();
		canvas.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
                            				
				int x = e.getX();
				int y = e.getY();

				int x_pos = x / canvas.AREA;
				int y_pos = y / canvas.AREA;
                                
                                
				//compara os valores
				//int opc = archve.getPosition(canvas.getExplosionMatrix(), x_pos, y_pos);
                                
				                        System.out.println("quero esse aqui");
                                                        //System.out.println(opc);
                                                        
                                int board1;
                                int board2;
                                int board3;
                                int board4;
                                int board5;
                                
                                
                                
                                player.shot(x_pos, y_pos);
                                //player.powerSee(x_pos, y_pos);
                                
				/*if (opc > 0) {
                                    //player.Attention(x_pos, y_pos);
                                    //player.shot(x_pos, y_pos);
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
                                    //player.waterShot(x_pos, y_pos);
				}
				//mudar(x y canvas)
				
				*/

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
