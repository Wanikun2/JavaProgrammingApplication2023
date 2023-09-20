

public abstract class Duck {
    String name;
    FlyBehavior flyBehavior; // Association (Composition)
    QuackBehavior quackBehavior; // Association (Composition)

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("수영중");
    }
    public abstract void display();
}
