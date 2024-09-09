package BookHorstmann.Examples.Callback;

import javax.swing.*;

//6.1.7 page 286
public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();

        //Построить таймер, вызывающий приемник событий каждую секунду
        var timer = new javax.swing.Timer(1000, listener);
        timer.start();

        //Продолжить выполнение программы до тех пор, пока пользователь не нажмет кнопку ОК
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
