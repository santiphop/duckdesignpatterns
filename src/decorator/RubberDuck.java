package decorator;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
