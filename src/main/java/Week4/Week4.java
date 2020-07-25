package Week4;


import java.text.DecimalFormat;

public class Week4 {
    public int max2Int(int a, int b) {

        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    private int[] exArr = new int[100];

    public int minArray(int[] arr) {
        if (arr.length > 100 || arr.length == 0) {
            return 0;
        } else {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            return min;
        }
    }

    public String caculateIBM(double weight, double height) {
        double IBM = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("#0.0");

        if (height <= 0 || weight <=0) {
            return  "Height and weight need to > 0";
        } else {
            IBM = (double) (weight / (height * height));

            if (IBM < 18.50) {
                System.out.println("Thiếu cân");
            }

            if (IBM >= 18.50 && IBM < 22.99) {
                System.out.println("Bình thường");
            }

            if (IBM >= 23 && IBM < 24.99) {
                System.out.println("Thừa cân");
            }

            if (IBM >= 24) {
                System.out.println("Béo phì");
            }

        }

        return decimalFormat.format(IBM);
    }
}


