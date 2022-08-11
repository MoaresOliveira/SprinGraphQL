package io.github.moaresoliveira.graphqlapi.controller;

import io.github.moaresoliveira.graphqlapi.model.Coffee;
import io.github.moaresoliveira.graphqlapi.model.Size;
import io.github.moaresoliveira.graphqlapi.service.CoffeeService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @QueryMapping
    public List<Coffee> findAll() {
        return coffeeService.findAll();
    }

    @QueryMapping
    public Optional<Coffee> findOne(@Argument Long id) {
        return coffeeService.findOne(id);
    }

    @MutationMapping
    public Coffee createCoffe(@Argument String name, @Argument Size size) {
        return coffeeService.createCoffe(name, size);
    }

    @MutationMapping
    public Coffee updateCoffe(@Argument Long id, @Argument String name, @Argument Size size) {
        return coffeeService.updateCoffe(id, name, size);
    }

    @MutationMapping
    public Boolean deleteCoffe(@Argument Long id) {
        return coffeeService.deleteCoffe(id);
    }

}
