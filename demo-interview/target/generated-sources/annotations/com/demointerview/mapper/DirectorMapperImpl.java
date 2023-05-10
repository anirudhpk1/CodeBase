package com.demointerview.mapper;

import com.demointerview.dto.Director;
import com.demointerview.models.DirectorDetailsEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-10T10:38:30+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class DirectorMapperImpl implements DirectorMapper {

    @Override
    public List<Director> domainToDto(List<DirectorDetailsEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Director> list = new ArrayList<Director>( entities.size() );
        for ( DirectorDetailsEntity directorDetailsEntity : entities ) {
            list.add( directorDetailsEntityToDirector( directorDetailsEntity ) );
        }

        return list;
    }

    protected Director directorDetailsEntityToDirector(DirectorDetailsEntity directorDetailsEntity) {
        if ( directorDetailsEntity == null ) {
            return null;
        }

        Director.DirectorBuilder director = Director.builder();

        director.id( directorDetailsEntity.getId() );
        director.name( directorDetailsEntity.getName() );

        return director.build();
    }
}
