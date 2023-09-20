

public class ModelDuck extends Duck{

    public ModelDuck(){
        this.name = "모델오리";
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("모델 오리입니다.");
    }
}
