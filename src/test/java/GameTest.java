import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GameTest {
    Game game = new Game();
    // ArrayList<Player> players = new ArrayList<>();
    Player item1 = new Player(1, "Игривый кот", 50);
    Player item2 = new Player(2, "Самурай", 100);
    Player item3 = new Player(3, "Воин", 100);
    Player item4 = new Player(4, "Маг", 80);

    @Test
    public void shouldWinPlayers2() {
        game.register(item1);
        game.register(item2);
        game.register(item3);
        game.register(item4);
        int expected = 2;
        int actual = game.round("Игривый кот", "Маг");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldWinPlayers1() {
        game.register(item1);
        game.register(item2);
        game.register(item3);
        game.register(item4);
        int expected = 1;
        int actual = game.round("Воин", "Маг");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDraw() {
        game.register(item1);
        game.register(item2);
        game.register(item3);
        game.register(item4);
        int expected = 0;
        int actual = game.round("Самурай", "Воин");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotPlayer1Registor() {
        game.register(item1);
        game.register(item2);
        game.register(item3);
        game.register(item4);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Дракула", "Воин");
        });
    }
    @Test
    public void shouldNotPlayer2Registor() {
        game.register(item1);
        game.register(item2);
        game.register(item3);
        game.register(item4);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Воин", "Орк");
        });
    }
}



