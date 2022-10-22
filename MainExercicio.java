import java.util.Scanner;

public class MainExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de temperaturas a serem convertidas:");
        double numeroDeConversoes = scanner.nextInt();

        while(numeroDeConversoes > 0) {
            System.out.println("Digite a unidade de temperatura de origem:");
            String unidadeParaConverter = scanner.next();

            System.out.println("Digite a unidade de temperatura de destino:");
            String unidadeDeDestino = scanner.next();

            System.out.println("Digite a temperatura de origem:");
            double temperatura = scanner.nextDouble();

            if("C".equals(unidadeParaConverter)) {
                if("K".equals(unidadeDeDestino)) {
                    double temperaturaConvertida = temperatura + 273.15;
                    System.out.println("Conversao: " + temperatura + " Celsius = " + temperaturaConvertida + " Kelvin");
                } else if("F".equals(unidadeDeDestino)){
                    double temperaturaConvertida = ((temperatura * 9) / 5) + 32;
                    System.out.println("Conversao: " + temperatura + " Celsius = " + temperaturaConvertida + " Fahrenheit");
                } else {
                    System.out.println("Unidade de destino invalida");
                }
            } else if("K".equals(unidadeParaConverter)){
                if("C".equals(unidadeDeDestino)) {
                    double temperaturaConvertida = temperatura - 273.15;
                    System.out.println("Conversao: " + temperatura + " Kelvin = " + temperaturaConvertida + " Celsius");
                } else if("F".equals(unidadeDeDestino)){
                    double temperaturaConvertida = (temperatura - 273.15) * 9.0/5.0 + 32;
                    System.out.println("Conversao: " + temperatura + " Kelvin = " + temperaturaConvertida + " Fahrenheit");
                } else {
                    System.out.println("Unidade de destino invalida");
                }
            } else if("F".equals(unidadeParaConverter)){
                if("C".equals(unidadeDeDestino)) {
                    double temperaturaConvertida = (temperatura -32) * 5/9;
                    System.out.println("Conversao: " + temperatura + " Fahrenheit = " + temperaturaConvertida + " Celsius");
                } else if("K".equals(unidadeDeDestino)){
                    double temperaturaConvertida = ((temperatura -32) * 5/9) + 273.15;
                    System.out.println("Conversao: " + temperatura + " Fahrenheit = " + temperaturaConvertida + " Kelvin");
                } else {
                    System.out.println("Unidade de destino invalida");
                }
            } else {
                System.out.println("Unidade de origem invalida");
            }

            numeroDeConversoes = numeroDeConversoes - 1;
        }
    }
}