package de.kohnlehome;

import java.util.Date;

public interface ILottoZahlenReader {
    int[] getAktuelleLottozahlen();
    int[] getLottozahlenVon(Date date);
}