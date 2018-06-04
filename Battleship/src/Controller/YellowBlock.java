package Controller;

public class YellowBlock extends Block {

    public static final int amaunt = 5;

    private int point;

    public YellowBlock() {
        this.point = 100;
    }

    @Override
    public int getPoint() {
        return point;
    }
}
