public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void DoIt(Competitor compt) {
        compt.jump(height);
    }
}
