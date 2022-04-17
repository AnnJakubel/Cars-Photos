package ee.annjakubel.cars.controller;

import ee.annjakubel.cars.model.input.PhotoResponse;
import ee.annjakubel.cars.model.output.PhotoData;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PhotoController {

    List<PhotoData> allPhotos = new ArrayList<>(); //list kuhu fotod k6ik l2hevad

    @GetMapping("photos")
    public ResponseEntity<PhotoResponse[]> getPhotos() {

        /*{
            "albumId": 1,
                "id": 1,
                "title": "accusamus beatae ad facilis cum similique qui sunt",
                "url": "https://via.placeholder.com/600/92c952",
                "thumbnailUrl": "https://via.placeholder.com/150/92c952"
        }*/

        PhotoData photoData = new PhotoData();
        allPhotos.add(photoData);

        //
        String url = "https://jsonplaceholder.typicode.com/photos";

        RestTemplate restTemplate = new RestTemplate(); //v6imaldab teha HTTP p2ringuid
        ResponseEntity<PhotoResponse[]> response = restTemplate.exchange(url, HttpMethod.GET, null, PhotoResponse[].class);

        return response;

    }
}
