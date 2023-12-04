package BookHorstmann.Examples.MethodReference.java.Helpers;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RepeatedGreeter extends Greeter {
    @Override
    public void greet(ActionEvent event) {
        var timer = new Timer(1000, super::greet);
        timer.start();
    }
}
