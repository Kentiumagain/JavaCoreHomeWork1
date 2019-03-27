public abstract class Animal implements Competitor {
    protected String name;
    protected String type;

    protected int maxdistance;
    protected int maxjumpheight;
    protected int maxswimdist;

    protected Boolean onDist=true;

    public Animal(String name, String type, int maxdistance, int maxjumpheight, int maxswimdist) {
        this.name = name;
        this.type = type;
        this.maxdistance = maxdistance;
        this.maxjumpheight = maxjumpheight;
        this.maxswimdist = maxswimdist;
    }

    public void run(int dist)
    {
        if (dist<=maxdistance)
            System.out.println(type+" "+name+" успешно пробежал кросс");
        else
        {
            onDist=false;
            System.out.println(type+" "+name+" не смог пробежать кросс");
        }
    }
    public void jump(int height)
    {
        if (height <= maxjumpheight) {
            System.out.println(type + " " + name + " успешно перепрыгнул препятствие");
        } else {
            onDist = false;
            System.out.println(type + " " + name + " не смог перепрыгнуть препятствие");
        }
    }
    public void swim(int dist)
    {
        if (dist==0) {
            System.out.println(type+" "+name+" не умеет плавать");
            onDist=false;
            return;
        }
        if (dist<=maxswimdist)
            System.out.println(type+" "+name+" успешно проплыл дистанцию");
        else
        {
            onDist=false;
            System.out.println(type+" "+name+" не смог переплыть дистанцию");
        }
    }

    @Override
    public void info() {
        if (onDist)
            System.out.println(type+" "+name+" прошел полосу!");
        else System.out.println(type+" "+name+" не смог пройти полосу");
    }

    @Override
    public boolean OnDistance() {
        return onDist;
    }
}
