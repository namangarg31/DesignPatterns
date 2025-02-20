public class Main {
    public static void main(String[] args) {

        Document d1 = DocumentFactory.getDocument("PDF");
        d1.create();
        Document d2 = DocumentFactory.getDocument("WORD");
        d2.create();
    }
}