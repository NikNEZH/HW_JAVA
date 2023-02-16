// 2.Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
package HW2;

import java.util.Arrays;

public class EX2 {
    public static void main(String[] args) {
        var arraay = new int[]{4,2,3,8,13,12345,678,436,876,143,118,89,100,1};
        System.out.println(Arrays.toString(arraay));
        new EX2_Buble().bubleSort(arraay);
        System.out.println(Arrays.toString(arraay));

    }

    
    
}
