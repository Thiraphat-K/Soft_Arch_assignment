package creational;

import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter create() throws IOException {
        return new JSONBookMetadataFormatter();
    }
    
}