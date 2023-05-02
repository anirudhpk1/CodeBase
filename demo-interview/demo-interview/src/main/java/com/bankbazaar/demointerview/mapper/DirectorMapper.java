package com.bankbazaar.demointerview.mapper;


import com.bankbazaar.demointerview.models.DirectorDetailsEntity;
import com.bankbazaar.demointerview.dto.Director;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DirectorMapper {
    List<Director> domainToDto(List<DirectorDetailsEntity> entities);
}
