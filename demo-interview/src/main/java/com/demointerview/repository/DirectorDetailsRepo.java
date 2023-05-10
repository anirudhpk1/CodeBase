package com.demointerview.repository;

import com.demointerview.models.DirectorDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DirectorDetailsRepo extends CrudRepository<DirectorDetailsEntity, Long> {

    Optional<DirectorDetailsEntity> findByName(String name);

}
