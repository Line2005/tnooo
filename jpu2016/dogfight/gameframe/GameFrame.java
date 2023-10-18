package jpu2016.dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.util.Observable;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
public class GameFrame extends JFrame implements KeyListener{
    private IEventPerformer eventPerformer;
    public GameFrame(){} // c'est le constructeur par défaut
    public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder,Observable observable){
        this.eventPerformer = performer;
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(this);
        pack();
        setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {
    
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
    eventPerformer.eventPerform(keyEvent.getKeyCode(), true);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        eventPerformer.eventPerform(keyEvent.getKeyCode(),false);

    }

    public void run() {
    }

    public void displayMessage(String message) {
    }
    public void setWindowSize(int width, int height){
        setSize(width,height);
    }
}
