public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("Parte 1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Parte 2");
    }

    @Override
    public void buildPart3() {
        product.setPart3("Parte 3");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
