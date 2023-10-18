package jpu2016.dogfight.controller;

import jpu2016.dogfight.View.DogfightView;
import jpu2016.dogfight.model.DogfightModel;

public class launcher {
    public static void main(String[] args) {
        final DogfightModel dogfightModel = new DogfightModel();
        final DogfightController dogfightController = new DogfightController(dogfightModel);
        final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
        dogfightController.setViewSystem(dogfightView);
        dogfightController.play();
        dogfightView.setWindowSize(800,600);
        dogfightView.run();

    }

}
