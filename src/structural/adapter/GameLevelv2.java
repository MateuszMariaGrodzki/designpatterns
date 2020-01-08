package structural.adapter;

public class GameLevelv2 implements Gamev2 {
    private String levelName;
    private int levelNumber;

    public GameLevelv2(String levelName, int levelNumber) {
        this.levelName = levelName;
        this.levelNumber = levelNumber;
    }

    @Override
    public void start(String playerName) {
        System.out.println("Gracz " + playerName + " rozpoczyna poziom " + levelName);
    }

    @Override
    public void win(String playerName) {
        System.out.println("Gracz " + playerName + " przechodzi pomyslnie poziom " + levelNumber);
    }

    @Override
    public void lost(String playerName) {
        System.out.println("Graczowi " + playerName + " nie udaje się przejść poziomu " + levelNumber);
    }
}
