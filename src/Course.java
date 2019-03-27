public class Course {
    Obstacle[] ob ;

    public Course(Obstacle[] ob) {
        this.ob = ob;
    }
    public void DoIt(Team t)
    {
        Competitor[] com= t.getC();
        for(Competitor c: com)
        {
            for(Obstacle o: ob)
            {
                o.DoIt(c);
            }
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
        }
    }
    public void Won(Team t1, Team t2)
    {
        System.out.println(t1.getCountwin()+" "+t2.getCountwin());
        if (t1.getCountwin()>t2.getCountwin())
        {
            System.out.println("Победила команда '"+t1.getName()+"'!!");
        }
        else if (t1.getCountwin()<t2.getCountwin())
        {
            System.out.println("Победила команда '"+t2.getName()+"'!!");
        }
        else System.out.println("Ничья!");
    }
}
