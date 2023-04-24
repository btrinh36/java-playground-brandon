public class Dog extends Animal{

    public Dog(String name, int age) {super(name,age);}

    @Override
    public void play(){
        System.out.println("Dog "+name+" is chasing its tail");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Dog "+name+" is trying to eat the "+toy);
    }
}
