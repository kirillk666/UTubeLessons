package LessonsUtube.Normal.MultiThreading.synchronizers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    /* Exchanger - синхронизатор (готовое решение, что не писать локи и синхронизацию самому),
    позволяющий обмениваться данными между двумя потоками.
    Оба потока получают информацию друг от друга одновременно.
    В Exchanger происходит ожидание, пока оба потока передадут данные, далее происходит одновременный обмен.
    Данные должны быть одного типа.
    */

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> firstPlayerActions = new ArrayList<>(Arrays.asList(Action.getRandom(), Action.getRandom(), Action.getRandom()));
        List<Action> secondPlayerActions = new ArrayList<>(Arrays.asList(Action.getRandom(), Action.getRandom(), Action.getRandom()));
        Player kirill = new Player("Kirill", firstPlayerActions);
        Player dartanyan = new Player("Dartanyan", secondPlayerActions);
        new Game(kirill, dartanyan, exchanger).startGame();
    }

    enum Action {
        KAMEN, NOJNICI, BUMAGA;

        public static Action getRandom() {
            Random random = new Random();

            return Action.values()[random.nextInt(Action.values().length)];
        }
    }

    record Player(String playerName, List<Action> playerActions) {
    }

    static class Game {
        private final Player firstPlayer;
        private final Player secondPlayer;
        private final Exchanger<Action> exchanger;

        public Game(Player firstPlayer, Player secondPlayer, Exchanger<Action> exchanger) {
            this.firstPlayer = firstPlayer;
            this.secondPlayer = secondPlayer;
            this.exchanger = exchanger;
        }

        private static void whoWins(String firstPlayerName, String secondPlayerName, Action firstPlayerAction, Action secondPlayerAction) {
            if (firstPlayerAction.equals(secondPlayerAction)) {
                System.out.println(firstPlayerName.toUpperCase() + " got " + firstPlayerAction + " and " + secondPlayerName.toUpperCase() + " got " + secondPlayerAction + "! RESULT IS DRAW!");
            } else if (firstPlayerAction.equals(Action.KAMEN) && !secondPlayerAction.equals(Action.BUMAGA)
                    || firstPlayerAction.equals(Action.BUMAGA) && !secondPlayerAction.equals(Action.NOJNICI)
                    || firstPlayerAction.equals(Action.NOJNICI) && !secondPlayerAction.equals(Action.KAMEN)) {
                System.out.println(
                        firstPlayerName.toUpperCase() + " got " + firstPlayerAction + " and " +
                                secondPlayerName.toUpperCase() + " got " + secondPlayerAction + "! " +
                                firstPlayerName.toUpperCase() + " IS A WINNER!");
            } else {
                System.out.println(
                        firstPlayerName.toUpperCase() + " got " + firstPlayerAction + " and " +
                                secondPlayerName.toUpperCase() + " got " + secondPlayerAction + "! " +
                                secondPlayerName.toUpperCase() + " IS A WINNER!");
            }
        }

        public void startGame() {
            Thread secondPlayerThread = new Thread(() -> {
                try {
                    for (Action action : secondPlayer.playerActions) {
                        // Второй игрок сначала ждёт, потом отправляет
                        exchanger.exchange(action);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            secondPlayerThread.start();

            try {
                for (Action action : firstPlayer.playerActions) {
                    // Первый игрок отправляет своё действие и получает действие другого игрока
                    Action secondPlayerAction = exchanger.exchange(action);
                    whoWins(firstPlayer.playerName(), secondPlayer.playerName(), action, secondPlayerAction);

                    Thread.sleep(2000); // Задержка для видимости результата
                }

                secondPlayerThread.join(); // Ждём завершения второго потока
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}