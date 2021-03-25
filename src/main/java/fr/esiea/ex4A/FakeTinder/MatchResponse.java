package fr.esiea.ex4A.FakeTinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MatchResponse extends ArrayList<Match> {

    public MatchResponse(List<Match> matches){
        super();
        this.addAll(matches);
    }

    public MatchResponse(Match... matches){
        super();
        this.addAll(Arrays.asList(matches));
    }
}
