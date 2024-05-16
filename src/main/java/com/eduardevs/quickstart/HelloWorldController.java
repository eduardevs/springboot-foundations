package com.eduardevs.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    /*
    * @GetMapping
    * L'annotation @GetMapping au Spring est un outil puissant pour créer des services
    * Web RESTful. Il mappe les requêtes HTTP GET à une méthode de gestionnaire
    * spécifique dans les contrôleurs Spring. Avec l'aide de l'annotation @GetMapping,
    *  nous pouvons facilement définir les points de terminaison de l'API RESTful et
    * gérer diverses requêtes HTTP.
     * https://www.geeksforgeeks.org/spring-postmapping-and-getmapping-annotation/?ref=ml_lbp
     * */
    @GetMapping(path="/hello")
    public String Helloworld() {
        return "hello world!!!";
    }

}
