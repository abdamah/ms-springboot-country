package com.riigsoft.controller;

import com.riigsoft.model.Country;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/countries/api/v1")
public class CountryController {

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        //We can use RestTemplate to consume api
            //String url ="https://restcountries.eu/rest/v2/all";

        // We can store into db and retrieve

        //Now I am hard coding it.
        return ResponseEntity.ok(
                List.of(
                        new Country("USA", "$"),
                        new Country("SOMALIA", "SHLN"),
                        new Country("INDIA", "RUPEE")
                )
        );

    }

    @GetMapping("/find/{continent}")
    public ResponseEntity<List<Country>>
    findByContinent(@PathVariable String continent){
        String continentLC = continent.toLowerCase();
        if(continentLC.equals("asia")) {
            return ResponseEntity.ok(
                    List.of(
                            new Country("INDIA", "RUPEE"),
                            new Country("PAKISTAN", "RUPEE")

                    )
            );
        }
            if(continentLC.equals("africa")){
            return ResponseEntity.ok(
                     List.of(
                        new Country("SOMALIA","SHLN"),
                        new Country("ETHOIPIA","BIRR")

                    )
            );
        }

        return ResponseEntity.ok(List.of());
    }
}
