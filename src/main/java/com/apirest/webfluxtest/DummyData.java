package com.apirest.webfluxtest;

import com.apirest.webfluxtest.document.Playlist;
import com.apirest.webfluxtest.repository.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

/*@Component
public class DummyData implements CommandLineRunner {

    private final PlaylistRepository playlistRepository;

    public DummyData(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        playlistRepository.deleteAll()
                .thenMany(
                        Flux.just("Playlist 1", "Playlist 2", "Playlist 3", "Playlist 4", "Playlist 5")
                            .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
                            .flatMap(playlistRepository::save))
                .subscribe(System.out::println);

    }
}*/
