package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;

    @BeforeAll
    public static void setupAll() {
        System.out.println("Start of all Tests");
    }

    //Before Each Test: New Stack is initialised
    @BeforeEach
    void setup() {
        stack = new Stack();
        System.out.println("Runs Before Current Test");
    }

    @Test
    void push() {
    }

    @Test
    void pop() {
    }

    @Test
    void peak() {
    }

    @Test
    void getSize() {
    }

    //Not Essential in Java: May want to use this for garbage deleting and clearing data after tests
    @AfterEach
    public void afterEach() {
        System.out.println("Run After Current Test");
    }

    //Example: Run after all tests
    @AfterAll
    public static void afterAll() {
        System.out.println("End of Tests");
    }
}