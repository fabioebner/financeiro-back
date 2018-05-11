package br.com.lumera.financeiroback.util;


import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static RoundingMode getRoundModePadrao(){
        return RoundingMode.HALF_UP;
    }

    private static String dtFormat= "dd/MM/yyyy";
    private static String dtFormatTabelaCustas= "yyyy-MM-dd";


    public static String formataData(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dtFormat);
        return data.format(formatter);
    }
    public static String formataDataTabelaCustas(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dtFormatTabelaCustas);
        return data.format(formatter);
    }
}
