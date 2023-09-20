
public class ReadHeadDuck extends Duck {
    public ReadHeadDuck() {
        this.name = "아메리칸흰죽지";
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(this.name + "입니다");
    }

//    @Override
//    public void fly() {
//
//    }
//
//    @Override
//    public void quack() {
//        System.out.println("꽥꽥");
//    }
}
