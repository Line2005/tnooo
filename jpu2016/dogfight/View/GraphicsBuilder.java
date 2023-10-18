package jpu2016.dogfight.View;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder {
    private IDogfightModel dogfightModel;

    public GraphicsBuilder(IDogfightModel dogfightModel) {
        this.dogfightModel = dogfightModel;
    }


    @Override
    public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

    }

    @Override
    public int getGlobalWith() {
        return 0;
    }

    private void buildEmptySky() {
    }

    public void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
    }

    public int getGlobalWidth() {
        return 0;
    }

    public int getGlobalHeight() {
        return 0;
    }
}