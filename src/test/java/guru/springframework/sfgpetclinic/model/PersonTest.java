package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName())
        );

    }

    @Test
    void groupedAssertions2() {
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName(), "First name failed"),
                () -> assertEquals("Buck", person.getLastName(), "Last name failed")
        );

    }

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition}/{totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        //todo - impl
    }


    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }

    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition}/{totalRepetitions}")
    @DisplayName("My Assignment Repeated Test")
    void myAssignmentRepeated() {
        //todo impl
    }
}