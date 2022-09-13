package com.webFlux.pokedex.repository;

import com.webFlux.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokemonRepository extends ReactiveMongoRepository <Pokemon, String> {
}
