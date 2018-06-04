package Controller;

import Model.ArcMap;

public class Game {

    private Block block1 = new Block();
    private Block block2 = new PinkBlock();
    private Block block3 = new MagentaBlock();
    private Block block4 = new BlackBlock();
    private Block block5 = new YellowBlock();

    private int scoreGame;

    private int amauntBlock1;
    private int amauntBlock2;
    private int amauntBlock3;
    private int amauntBlock4;
    private int amauntBlock5;
    private int weapons;

    public Game(ArcMap archive) {
        this.amauntBlock1 = archive.getArcFirstShip();
        this.amauntBlock2 = archive.getArcSecondShip();
        this.amauntBlock3 = archive.getArcThirdShip();
        this.amauntBlock4 = archive.getArcFourthShip();
        this.amauntBlock5 = archive.getArcFivethShip();
    }

    public int estimateScore() {
        scoreGame = amauntBlock1 * block1.getPoint() + amauntBlock2 * block2.getPoint() + amauntBlock3 * block3.getPoint() + amauntBlock4 * block4.getPoint() + amauntBlock5 * block5.getPoint();
        return scoreGame;
    }

}
