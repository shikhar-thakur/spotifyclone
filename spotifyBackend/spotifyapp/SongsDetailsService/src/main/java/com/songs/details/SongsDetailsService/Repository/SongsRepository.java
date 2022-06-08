package com.songs.details.SongsDetailsService.Repository;

import com.songs.details.SongsDetailsService.Domain.Songs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepository extends MongoRepository<Songs,Integer> {

}
