public class Main {
    public static void main(String[] args) {
        Dog dawg = new Dog("Dawg", 15);
        Cat meow = new Cat("Hedgie", 5);
        Rabbit ribbit = new Rabbit("Judy Hops", 18, "Blue");
        Toy beep = new Toy("Lightsaber");

        Action[] animals = new Action[]{dawg, meow, ribbit, beep};
        for(Action friend : animals){
            friend.play(beep);
        }
    }
}
