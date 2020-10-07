package com.ustl.ifi.tp.pokemon_type_api.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ustl.ifi.tp.pokemon_type_api.bo.PokemonType;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class PokemonTypeRepositoryImpl implements PokemonTypeRepository {

    private List<PokemonType> pokemons;

    public PokemonTypeRepositoryImpl() {
        try {
            var pokemonsStream = new ClassPathResource("pokemons.json").getInputStream();

            var objectMapper = new ObjectMapper();
            var pokemonsArray = objectMapper.readValue(pokemonsStream, PokemonType[].class);
            this.pokemons = Arrays.asList(pokemonsArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PokemonType findPokemonTypeById(int id) {
        System.out.println("Loading Pokemon information for Pokemon id " + id);

        // TODO
        PokemonType pokToReturn = null;
        for(PokemonType p : this.pokemons){
            if( p.getId() == id){
                pokToReturn = p;
            }
        }
        return pokToReturn;
    }

    @Override
    public PokemonType findPokemonTypeByName(String name) {
        System.out.println("Loading Pokemon information for Pokemon name " + name);

        // TODO
        PokemonType pokToReturn = null;
        for(PokemonType p : this.pokemons){
            if( name.equals(p.getName())){
                pokToReturn = p;
            }
        }
        return pokToReturn;
    }

    @Override
    public List<PokemonType> findAllPokemonType() {
        // TODO

        return  this.pokemons;
    }
}
