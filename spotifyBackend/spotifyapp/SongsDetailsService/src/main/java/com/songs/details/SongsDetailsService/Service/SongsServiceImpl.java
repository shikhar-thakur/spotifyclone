package com.songs.details.SongsDetailsService.Service;

import com.songs.details.SongsDetailsService.Domain.Songs;
import com.songs.details.SongsDetailsService.Exception.SongAlreadyExistsException;
import com.songs.details.SongsDetailsService.Repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsServiceImpl implements SongsService{

    private SongsRepository songsRepository;

    @Autowired
    public SongsServiceImpl(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    @Override
    public Songs saveSongs(Songs songs) throws SongAlreadyExistsException {
        if(songsRepository.findById(songs.getSongId()).isPresent())
        {
            throw new SongAlreadyExistsException();
        }
        return songsRepository.save(songs);
    }

    @Override
    public List<Songs> getAllSongs() {
        return songsRepository.findAll();
    }
}
