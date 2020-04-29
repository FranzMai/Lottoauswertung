package de.kohnlehome;

import java.util.Date;

public interface ILottoZahlenReader {
    int[] getAktuelleLottozahlen(int Lottozahlen);
    int[] getLottozahlenVon(int[] Lottozahlen, Date date);
}