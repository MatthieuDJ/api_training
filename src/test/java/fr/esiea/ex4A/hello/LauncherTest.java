package fr.esiea.ex4A.hello;

import org.junit.jupiter.api.Test;
import fr.esiea.ex4A.Launcher;
import fr.esiea.ex4A.FakeTinder.AgifyService;

import static org.junit.jupiter.api.Assertions.*;
public class LauncherTest {
    @Test

    void agifyService_test(){
        Launcher mock = new Launcher();
        AgifyService agifyService = mock.agifyService();
        assertNotNull(agifyService);
    }
}
