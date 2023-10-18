package jpu2016.dogfight.View;

import java.util.Observable;
import java.lang.Runnable;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.gameframe.GameFrame;
import jpu2016.dogfight.View.GraphicsBuilder;

public class DogfightView implements IViewSystem, Runnable{
    private final EventPerformer eventPerformer;
    private final GraphicsBuilder graphicsBuilder ;
    private final GameFrame gameFrame ;

    public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
        this.eventPerformer = new EventPerformer(orderPerformer);
        this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
        this.gameFrame = new GameFrame("Dogfight",this.eventPerformer, (IGraphicsBuilder) this.graphicsBuilder,observable);
    }

    public void run() {
        gameFrame.run();
    }

    public void displayMessage(String message) {
        gameFrame.displayMessage(message);
    }

    public void closeAll() {
        gameFrame.dispose();
    }
    public void setWindowSize(int width, int height){
        gameFrame.setWindowSize(width, height);
    }
}
