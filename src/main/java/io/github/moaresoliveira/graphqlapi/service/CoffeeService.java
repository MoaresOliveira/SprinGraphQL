package io.github.moaresoliveira.graphqlapi.service;

import io.github.moaresoliveira.graphqlapi.model.Coffee;
import io.github.moaresoliveira.graphqlapi.model.Size;
import io.github.moaresoliveira.graphqlapi.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> findAll() {
        return coffeeRepository.findAll();
    }

    public Coffee createCoffe(String name, Size size) {
        return coffeeRepository.save(new Coffee(name, size));
    }

    public Optional<Coffee> findOne(Long id) {
        return coffeeRepository.findById(id);
    }

    public Coffee updateCoffe(Long id, String name, Size size) {
        Coffee coffee = coffeeRepository.findById(id).orElseThrow();
        coffee.setName(name);
        coffee.setSize(size);
        return coffeeRepository.save(coffee);
    }

    public Boolean deleteCoffe(Long id) {
        Optional<Coffee> coffee = coffeeRepository.findById(id);
        if (coffee.isPresent()) {
            coffeeRepository.delete(coffee.get());
            return true;
        }
        return false;
    }
}
