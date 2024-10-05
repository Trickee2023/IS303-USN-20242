public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.setBuilder(builder);
        Product product = director.construct();

        System.out.println(product);
    }
}
