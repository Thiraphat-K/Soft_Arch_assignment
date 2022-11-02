package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see
        // fit.
        JSONObject bookObject = new JSONObject();
        bookObject.put(Book.Metadata.ISBN.value, b.getISBN());

        // JSONObject bookData = new JSONObject();
        bookObject.put(Book.Metadata.TITLE.value, b.getTitle());
        bookObject.put(Book.Metadata.PUBLISHER.value, b.getPublisher());

        JSONArray authors = new JSONArray();
        for (String author : b.getAuthors()) {
            authors.add(author);
        }
        bookObject.put(Book.Metadata.AUTHORS.value, authors);

        jsonArray.add(bookObject);
        
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        return jsonArray.toString();
    }
}