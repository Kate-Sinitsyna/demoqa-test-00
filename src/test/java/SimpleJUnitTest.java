package src.test.java;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll(){                         //общая конфигурация перед запусками всех тестов
        System.out.println("###    beforeAll2\n");
    }

    @BeforeEach
    void beforeEach() {                            //запускается общий код перед каждым новым тестом
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

    private int getResult() {
        return 3;
    }

    @AfterEach                 //запускается общий код после каждого нового теста
    void AfterEach() {
        System.out.println("###    AfterEach\n");
        result = 0;
    }

    @AfterAll
    static void afterAll(){
        System.out.println("###    AfterAll\n");
    }
}

