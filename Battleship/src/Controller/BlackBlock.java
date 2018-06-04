package Controller;

public class BlackBlock extends Block {

    public static final int amaunt = 4;

    private int point;

    public BlackBlock() {
        this.point = 70;
    }

    @Override
    public int getPoint() {
        return point;
    }
}
