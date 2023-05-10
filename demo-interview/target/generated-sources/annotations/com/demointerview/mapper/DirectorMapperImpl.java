package com.demointerview.mapper;

import com.demointerview.dto.Director;
import com.demointerview.dto.Director.DirectorBuilder;
import com.demointerview.models.DirectorDetailsEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-10T12:18:22+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
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

        DirectorBuilder director = Director.builder();

        director.id( directorDetailsEntity.getId() );
        director.name( directorDetailsEntity.getName() );

        return director.build();
    }
}
