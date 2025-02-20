public class DocumentFactory {
    public static Document getDocument(String typeOfDocument) {
        return switch (typeOfDocument) {
            case "PDF" -> new PDF();
            case "WORD" -> new Word();
            default -> null;
        };
    }
}
