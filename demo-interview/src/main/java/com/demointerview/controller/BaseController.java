package com.demointerview.controller;


import com.demointerview.dto.DirectorDetails;
import com.demointerview.dto.Director;
import com.demointerview.service.DirectorDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


}
