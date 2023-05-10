package com.demointerview.service;

import com.demointerview.dto.DirectorDetails;
import com.demointerview.mapper.DirectorDetailsMapper;
import com.demointerview.mapper.DirectorMapper;
import com.demointerview.models.DirectorDetailsEntity;
import com.demointerview.dto.Director;
import com.demointerview.repository.DirectorDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorDetailsService {




    @Autowired
    DirectorDetailsRepo repo;


    @Autowired
    DirectorDetailsMapper mapper;

    @Autowired
    DirectorMapper directorMapper;

    public DirectorDetails getDirectorDetails(Long id) {
        DirectorDetailsEntity entity = repo.findById(id).orElse(null);
        return mapper.domainToDto(entity);
    }

    public List<Director> getDirectors(){
        List<DirectorDetailsEntity> entities = (List<DirectorDetailsEntity>) repo.findAll();
        return directorMapper.domainToDto(entities);
    }


    public DirectorDetails getDirectorDetailsByName(String name) {
        DirectorDetailsEntity entity = repo.findByName(name).orElse(null);
        return mapper.domainToDto(entity);
    }

    public DirectorDetails getDirectorImageByName(String name) {
        DirectorDetailsEntity entity = repo.findByName(name).orElse(null);
        return mapper.domainToDto(entity);
    }






}
