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
        //Checks the top of the Stack is Equal to the Test Data
        stack.push(10);
        assertEquals(10, stack.peak());
        //Check Size: Should be 1
        assertEquals(1, stack.getSize());
    }

    @Test
    void pop() {
        //Initialising Data
        stack.push(100); stack.push(512); stack.push(51); stack.push(100); stack.push(500);

        //Popping Data and Testing
        stack.pop();
        assertEquals(100, stack.peak());
        stack.pop();
        assertEquals(51, stack.peak());
    }

    @Test
    void peak() {
        //Initialising Data
        stack.push(100); stack.push(512); stack.push(51); stack.push(100); stack.push(500);

        //Checking
        assertEquals(500, stack.peak());

        //Popping Data and Testing
        stack.pop();
        assertEquals(100, stack.peak());
    }

    @Test
    void getSize() {
        //Check size is 0;
        assertEquals(0, stack.getSize());

        //Adding Items and Checking size
        stack.push(100); stack.push(512); stack.push(51);
        assertEquals(3, stack.getSize());

        //Adding Items and Checking size
        stack.push(100); stack.push(500);
        assertEquals(5, stack.getSize());
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