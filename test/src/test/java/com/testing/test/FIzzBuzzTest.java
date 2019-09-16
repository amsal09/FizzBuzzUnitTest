package com.testing.test;

import com.testing.test.function.FizzBuzz;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FIzzBuzzTest {
    private FizzBuzz sut;

    @Before
    public void setup() {
        sut = new FizzBuzz ();
    }

    @Test
    public void evaluateFizzBuzz_FizzNumber() {
        String result = sut.evaluateFizzBuzz (3);
        assertEquals("Fizz",result);
    }
    @Test
    public void evaluateFizzBuzz_BuzzNumber(){
        String result = sut.evaluateFizzBuzz (5);
        assertEquals ("Buzz",result);
    }
    @Test
    public void evaluateFizzBuzz_FizzBuzzNumber(){
        String result = sut.evaluateFizzBuzz (15);
        assertEquals ("FizzBuzz",result);
    }
    @Test
    public void evaluateFizzBuzz_nonFizzBuzzNumber(){
        String result = sut.evaluateFizzBuzz (2);
        assertEquals ("2",result);
    }


}
