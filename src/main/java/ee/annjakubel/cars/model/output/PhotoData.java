package ee.annjakubel.cars.model.output;

import lombok.Data;

@Data
public class PhotoData {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;

}
