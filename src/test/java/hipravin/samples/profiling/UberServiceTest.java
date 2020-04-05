package hipravin.samples.profiling;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UberServiceTest {

    @Test
    void doWork() throws IOException {
        for (int i = 0; i < 10_000; i++) {
             UberService.doWork();
        }
    }
}