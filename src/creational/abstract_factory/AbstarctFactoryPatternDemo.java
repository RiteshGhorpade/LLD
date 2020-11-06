package creational.abstract_factory;

public class AbstarctFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory mat = FactoryProducer.getFactory("Material");
        AbstractFactory spi = FactoryProducer.getFactory("Spiritual");
        Book C = mat.getBook("Let Us C");
        Book B = spi.getBook("Bhagvad Gita");
        C.printPrice();
        B.printPrice();
    }

}
