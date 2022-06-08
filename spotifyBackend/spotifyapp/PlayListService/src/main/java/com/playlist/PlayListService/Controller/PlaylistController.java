package com.playlist.PlayListService.Controller;

import com.playlist.PlayListService.Domain.Playlist;
import com.playlist.PlayListService.Service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PlaylistController {

private PlayListService playListService;
private ResponseEntity<?> responseEntity;


@Autowired
    public PlaylistController(PlayListService playListService) {
        this.playListService = playListService;
    }

    @PostMapping("/addto/playlist")
    public ResponseEntity<?> saveToplaylist(@RequestBody Playlist playlist)
    {
        responseEntity = new ResponseEntity<>(playListService.saveToPlaylist(playlist), HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/playlist")
    public ResponseEntity<?> showplaylist()
    {
        responseEntity= new ResponseEntity<>(playListService.showPlaylist(),HttpStatus.OK);
        return responseEntity;
    }
}
