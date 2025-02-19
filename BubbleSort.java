
//Bubble Sort

class BubbleSort {
    public static void main(String[] args) {
        int numArrays[] = {8,2,10,11,23,5,7};
        int size = numArrays.length;
        int temp;

        System.out.println("Before Sorting: ");
        for(int a: numArrays){
            System.out.print(a+ " ");
        }

        System.out.println();

        System.out.println("After Sorting: ");
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1; j++){
                if(numArrays[j] > numArrays[j+1]){
                    temp = numArrays[j];
                    numArrays[j] = numArrays[j+1];
                    numArrays[j+1] = temp;
                }
            }
        }

        for(int b: numArrays){
            System.out.print(b+ " ");
        }

    }
}