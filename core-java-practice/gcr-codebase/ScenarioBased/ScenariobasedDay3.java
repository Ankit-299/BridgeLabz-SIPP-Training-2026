//A warehouse stores item quantities in an array. find the max, min,total stock,and detect duplicates.Extend:rotatethe stock array
//total stock and detect duplicates.Extend:rotate the stock array by k positions(simulate daily shift handover),ans transpose a 2d shelf grid

import java.util.Arrays;

public class ScenariobasedDay3 {
    public static void main(String[] args) {    
        int[]stock={45,20,60,20,90,15,60};
        int min=0;
        int max=0;
        int total=0;
        for(int i=0;i<stock.length;i++){
            if(stock[i]>max){
                max=stock[i];
            }
            if(stock[i]<min){
                min=stock[i];
            }
            total+=stock[i];
        }

        System.out.println("Max stock: "+max);
        System.out.println("Min stock: "+min);
        System.out.println("Total stock: "+total);
       
    }
    public static void searchEement(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void duplicate(int[]arr ){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    public static void rorate(int[]arr,int k){
        int n=arr.length;
        int[]rotated=new int[n];
        for(int i=0;i<n;i++){
            int newIndex=(i+k)%n;
            rotated[newIndex]=arr[i];
        }
        System.out.println("Rotated array: "+Arrays.toString(rotated));
    }
}
