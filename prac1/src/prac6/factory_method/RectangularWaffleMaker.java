package prac6.factory_method;

public class RectangularWaffleMaker implements WaffleMaker {
    @Override
    public Waffle factoryMethod() {
        return new RectangularWaffle();
    }
}
