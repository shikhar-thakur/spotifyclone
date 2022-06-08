package com.songs.details.SongsDetailsService.Service;

import com.songs.details.SongsDetailsService.Domain.Songs;
import com.songs.details.SongsDetailsService.Exception.SongAlreadyExistsException;

import java.util.List;

public interface SongsService {
    Songs saveSongs(Songs songs)throws SongAlreadyExistsException;
    List<Songs> getAllSongs();
}
