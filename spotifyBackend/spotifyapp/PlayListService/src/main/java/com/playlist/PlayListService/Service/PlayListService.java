package com.playlist.PlayListService.Service;

import com.playlist.PlayListService.Domain.Playlist;

import java.util.List;

public interface PlayListService {
    Playlist saveToPlaylist(Playlist playlist);
    List<Playlist> showPlaylist();
}
