package util;

public class CotacaoMoeda {
    public final static double IOF = 6;

    public static double conversor(double qtd, double cotacao){
        return qtd*cotacao*(1 + IOF/100);
    }
}
