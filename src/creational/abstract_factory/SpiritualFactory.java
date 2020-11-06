package creational.abstract_factory;

public class SpiritualFactory extends AbstractFactory {

    @Override
    Book getBook(String bookName) {
        if (bookName.equalsIgnoreCase("Bhagvad Gita")) {
            return new BhagvadGita();
        } else if (bookName.equalsIgnoreCase("Srimad Bhagvatam")) {
            return new SrimadBhagvatam();
        }
        return null;
    }

}
