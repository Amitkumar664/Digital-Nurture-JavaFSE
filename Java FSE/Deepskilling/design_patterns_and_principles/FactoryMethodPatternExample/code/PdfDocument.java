public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("PDF Document Opened");
    }

    @Override
    public void close() {
        System.out.println("PDF Document Closed");
    }
}