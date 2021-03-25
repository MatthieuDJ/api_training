package fr.esiea.ex4A.FakeTinder;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class FakeTinderController {

    @PostMapping(path = "api/inscription")
    void registerUser(@RequestBody User user){
        System.out.println(user);
    }

    @GetMapping(path = "api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Match> getMatches(String name, String country){

        return new MatchResponse(new Match("Jean", "Castex"),
            new Match("Emmanuel", "Macron"),
            new Match("Anne", "Hidalgo"));
    }
}
