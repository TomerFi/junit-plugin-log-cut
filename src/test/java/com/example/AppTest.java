package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.IntStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class AppTest {
  @ParameterizedTest
  @MethodSource
  void should_answer_with_true(final int iteration) {
      assertTrue(true);
  }

  static IntStream should_answer_with_true() {
    return IntStream.range(0, 500);
  }
}
