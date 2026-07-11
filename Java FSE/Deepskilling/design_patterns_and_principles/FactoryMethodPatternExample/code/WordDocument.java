//package Digital-Nurture-JavaFSE.Java FSE.Deepskilling.design_patterns_and_principles.FactoryMethodPatternExample.code;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Word Document Opened");
    }

    @Override
    public void close() {
        System.out.println("Word Document Closed");
    }
}