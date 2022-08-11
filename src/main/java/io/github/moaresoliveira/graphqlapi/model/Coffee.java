package io.github.moaresoliveira.graphqlapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "coffee")
public class Coffee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Size size;

    public Coffee(String name, Size size) {
        this.name = name;
        this.size = size;
    }
}
