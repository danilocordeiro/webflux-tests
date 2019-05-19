package com.apirest.webfluxtest.repository;

import com.apirest.webfluxtest.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {
}
