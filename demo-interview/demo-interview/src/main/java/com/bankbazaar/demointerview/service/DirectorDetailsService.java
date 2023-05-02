package com.bankbazaar.demointerview.service;

import com.bankbazaar.demointerview.dto.DirectorDetails;
import com.bankbazaar.demointerview.mapper.DirectorDetailsMapper;
import com.bankbazaar.demointerview.mapper.DirectorMapper;
import com.bankbazaar.demointerview.models.DirectorDetailsEntity;
import com.bankbazaar.demointerview.dto.Director;
import com.bankbazaar.demointerview.repository.DirectorDetailsRepo;
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
}
