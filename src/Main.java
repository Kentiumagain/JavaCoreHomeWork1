public class Main {
    public static void main(String[] args) {
//123
        Course c1 = new Course(new Obstacle[]{new Wall(2),new Cross(100)});
        Course c2 = new Course(new Obstacle[]{new Wall(6),new Cross(30),new Water(40), new Cross(30)});
        Team t1 = new Team("В мире животных",new Competitor[]{new Cat("Пупенхоулз"),new Cat("Стокгольм")
                ,new Dog("Седовласый"), new Rabbit("Мистер Нопроблемз"), new Human("Николай Дроздов", 60,2,50)});
        Team t2 = new Team("Сам себе режиссер", new Competitor[]{new Human("Любитель собак Александр", 100,10,100),
                new Dog("Чихуахуа"),new Dog("Мистер BARK"), new Dog("Бондюэль")});
        c1.DoIt(t1);
        c1.DoIt(t2);
        t1.ShowWinners();
        t2.ShowWinners();
        t1.ShowLosers();
        t2.ShowLosers();
        c1.Won(t1,t2);
    }
}