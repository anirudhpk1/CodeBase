package com.demointerview.mapper;

import com.demointerview.dto.DirectorDetails;
import com.demointerview.dto.DirectorDetails.DirectorDetailsBuilder;
import com.demointerview.models.DirectorDetailsEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-10T12:18:23+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
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
        directorDetails.director_image( entity.getDirector_image() );

        return directorDetails.build();
    }
}
