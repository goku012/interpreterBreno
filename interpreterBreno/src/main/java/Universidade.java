public class Universidade {

    public static String formula = "nota1 * 0.4 + nota2 * 0.6";

    public static double calcularMedia(double nota1, double nota2) {
        String expressao;
        expressao = formula.replace("nota1", Double.toString(nota1));
        expressao = expressao.replace("nota2", Double.toString(nota2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}