package com.awesomequestionnaires;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class QuestionnaireServiceTest {

    @Mock
    private List<String> questions;

    @Test
    void shouldReadQuestion() {
        when(questions.get(0)).thenReturn("What is your name?");

        String result = questions.get(0);

        assertEquals("What is your name?", result);
        verify(questions).get(0);
    }
}