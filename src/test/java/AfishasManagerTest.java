import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishasManagerTest {

    @Test
    public void addNullMovie() {
        AfishasManager manager = new AfishasManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {
        AfishasManager manager = new AfishasManager();
        manager.addMovie("One");
        String[] expected = {"One"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTwoMovie() {
        AfishasManager manager = new AfishasManager();
        manager.addMovie("One");
        manager.addMovie("Two");
        String[] expected = {"One", "Two"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMovieLessLimit() {
        AfishasManager manager = new AfishasManager();
        manager.addMovie("One");
        manager.addMovie("Two");
        String[] expected = {"Two", "One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMovieLimit() {
        AfishasManager manager = new AfishasManager();
        manager.addMovie("One");
        manager.addMovie("Two");
        manager.addMovie("Three");
        manager.addMovie("Four");
        manager.addMovie("Five");
        String[] expected = {"Five", "Four", "Three", "Two", "One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}