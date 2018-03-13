package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.RecipeService;
import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {


    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {

        log.debug("find all recipes");
        Iterable<Recipe> recipes = recipeRepository.findAll();

        Set<Recipe> retRecipes = new HashSet<>();

        recipes.iterator().forEachRemaining(retRecipes::add);
        return retRecipes;
    }
}
