package ee.annjakubel.cars.model.input;

import lombok.Data;

import java.util.ArrayList;

@Data
public class PhotoResponse {
    ArrayList<PhotoList> allPhotos = new ArrayList<PhotoList>();
}

@Data
class PhotoList {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;
}
