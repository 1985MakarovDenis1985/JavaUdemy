package Arguments;

public class Arguments {

    static void sum(String s, int ...a){ // только одна развертка (вараркс) + он должен стоять самым последним
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(s + sum);

    }

    public static void main(String[] args) {
        sum("Sum: ",1,2,4);
        sum("Sum: ",new int[]{1,2,3}); // или так
    }
}
