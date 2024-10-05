public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        return builder.getResult();
    }
}
