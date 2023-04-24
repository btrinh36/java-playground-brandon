public class Rabbit extends Animal{
    private String eyecolor;

    public Rabbit(String name, int age, String iColor){
        super(name,age);
        eyecolor = iColor;
    }

    @Override
    public void play(){
        System.out.println("Rabbit "+name+" is idling");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Rabbit "+name+" is ignoring "+toy);
    }
}
