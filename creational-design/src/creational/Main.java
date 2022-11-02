package creational;

public class Main {

    public static void main(String[] args) throws Exception {
        BookMetadataExporter exporter = new CSVBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);
    }
}