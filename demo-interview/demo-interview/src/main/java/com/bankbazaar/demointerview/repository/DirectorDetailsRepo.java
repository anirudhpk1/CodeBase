package com.bankbazaar.demointerview.repository;

import com.bankbazaar.demointerview.models.DirectorDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorDetailsRepo extends CrudRepository<DirectorDetailsEntity, Long> {

}
