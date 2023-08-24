package com.example.sqch10ex4.Controller;

import com.example.sqch10ex4.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country c = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "europe")
                .header("capital", "paris")
                .header("favorite food", "cheese and wine")
                .body(c);
    }

}
