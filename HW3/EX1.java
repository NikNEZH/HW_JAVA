package HW3;

import java.util.Arrays;

public class EX1 {
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        int[] sortr = mergeSort(sortArr);
        for(int i = 0; i < sortr.length; i++){
            System.out.print(sortr[i] + " ");
        }
    }

    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] > sorted2[index2]
                    ? sorted2[index2++] :  sorted1[index1++] ; // от большего к меньшему

                    // result[destIndex++] = sorted1[index1] > sorted2[index2]
                    // ? sorted2[index2++] :  sorted1[index1++] ; от меньшего к большему
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    
}
