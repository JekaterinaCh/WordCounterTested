package com.example.textcountersample;

import org.junit.Test;

import static com.example.textcountersample.utils.ElementsCalculator.getCharsCount;
import static com.example.textcountersample.utils.ElementsCalculator.getWordsCount;
import static org.junit.Assert.*;

public class ElementsCalculatorUnitTest {
    @Test
    public void char_field_is_empty() {
        String text = "";
        int char_count = 0;
        assertEquals(getCharsCount(text), char_count);
    }

    @Test
    public void word_field_is_empty() {
        String text = "";
        int word_count = 0;
        assertEquals(getWordsCount(text), word_count);
    }

    @Test
    public void char_field_is_normal() {
        String text = "hello";
        int char_count = 5;
        assertEquals(getCharsCount(text), char_count);
    }

    @Test
    public void word_field_is_normal() {
        String text = "hello";
        int word_count = 1;
        assertEquals(getWordsCount(text), word_count);
    }

    @Test
    public void char_field_only_spaces() {
        String text = "   ";
        int char_count = 3;
        assertEquals(getCharsCount(text), char_count);
    }

    @Test
    public void word_field_only_spaces() {
        String text = "   ";
        int word_count = 0;
        assertEquals(getWordsCount(text), word_count);
    }

    @Test
    public void char_field_only_symbols() {
        String text = "////";
        int char_count = 4;
        assertEquals(getCharsCount(text), char_count);
    }

    @Test
    public void word_field_only_symbols() {
        String text = "////";
        int word_count = 1;
        assertEquals(getWordsCount(text), word_count);
    }

    @Test
    public void char_field_only_numbers() {
        String text = "5555";
        int char_count = 4;
        assertEquals(getCharsCount(text), char_count);
    }

    @Test
    public void word_field_only_numbers() {
        String text = "5555";
        int word_count = 1;
        assertEquals(getWordsCount(text), word_count);
    }

    @Test
    public void word_field_with_numbers() {
        String text = "hello 5555";
        int word_count = 2;
        assertEquals(getWordsCount(text), word_count);
    }

    @Test
    public void word_field_with_symbols() {
        String text = "hello ////";
        int word_count = 2;
        assertEquals(getWordsCount(text), word_count);
    }
}
