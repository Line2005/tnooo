package jpu2016.dogfight.controleur;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.Mobile;
import jpu2016.dogfight.model.Plane;
import jpu2016.dogfight.view.IViewSystem;

import java.awt.*;
import java.util.List;

public class DogfightController implements IOrderPerformer {
    private final int TIME_SLEEP = 30;
    private Plane plane;
    private IDogfightModel dogfightModel;
    private Order order;

    public DogfightController(IDogfightModel dogfightModel) {
        this.dogfightModel = dogfightModel;
    }
    public void orderPerform(UserOrder userOrder ) {

    }
    public void play(IViewSystem viewSystem) {
        gameLoop();
        // Afficher un message de fin de partie
        viewSystem.displayMessage("Partie terminée!");
    }
    public void setViewSystem(IViewSystem viewSystem) {

    }
    private void launchMissile(int player) {

    }
    private void gameLoop(List<Mobile> mobiles) {
        while (true) {
            for (Mobile mobile : mobiles) {
                mobile.move();
            }
            // Verifier si l'avion est mort, et arreter la boucle si c'est le cas
            if (plane.isDead()) {
                break;
            }
        }

    }
    private boolean isWeaponOnMobile(Rectangle missileFrame, Rectangle mobileFrame) {
        return missileFrame.intersects(mobileFrame);
    }
    private void manageCollision() {

    }
}
