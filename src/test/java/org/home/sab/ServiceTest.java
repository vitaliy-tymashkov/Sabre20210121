package org.home.sab;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {

    @Test
    public void add() {
        Service service = new Service();
        int a = 1_000;
        int b = 1_000;
        int expectedResult = 2_000;
        int actualResult = service.add(a, b);

        assertEquals(expectedResult, actualResult);
    }
}