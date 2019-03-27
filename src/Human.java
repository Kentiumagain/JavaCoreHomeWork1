public class Human implements Competitor{
    protected String name;
    protected String type;

    protected int maxdistance;
    protected int maxjumpheight;
    protected int maxswimdist;

    protected Boolean onDist=true;

    public Human(String name, int maxdistance, int maxjumpheight, int maxswimdist) {
        this.name = name;
        this.maxdistance = maxdistance;
        this.maxjumpheight = maxjumpheight;
        this.maxswimdist = maxswimdist;
    }
    @Override
    public void run(int dist)
    {
        if (dist<=maxdistance)
            System.out.println(name+" успешно пробежал кросс");
        else
        {
            onDist=false;
            System.out.println(name+" не смог пробежать кросс");
        }
    }
    @Override
    public void jump(int height)
    {
        if (height<=maxjumpheight)
            System.out.println(name+" успешно перепрыгнул препятствие");
        else
        {
            onDist=false;
            System.out.println(name+" не смог перепрыгнуть препятствие");
        }
    }

    @Override
    public void swim(int dist)
    {
        if (dist<=maxswimdist)
            System.out.println(name+" успешно проплыл дистанцию");
        else
        {
            onDist=false;
            System.out.println(name+" не смог переплыть дистанцию");
        }
    }

    @Override
    public void info() {
        if (onDist)
            System.out.println(name+" прошел полосу!");
        else System.out.println(name+" не смог пройти полосу");
    }

    @Override
    public boolean OnDistance() {
        return onDist;
    }
}
