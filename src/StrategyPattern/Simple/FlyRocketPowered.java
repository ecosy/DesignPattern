package StrategyPattern.Simple;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓 추진~!");
    }
}
