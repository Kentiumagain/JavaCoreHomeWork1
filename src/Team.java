public class Team {
    String name;
    Competitor[] c;
    private int countwin=0;
    public Team(String name, Competitor[] c) {
        this.name = name;
        this.c = c;
    }

    void ShowWinners() {
        for (Competitor comp : c) {
            if (comp.OnDistance()) {
                countwin++;
                comp.info();
            }
        }
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = ");
    }

    void ShowLosers()
    {
        for (Competitor comp : c) {
            if (!comp.OnDistance()) {
                comp.info();
            }
        }
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = ");
    }
    public Competitor[] getC() {
        return c;
    }

    public int getCountwin() {
        return countwin;
    }

    public String getName() {
        return name;
    }
}

