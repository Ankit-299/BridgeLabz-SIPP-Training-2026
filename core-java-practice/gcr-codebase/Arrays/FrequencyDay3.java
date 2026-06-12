import java.util.*;
public class FrequencyDay3 {
    public static void main(String[] args) {
        int[] arr={0,1,3,1,2,3,0,1,3,2,1,0};

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" is repeated "+count+" times");
        }
    }
}
