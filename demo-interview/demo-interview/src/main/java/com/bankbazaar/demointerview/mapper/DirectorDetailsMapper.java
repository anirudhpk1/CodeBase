package com.bankbazaar.demointerview.mapper;

import com.bankbazaar.demointerview.dto.DirectorDetails;
import com.bankbazaar.demointerview.models.DirectorDetailsEntity;
import com.bankbazaar.demointerview.pojo.MovieDetails;
import com.bankbazaar.demointerview.util.JsonUtil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DirectorDetailsMapper {

    @Mapping(target = "movieDets", source = ".", qualifiedByName = "movieDetails")
    DirectorDetails domainToDto(DirectorDetailsEntity entity);

    @Named("movieDetails")
    public static List<MovieDetails> getMovieDetails(DirectorDetailsEntity entity) {
        String movies = entity.getMovies();
        Type mockDetailsType = new TypeToken<List<MovieDetails>>() {}.getType();
        return JsonUtil.getGson().fromJson(movies, mockDetailsType);
    }
}
