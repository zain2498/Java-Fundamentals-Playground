package LooseCoupling;

public class GameRunner {

    private GamingConsole game;

     GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
