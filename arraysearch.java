import java.util.*;
class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	int flag=0;
    	for (int i=0;i<15;i++) {
    		if(arr[i]==toCheckValue){
    			flag=1;
    		}
    	}
    	if (flag==1) {
    		return true;
    	}
    	else return false;
    }
}
class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray s=new SearchArray();
        s.searchArray(arr,valueToCheck);
	}
}