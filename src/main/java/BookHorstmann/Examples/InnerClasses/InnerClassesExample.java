package BookHorstmann.Examples.InnerClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class InnerClassesExample {
    public static void main(String[] args) {
        var clock = new TalkingClock(1000, true);
        clock.start();

        //Выполнять программу до тех пор, пока пользователь не щелкнет "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

    private static class TalkingClock {
        private int interval;
        private boolean beep;

        /**
         * Конструирует говорящие часы
         * @param interval Интервал между сообщениями (в мс)
         * @param beep Истинно, если часы должны издавать звуковой сигнал
         */
        public TalkingClock(int interval, boolean beep) {
            this.interval = interval;
            this.beep = beep;
        }

        /**
         * Запускает часы
         */
        public void start() {
            var listener = new TimePrinter();
            var timer = new Timer(interval, listener);
            timer.start();
        }

        private class TimePrinter implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
