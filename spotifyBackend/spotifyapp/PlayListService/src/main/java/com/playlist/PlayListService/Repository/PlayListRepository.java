package com.playlist.PlayListService.Repository;

import com.playlist.PlayListService.Domain.Playlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayListRepository extends MongoRepository<Playlist,Integer> {
}
