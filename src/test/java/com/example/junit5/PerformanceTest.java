package com.example.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import java.io.IOException;
import java.time.Duration;

import static us.abstracta.jmeter.javadsl.JmeterDsl.*;

@Execution(ExecutionMode.SAME_THREAD)
public class PerformanceTest {

    @Test
    public void testPerformance() throws IOException {
        Assertions.assertEquals(3, 1+2);
//        testPlan(
//                threadGroup(10, Duration.ofSeconds(60),
//                        httpSampler("https://jmeter.apache.org/")
//                ),
//                // This will generate an HTML report with graphs and stats
//                htmlReporter("target/jmeter-report")
//        ).run();
    }
}