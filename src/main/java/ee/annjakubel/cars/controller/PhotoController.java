package ee.annjakubel.cars.controller;

import ee.annjakubel.cars.model.input.PhotoResponse;
import ee.annjakubel.cars.service.PhotoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
public class PhotoController {

    @Autowired
    PhotoService photoService;

    @GetMapping("photos")
    public ResponseEntity<PhotoResponse[]> getPhotos() {
        log.info("Request sent");
        return photoService.getAllPhotos();
    }
}
