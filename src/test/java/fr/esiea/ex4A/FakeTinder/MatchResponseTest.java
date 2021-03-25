package fr.esiea.ex4A.FakeTinder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class MatchResponseTest {

    @ParameterizedTest
    @ValueSource(strings = {"""
        Gad,Elmaleh
        Kev,Adams
        Dany,Boon
        Coluche,Coluche
        """, """
        Florence,Foresti
        Patrick,Sebastien
        Elie,Kakou
        """
    })
    void matchresponse_fill_list_test(String NomNTwitter){
        List<Match> identifiants = Arrays.stream(NomNTwitter.split("\n")).map(s -> {
            String[] kv = s.split(",");
            return new Match(kv[0],kv[1]);
        }).collect(Collectors.toList());

        MatchResponse matches = new MatchResponse(identifiants);

        matches.forEach(m -> assertTrue(identifiants.contains(m)));

    }

    @ParameterizedTest
    @CsvSource({
        "Florence,Foresti,Patrick,Sebastien,Elie,Kakou"
    })

    void matchresponse_mult_val_test(String Nom1, String Twitter1, String Nom2, String Twitter2, String Nom3, String Twitter3){

        List<Match> identifiants = Arrays.asList(new Match(Nom1, Twitter1),
            new Match(Nom2, Twitter2),
            new Match(Nom3, Twitter3));

        MatchResponse matches = new MatchResponse(identifiants.get(0),
            identifiants.get(1),
            identifiants.get(2));

        matches.forEach(m -> assertTrue(identifiants.contains(m)));
    }
}
