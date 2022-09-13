package mycodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PollingExerciseTest {
    private PollingExercise pollingExercise;

    @BeforeEach
    void setUp() {
        pollingExercise = new PollingExercise();

    }

    @Test
    void testCalculateAverage() {
        //given
        int[] pollNumbers = {10, 20, 30, 40, 50};
        //when
        pollingExercise.CalculateAverage(pollNumbers);
        assertEquals(30, pollingExercise.getAverageRatings());

    }

    @Test
    void testToCalculateHighestPoints() {
        int[] pollNumbers = {10, 20, 30, 40, 50};
        int highestPoint = pollingExercise.getHighestPoint(pollNumbers);
        assertEquals(50, highestPoint);
    }

    @Test
    void testCalculateLowestPoints() {
        int[] pollNumbers = {10, 20, 30, 40, 50};
        //given
        int lowestPoint = pollingExercise.getLowestPoint(pollNumbers);
        assertEquals(10, lowestPoint);

    }

}


