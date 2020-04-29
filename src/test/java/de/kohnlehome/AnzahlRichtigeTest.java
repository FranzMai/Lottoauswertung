package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnzahlRichtigeTest {
    private ILottoZahlenReader lottoZahlenReader;
    private AnzahlRichtige anzahlRichtige;

    @BeforeEach
    void init (){
        lottoZahlenReader = mock(ILottoZahlenReader.class);
        when(lottoZahlenReader.getLottozahlenVon(new Date(2020,03,25))).thenReturn(new int[]{1,23,45,76,89,2});
    }

    @Test
    public void anzahlRIchtige(){


    }

}
