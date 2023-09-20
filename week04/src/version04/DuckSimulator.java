package version04;

public class DuckSimulator {
    public static void main(String[] args) {

//        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        // readHeadDuck.fly();


//        DecoyDuck decoyDuck = new DecoyDuck();
//        decoyDuck.fly(); // 없는 기능
//        decoyDuck.quack(); // 없는 기능

//        RubberDuck rubberDuck = new RubberDuck();
        MallardDuck mallardDuck = new MallardDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
//        rubberDuck.quack();

//        rubberDuck.fly(); //없는 기능
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        decoyDuck.performFly();
        decoyDuck.performQuack();

        readHeadDuck.performFly();
        readHeadDuck.performQuack();

        rubberDuck.performFly();
        rubberDuck.performQuack();

//        mallardDuck.fly();
//        mallardDuck.quack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        FlyBehavior nuriho = new FlyRocketPowered();
        //modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setFlyBehavior(nuriho);
        modelDuck.performFly();
    }
}
