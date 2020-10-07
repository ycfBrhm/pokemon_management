package com.ustl.ifi.tp.pokemon_type_api.service;

import com.ustl.ifi.tp.pokemon_type_api.bo.PokemonType;
import com.ustl.ifi.tp.pokemon_type_api.repository.PokemonTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService{

    protected PokemonTypeRepository pokemonTypeRepository;


    public PokemonTypeServiceImpl(PokemonTypeRepository pokemonTypeRepository){ // TODO
        this.pokemonTypeRepository = pokemonTypeRepository;
    }

    @Override
    public PokemonType getPokemonType(int id) {
        // TODO

        return this.pokemonTypeRepository.findPokemonTypeById(id);
    }

    public PokemonType getPokemonByName(String name){
        return this.pokemonTypeRepository.findPokemonTypeByName(name);
    }

    @Override
    public List<PokemonType> getAllPokemonTypes(){
        // TODO
        return this.pokemonTypeRepository.findAllPokemonType();
    }
}
