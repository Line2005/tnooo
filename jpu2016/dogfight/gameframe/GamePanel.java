package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
public class GamePanel extends JPanel implements Observer {
    private IGraphicsBuilder graphicsBuilder;
    private Observable observable;
    public GamePanel(){} // constructeur  par défaut
    public GamePanel(IGraphicsBuilder graphicsBuilder){

    }
    public void paintComponent(Graphics graphics){

    }
    public void update(Observable observable){

    }

    @Override
    public void update(Observable observable, Object arg1) {

    }
}
