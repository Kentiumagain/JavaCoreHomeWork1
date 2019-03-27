public class Water extends Obstacle {
    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void DoIt(Competitor compt) {
        compt.swim(dist);
    }
}
