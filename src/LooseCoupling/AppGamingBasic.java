package LooseCoupling;

public class AppGamingBasic {

    public static void main(String[] args) {

//        var game = new ContraGame();
//        var game = new MarioGame();
        PacmanGame game = new PacmanGame();

        GameRunner runner = new GameRunner(game);
        runner.run();
    }
}
