package com.playlist.PlayListService.Service;

import com.playlist.PlayListService.Domain.Playlist;
import com.playlist.PlayListService.Repository.PlayListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayListServiceImpl implements PlayListService{

    private PlayListRepository playListRepository;

    @Autowired
    public PlayListServiceImpl(PlayListRepository playListRepository) {
        this.playListRepository = playListRepository;
    }

    @Override
    public Playlist saveToPlaylist(Playlist playlist) {
        return playListRepository.save(playlist);
    }

    @Override
    public List<Playlist> showPlaylist() {
        return playListRepository.findAll();
    }
}
