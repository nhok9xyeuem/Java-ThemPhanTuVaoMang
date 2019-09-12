import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = new int[10];
        initializationArray(array);
        Scanner input = new Scanner(System.in);
        int index;
        System.out.println("moi ban nhap vi tri de them vao: ");
        index = input.nextInt();
        insertNumberArray(index, array);
        for (int value : array) {
            System.out.println(value);
        }
    }

    private static void initializationArray(int[] array) {
        for (int i = 0; i < array.length - 3; i++) {
            array[i] = (int) Math.ceil(Math.random() * 100);
            System.out.println(array[i]);
        }

    }

    private static void insertNumberArray(int index, int[] array) {

                for (int j = array.length - 1; 0 <= j; j--) {

                    if (index == j) {
                        System.out.println("Moi ban nhap gia tri them vao:");
                        int value = new Scanner(System.in).nextInt();
                        array[j] = value;
                        break;
                    } else {
                        array[j] = array[j - 1];
                    }
                }


    }
}
