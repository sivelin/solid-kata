package com.codurance.dip;

import com.codurance.dip.FileQuoteList;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DipTests {
    @Test
    public void testGetQuoteList() {
        FileQuoteList fileQuoteList = new FileQuoteList();
        assertThat(fileQuoteList.getQuoteList().size()).isEqualTo(6);
    }
}
