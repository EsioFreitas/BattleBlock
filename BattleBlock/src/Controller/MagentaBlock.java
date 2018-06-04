package Controller;

public class MagentaBlock extends Block {

    public static final int amaunt = 3;

    private int point;

    public MagentaBlock() {
        this.point = 50;
    }

    @Override
    public int getPoint() {
        return point;
    }
}
