package de.kohnlehome;

import java.util.Date;

public class AnzahlRichtige implements IAnzahlRichtige {
    ILottoZahlenReader lottoZahlenReader;

    public AnzahlRichtige(ILottoZahlenReader lottoZahlenReader) {
        this.lottoZahlenReader = lottoZahlenReader;
    }

    @Override
    public int anzahlRichtige(int[] aktuelleLZ, int[] lzVom) {
        return 0;
    }
}
