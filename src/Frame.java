import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Image image;
    Graphics graphics;
    Box player;
    Box enemy;
    boolean gameOver;

    Frame(){
        player = new Box(100,300,50,50,Color.BLUE);
        enemy = new Box(100,300,50,50,Color.RED);
        gameOver = false;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setVisible(true);
        this.addKeyListener(new AL());
    }

    public void paint(Graphics g){
        image = createImage(this.getWidth(), this.getHeight());
        graphics = image.getGraphics();
        g.drawImage(image,0,0,this);

        player.draw(g);
        enemy.draw(g);

    }
    public void checkCollision(){

    }
    public class AL extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            player.keyPressed(e);
            checkCollision();
            repaint();
        }

    }
}
