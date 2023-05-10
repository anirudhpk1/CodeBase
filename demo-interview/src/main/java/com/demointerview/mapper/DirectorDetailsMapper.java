package com.demointerview.mapper;

import com.demointerview.dto.DirectorDetails;
import com.demointerview.models.DirectorDetailsEntity;
import com.demointerview.pojo.MovieDetails;
import com.demointerview.util.JsonUtil;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import com.google.gson.reflect.TypeToken;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import java.lang.reflect.Type;
import java.util.List;


@Mapper(componentModel = "spring")
public interface DirectorDetailsMapper {

    DirectorDetailsMapper MAPPER = Mappers.getMapper(DirectorDetailsMapper.class);

    @Mapping(target = "movieDets", source = ".", qualifiedByName = "movieDetails")
    DirectorDetails domainToDto(DirectorDetailsEntity entity);

    @Named("movieDetails")
    public static List<MovieDetails> getMovieDetails(DirectorDetailsEntity entity) {
        String movies = entity.getMovies();
        Type mockDetailsType = new TypeToken<List<MovieDetails>>() {}.getType();
        return JsonUtil.getGson().fromJson(movies, mockDetailsType);
    }




}
