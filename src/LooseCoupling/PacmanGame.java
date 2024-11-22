package LooseCoupling;

public class PacmanGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("moving up");
    }

    @Override
    public void down() {
        System.out.println("moving backward");
    }

    @Override
    public void left() {
        System.out.println("moving left");
    }

    @Override
    public void right() {
        System.out.println("moving right");
    }
}
