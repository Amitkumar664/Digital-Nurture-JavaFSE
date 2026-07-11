public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Excel Document Opened");
    }

    @Override
    public void close() {
        System.out.println("Excel Document Closed");
    }
}