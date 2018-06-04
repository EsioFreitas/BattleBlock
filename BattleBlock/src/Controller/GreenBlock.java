package Controller;

public class GreenBlock extends Block {

    public static final int amaunt = 4;

    private int point;

    public GreenBlock() {
        this.point = 70;
    }

    @Override
    public int getPoint() {
        return point;
    }
}
