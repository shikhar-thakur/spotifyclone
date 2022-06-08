package com.songs.details.SongsDetailsService.Controller;


import com.songs.details.SongsDetailsService.Domain.Songs;
import com.songs.details.SongsDetailsService.Exception.SongAlreadyExistsException;
import com.songs.details.SongsDetailsService.Service.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class SongsController {

    private SongsService songsService;
    private ResponseEntity<?> responseEntity;

    @Autowired
    public SongsController(SongsService songsService) {
        this.songsService = songsService;

    }

    @PostMapping("/add/songs")
    public ResponseEntity<?> saveSongsInDb(@RequestBody Songs songs) throws SongAlreadyExistsException {
        responseEntity=new ResponseEntity<>(songsService.saveSongs(songs), HttpStatus.CREATED);
        return responseEntity;
    }
    @GetMapping("/songs/details")
    public ResponseEntity<?> listOfSongs()
    {
        responseEntity=new ResponseEntity<> (songsService.getAllSongs(),HttpStatus.OK);
        return responseEntity;
    }
}
