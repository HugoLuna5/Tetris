
package tetris;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {
       JLabel puntuacion;
    public Tetris()
        {
        puntuacion = new JLabel("0");
        add(puntuacion, BorderLayout.SOUTH);
        Tablero tab = new Tablero(this);
        add(tab);
        tab.start();
        setSize(200, 400);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
   public JLabel obtenerPuntuacion()
        {
        return puntuacion;
        }
   
   //el main

   
    public static void main(String[] args) {
         {
        Tetris juego = new Tetris();
        juego.setVisible(true);
        }
    }
    
}
