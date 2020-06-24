package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void knowsWhoWroteRomeoAndJuliet() throws Exception {
    assertThat(queryProcessor.process("Who wrote Romeo And Juliet"), containsString("Shakespeare"));
  }

  @Test
  public void knowsWhoIAm() throws Exception {
    assertThat(queryProcessor.process("What is your name"), containsString("Unsafe"));
  }

  @Test
  public void isNotCaseSensitive() throws Exception {
    assertThat(queryProcessor.process("who wrote romeo and juliet"), containsString("Shakespeare"));
  }

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void returns() throws Exception {
    assertThat(queryProcessor.process("which of the following numbers is the largest"), is(""));
  }


  //@Test
  public void returnsPlusQuery() throws Exception {
    assertThat(queryProcessor.process("what colour is a banana"), is(""));
  }

}
