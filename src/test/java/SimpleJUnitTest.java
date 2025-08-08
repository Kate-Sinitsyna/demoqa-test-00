package src.test.java;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll(){
        System.out.println("###    beforeAll1\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###    beforeEach");
        result = getResult();
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###    beforeEach");
        result = getResult();
    }

    @Test
    void firstTest() {
        System.out.println("###    firstTest");
        Assertions.assertTrue(result>2);
    }

    @Test
    void secondTest() {
        System.out.println("###    secondTest");
        Assertions.assertTrue(result>2);
    }

    @Test
    void thirdTest() {
        System.out.println("###    thirdTest");
        Assertions.assertTrue(result>2);
    }

    @Test
    void thirdTest() {
        System.out.println("###    thirdTest");
        Assertions.assertTrue(result>2);
    }

    private int getResult() {
        return 3;
    }

    @AfterEach
    void AfterEach() {
        System.out.println("###    AfterEach\n");
        result = 0;
    }

    @AfterAll
    static void afterAll(){
        System.out.println("###    AfterAll\n");
    }
}

