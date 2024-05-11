public class Main {

    public static void main(String[] args) {
        System.out.println("*****");
        // testing inherited methods of subclass instance
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println("HouseCat instance inherited method: " + garfield.isTired());

        // testing subclass constructor with super keyword
        HouseCat spike = new HouseCat("Spike", 13);
        System.out.println("Spike's weight: " + spike.getWeight());

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println("Superclass noise: " + plainCat.noise());
        System.out.println("Subclass noise: " + cheshireCat.noise());
    }

}
