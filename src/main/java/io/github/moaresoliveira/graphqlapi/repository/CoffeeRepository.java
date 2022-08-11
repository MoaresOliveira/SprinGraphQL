package io.github.moaresoliveira.graphqlapi.repository;

import io.github.moaresoliveira.graphqlapi.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
}
