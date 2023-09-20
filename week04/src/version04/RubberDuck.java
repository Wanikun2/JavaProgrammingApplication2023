package version04;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.name = "러버덕";
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("노랑색 고무 오리입니다");
    }

//    @Override
//    public void quack() {
//        System.out.println("삑삑");
//    }
//
//    @Override
//    public void display() {
//
//    }
}
