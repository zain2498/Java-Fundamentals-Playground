package LooseCoupling;

public class ContraGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("crouch");
    }


    @Override
    public void right() {
        System.out.println("accelerate");
    }

    @Override
    public void left() {
        System.out.println("backward move");
    }


}
