

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.name = "청둥오리";
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(this.name + "입니다");
    }

}
