package com.codurance.dip;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class RandomQuoteServiceTest {

    @Mock
    private IQuoteList quoteList;

    @Before
    public void setUp() {
        given(quoteList.getQuoteList()).willReturn(List.of("This is my quote"));
    }

    @Test
    public void getRandomeQuote() {
        RandomQuoteService randomQuoteService = new RandomQuoteService(quoteList);
        assertEquals(randomQuoteService.getRandomQuote(), "This is my quote");
    }
}