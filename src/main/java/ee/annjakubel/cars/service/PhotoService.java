package ee.annjakubel.cars.service;

import ee.annjakubel.cars.model.input.PhotoResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Log4j2
public class PhotoService {

    @Value("${photos.url}")
    String photosUrl;

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<PhotoResponse[]> getAllPhotos() {

        ResponseEntity<PhotoResponse[]> response = restTemplate.exchange(photosUrl, HttpMethod.GET, null, PhotoResponse[].class);
        log.info("Getting photos from URL");

        return response;
    }

}
