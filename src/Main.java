public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();
        Owl hedwig = new Owl();
//        wagyu.sound();
//        donald.sound();
//        burin.sound();
//        hedwig.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        PekingDuck fourseason = new PekingDuck("4ss");
        fourseason.clean(daisy);
        fourseason.fly();
        donald.clean(new Cow());
    }
}