public class Fourth {
    public static void main(String[] args) {
        int a = 10;
        long f = 1;
        for (int i = 1; i <= a; i++){
            f *= i;
        }
        System.out.println("Факторіал числа " + a + " = " + f);


        int f1 = 1;
        int a1 = 10;
        int e = 1;

        while ( e <= a){
            f1 *= e;
            e++;
        }
        System.out.println("Факторіал числа " + a + " = " + f1);

    }
}