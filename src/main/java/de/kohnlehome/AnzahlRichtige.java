package de.kohnlehome;

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
