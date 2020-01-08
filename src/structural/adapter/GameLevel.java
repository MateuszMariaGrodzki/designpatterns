package structural.adapter;

public class GameLevel implements Game {
    private String levelName;
    private int levelNumber;

    public GameLevel(String levelName, int levelNumber) {
        this.levelName = levelName;
        this.levelNumber = levelNumber;
    }

    @Override
    public void start(String playerName) {
        System.out.print("Gracz " + playerName + "rozpoczyna poziom " + levelName);
    }

    @Override
    public void win() {
        System.out.print("Poziom " + levelNumber + " zostal pomyslnie ukonczony");
    }

    @Override
    public void exit() {
        System.out.print("Porazka");
    }
}
