package jpu2016.dogfight.View;

import java.awt.event.KeyEvent;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.gameframe.IEventPerformer;
public class EventPerformer implements IEventPerformer {
    public EventPerformer(IOrderPerformer orderPerformer) {
    }

    public void eventPerform(KeyEvent keyCode) {
    }

    @Override
    public void eventPerform(int keyCode, boolean b) {

    }

    private UserOrder keyCodeToUserOrder(int keyCode) {
        return null;
    }
}
