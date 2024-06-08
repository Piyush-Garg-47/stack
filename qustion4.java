//"next grater element
import java.util.*;
public class qustion4 {
    public static void main(String[] args){
        System.out.println("next grater element");
        int arr []={1,3,4,2};
        Stack<Integer> s= new Stack<>();
        int nextGrater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0; i--){
            //1st step
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // 2nd step 
            if(s.isEmpty()){
                nextGrater[i]=-1;
            }else{
                nextGrater[i]=arr[s.pop()];
            }
            //3rd step 
            s.push(i);
        }
        for(int i=0;i<nextGrater.length;i++){
            System.out.print(nextGrater[i]+ " ");
        }
        System.out.println();
    }
}