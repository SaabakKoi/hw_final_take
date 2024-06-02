package view;

import controller.Controller;
import controller.Loggable;
import controller.UserController;

public class UserView {
    private final Controller controller = new Loggable(new UserController());

    public void run(){
        controller.createCalculator();
        controller.gettingData();
        controller.startOperation();
    }
}
