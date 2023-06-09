package com.demointerview.mapper;

import com.demointerview.dto.DirectorDetails;
import com.demointerview.dto.DirectorDetails.DirectorDetailsBuilder;
import com.demointerview.models.DirectorDetailsEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-02T16:03:53+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230413-0857, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class DirectorDetailsMapperImpl implements DirectorDetailsMapper {

    @Override
    public DirectorDetails domainToDto(DirectorDetailsEntity entity) {
        if ( entity == null ) {
            return null;
        }

        DirectorDetailsBuilder directorDetails = DirectorDetails.builder();

        directorDetails.movieDets( DirectorDetailsMapper.getMovieDetails( entity ) );
        directorDetails.name( entity.getName() );

        return directorDetails.build();
    }
}
