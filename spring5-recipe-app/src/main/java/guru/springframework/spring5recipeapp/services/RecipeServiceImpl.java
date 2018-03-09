package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.RecipeService;
import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {


    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public Set<Recipe> getRecipes() {
        Iterable<Recipe> recipes = recipeRepository.findAll();

        Set<Recipe> retRecipes = new HashSet<>();

        recipes.iterator().forEachRemaining(retRecipes::add);
        return retRecipes;
    }
}
