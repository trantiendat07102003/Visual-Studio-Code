package Work;

public class QuickSort {

    public void QuickSort(int[] array, int left, int right){

        int pivot = (array.length)/2;
        for(int i = 0; i <= pivot; i++){
            for(int j = array.length; j >= pivot; j--){
                if(array[i] > array[j]){
                    array[i] = array[i] + array[j] - array[i];
                    array[j] = array[i] + array[j] - array[j];
                }else{
                    break;
                }
            }
        }

    }
    
}
