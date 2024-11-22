package LooseCoupling;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("go in the whole");
    }

    @Override
    public void right() {
        System.out.println("go backward");
    }

    @Override
    public void left() {
        System.out.println("go forward");
    }

}
