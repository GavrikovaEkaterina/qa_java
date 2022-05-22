package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Mock
    List<String> list;
    @Mock
    Feline feline;
    @Mock
    Predator predator;

    @Test
    public void positiveGetSound() {
        //моки не нужен
        String text = cat.getSound();
        assertEquals("Мяу", text);

    }


    @Test
    public void getFood() throws Exception{
      // тут нужен моки
      Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
      assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}