class BubbleSort{

    public int[] bubbleSort(int arr[]) {
    	 int n = arr.length;  
        int temp = 0;
    	for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                                 //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                    }               
            }  
        } 
        return arr;  
    }
}
 class bubble {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int arr2[];
        BubbleSort b=new BubbleSort();
        arr2=b.bubbleSort(arr);
        for (int i=0;i<arr2.length;i++ ) {
        	System.out.println(arr2[i]);
        }
    }
}