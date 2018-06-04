package Controller;

public class PinkBlock extends Block {

    public static final int amaunt = 2;

    private int point;

    public PinkBlock() {
        this.point = 30;
    }

    @Override
    public int getPoint() {
        return point;
    }
}
