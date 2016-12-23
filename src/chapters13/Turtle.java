package chapters13;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @author by kissx on 2016/9/1.
 */
public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAilas = System.out;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        Turtle terry = new Turtle("Terry", new Formatter(outAilas));
        tommy.move(0, 0);
        tommy.move(4, 8);
        terry.move(0, 1);
        terry.move(4, 9);
    }
}
