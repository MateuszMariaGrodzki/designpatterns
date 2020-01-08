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
        System.out.println("Gracz " + playerName + "rozpoczyna poziom " + levelName);
    }

    @Override
    public void win() {
        System.out.println("Poziom " + levelNumber + " zostal pomyslnie ukonczony");
    }

    @Override
    public void exit() {
        System.out.println("Porazka");
    }
}
