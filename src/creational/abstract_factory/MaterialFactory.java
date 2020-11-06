package creational.abstract_factory;

public class MaterialFactory extends AbstractFactory {

    @Override
    Book getBook(String bookName) {
        //
        if (bookName.equalsIgnoreCase("Let Us C")) {
            return new LetUsC();
        } else if (bookName.equalsIgnoreCase("Let Us Java")) {
            return new LetUsJava();
        }
        return null;
    }

}
