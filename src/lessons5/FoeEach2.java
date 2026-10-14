package lessons5;

public class FoeEach2 {
    public static void main(String args[]) {
int sum = 0;
int nums[] = {1,2,3,4,5,6,7,8,9,10};
//использовать цикл for в стиле for each для
// вывода и суммирования значений из части массива
        for (int x : nums) {
            System.out.println(" znachenie ravno: " + x);
            sum +=x;
            if(x == 5)break;

        }
        System.out.println(" summa pyati pervix elementov ravna: "+ sum );
    }
}

