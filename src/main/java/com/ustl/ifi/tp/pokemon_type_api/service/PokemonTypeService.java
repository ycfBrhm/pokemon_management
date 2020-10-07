package com.ustl.ifi.tp.pokemon_type_api.service;

import com.ustl.ifi.tp.pokemon_type_api.bo.PokemonType;

import java.util.List;

public interface PokemonTypeService {
    PokemonType getPokemonType(int id);
    public PokemonType getPokemonByName(String name);
    List<PokemonType> getAllPokemonTypes();
}
