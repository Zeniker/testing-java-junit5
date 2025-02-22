package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("model")
public interface ModelTests {

    @BeforeEach
    default void beforeEachConsoleOutput(TestInfo testInfo){
        //RepetitionInfo só existe para RepeatedTests
        System.out.println("Running Test - " + testInfo.getDisplayName());
    }
}
