package structural.adapter;

public class Main {

    public static void main(String[] args) {

        // Uzytkownik wersji v2:
        GameLevelv2 gameLevelv2 = new GameLevelv2("Poziom pierwszy" , 1);
        gameLevelv2.start("gracz testowy");
        gameLevelv2.lost("gracz testowy");
        gameLevelv2.win("gracz testowy");

        // Użytkownik wersji v1
        GameLevel gameLevel = new GameLevel("Poziom pierwszy" , 1);
        gameLevel.start("gracz testowy");
        gameLevel.win();
        gameLevel.exit();


        GameLevelv2 gameLevelv2Second = new GameLevelv2("Poziom 13" , 13);
        GameLevelAdapter gameLevelAdapter = new GameLevelAdapter(gameLevelv2Second ,"Testowy 2");
        gameLevelAdapter.start("");
        gameLevelAdapter.win();
        gameLevelAdapter.exit();

    }
}
