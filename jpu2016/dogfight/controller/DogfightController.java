package jpu2016.dogfight.controller;

import jpu2016.dogfight.View.IViewSystem;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
public class DogfightController  implements IOrderPerformer{
    public static int TIME_SLEEP = 30;
    public static int getTimeSleep() {
        return TIME_SLEEP;
    }
    private DogfightModel dogfightModel;
    public static void setTimeSleep(int tIME_SLEEP) {
        TIME_SLEEP = tIME_SLEEP;
    }
    private IDogfightModel  dogfightmodel;
    public  DogfightController(DogfightModel dogfightModel){
        this.dogfightmodel = dogfightModel;
    }

    public  void DogfightContoller(IDogfightModel dogfightModel) {

        this.setDogfightmodel(dogfightmodel);
    }
    public void orderPerform (UserOrder userOrder) {
    };

    private void gameLoop() {

    }
    public void play() {
    };
    public void setViewSystem(IViewSystem viewSystem) {

    };
    public void launchMissile (int player) {

    };

    public IDogfightModel getDogfightmodel() {
        return dogfightmodel;
    }
    public void setDogfightmodel(IDogfightModel dogfightmodel) {
        this.dogfightmodel = dogfightmodel;
    }
}
