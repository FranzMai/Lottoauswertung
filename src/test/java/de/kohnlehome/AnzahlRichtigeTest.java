package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class AnzahlRichtigeTest {
    private ILottoZahlenReader lottoZahlenReader;
    private AnzahlRichtige anzahlRichtige;

    @BeforeEach
    void init (){
        lottoZahlenReader = mock(ILottoZahlenReader.class);
    }

    @Test
    public void xxx(){}

}
