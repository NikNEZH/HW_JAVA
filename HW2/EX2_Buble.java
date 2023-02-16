package HW2;

public class EX2_Buble {
    public void bubleSort(int[] array){
        var flag = false;
        while (!flag) {
            flag = true;
            for (var i = 1; i < array.length; i++) {
                var previos = array[i - 1];
                var carrent = array[i];
                if (previos>carrent){
                    swap(array, i-1, i);
                    flag=false;
                }
            }
        }
    }

    private void swap (int[] array, int index1, int index2){
        var buf = array[index1];
        array[index1] = array[index2];
        array[index2] = buf;
    }
}
