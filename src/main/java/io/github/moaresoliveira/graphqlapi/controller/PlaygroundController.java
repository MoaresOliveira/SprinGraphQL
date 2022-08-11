package io.github.moaresoliveira.graphqlapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PlaygroundController {

    @GetMapping
    public String graphiql() {
        return "redirect:/graphiql?path=/graphql";
    }

}
