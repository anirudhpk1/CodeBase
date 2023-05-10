package com.demointerview.controller;


import com.demointerview.dto.DirectorDetails;
import com.demointerview.dto.Director;
import com.demointerview.models.DirectorDetailsEntity;
import com.demointerview.service.DirectorDetailsService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/details")
public class BaseController {

    @Autowired
    DirectorDetailsService service;

    @GetMapping("/directors/{id}")
    public ResponseEntity<DirectorDetails> listDetails(@PathVariable("id") Long id){
        DirectorDetails dto = service.getDirectorDetails(id);
        if(Objects.nonNull(dto)){
            return new ResponseEntity<>(dto, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/directors")
    public ResponseEntity<List<Director>> listDirectors(){
        List<Director> dto = service.getDirectors();
        if(Objects.nonNull(dto)){
            return new ResponseEntity<>(dto, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @GetMapping("/directors/name/{name}")
    public ResponseEntity<DirectorDetails> listDetailsByName(@PathVariable("name") String name){
        DirectorDetails dto = service.getDirectorDetailsByName(name);
        if(Objects.nonNull(dto)){
            return new ResponseEntity<>(dto, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/directors/image/{image}")
    public ResponseEntity<byte[]> getImage(@PathVariable("image") String image) throws IOException {

        DirectorDetails dto = service.getDirectorImageByName(image);
        if(Objects.nonNull(dto)){

            InputStream in = getClass().getResourceAsStream(dto.getDirector_image());
            byte[] imageBytes = IOUtils.toByteArray(in);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            headers.setContentLength(imageBytes.length);

            return new ResponseEntity<byte[]>(imageBytes, headers, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }




}
