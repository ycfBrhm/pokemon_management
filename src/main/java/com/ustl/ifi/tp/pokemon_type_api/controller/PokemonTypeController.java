package com.ustl.ifi.tp.pokemon_type_api.controller;

import com.ustl.ifi.tp.pokemon_type_api.bo.PokemonType;
import com.ustl.ifi.tp.pokemon_type_api.service.PokemonTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon-types")
class PokemonTypeController {

    private PokemonTypeService pokemonTypeService;

    public PokemonTypeController(PokemonTypeService pokemonTypeService) {
        this.pokemonTypeService = pokemonTypeService;
    }

    @GetMapping("/{id}")
    PokemonType getPokemonTypeFromId(@PathVariable int id){
        // TODO
        return this.pokemonTypeService.getPokemonType(id);
    }

    @GetMapping(value = "/", params = "name")
    PokemonType getPokemonTypeFromName(@RequestParam String name){
        return this.pokemonTypeService.getPokemonByName(name);
    }

    @GetMapping("/")
    public List<PokemonType> getAllPokemonTypes() {
        // TODO
        return this.pokemonTypeService.getAllPokemonTypes();
    }


}
