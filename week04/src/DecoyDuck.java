
public class DecoyDuck extends Duck {

    public DecoyDuck (){
        this.name = "미끼오리";
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("미끼오리 입니다");
    }
}
