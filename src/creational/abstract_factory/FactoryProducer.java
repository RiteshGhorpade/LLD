package creational.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String typeOfFactory) {
        if (typeOfFactory.equalsIgnoreCase("Material")) {
            return new MaterialFactory();
        } else if (typeOfFactory.equalsIgnoreCase("Spiritual")) {
            return new SpiritualFactory();
        }
        return null;
    }
}
