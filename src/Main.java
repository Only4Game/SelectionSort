import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz co chcesz zrobić: ");
        System.out.println("1 - losowanie liczb tablicy i sortowanie, ");
        System.out.println("2 - ręczne wpisanie liczb tablicy i sortowanie, ");
        int wybor1 = scanner.nextInt();
        switch (wybor1) {
            case 1 -> {
                System.out.println("Podaj długość tablicy");
                int wybor2 = scanner.nextInt();
                double[] arr = new double[wybor2];
                System.out.println("Selection sort z losowymi liczbami");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (double) Math.round((Math.random() * 1000));
                }
                System.out.println(Arrays.toString(selecionSort(arr)));
            }
            case 2 -> {
                System.out.println("Podaj długość tablicy");
                int wybor2 = scanner.nextInt();
                double[] arr = new double[wybor2];
                System.out.println("Selection sort z liczbami wpisanymi ręcznie");
                for (int k = 0; k < arr.length; k++) {
                    System.out.println("Podaj " + (k + 1) + " element tablicy");
                    int num1 = scanner.nextInt();
                    arr[k] = num1;
                }
                System.out.println(Arrays.toString(selecionSort(arr)));
            }
            default -> System.out.println("Wybrałeś opcję której nie ma");
        }
    }

    public static double[] selecionSort(double[] arr){
        int arrLen = arr.length;

        for (int i = 0; i < arrLen - 1; i++){
            int tempIdx = i;
            for(int j = i + 1; j < arrLen; j++){
                if(arr[j] < arr[tempIdx])
                    tempIdx = j;
            }
            double temp = arr[tempIdx];
            arr[tempIdx] = arr[i];
                    arr[i] = temp;
        }
        return arr;
    }
}




