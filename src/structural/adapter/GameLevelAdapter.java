package structural.adapter;

public class GameLevelAdapter implements Game {
    GameLevelv2 gameLevelv2;
    String playerName;

    public GameLevelAdapter(GameLevelv2 gameLevelv2, String playerName){
        this.gameLevelv2 = gameLevelv2;
    }

    @Override
    public void start(String playerName) {
        gameLevelv2.start(this.playerName);
    }

    @Override
    public void win() {
        gameLevelv2.start(playerName);
    }

    @Override
    public void exit() {
        gameLevelv2.start(playerName);
    }
}
