package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Created by user on 03/07/2017.
 */

public class SentenceTest {

    Sentence sentence;

    @Before
    public void setup() throws Exception {

        sentence = new Sentence("The owls are not what they seem");

    }

    @Test
    public void canCountWords() throws Exception{

        assertEquals(7, sentence.countWords());

    }

    @Test
    public void canPrettyCountWords() {

        assertEquals("There are 7 words in your sentence", sentence.prettyCountWords());

    }



}
