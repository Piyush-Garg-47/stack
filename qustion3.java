
import java .util.*;
public class qustion3{
      public static void pushATbottom(Stack<Integer> s, int data ){
         if(s.isEmpty()){
             s.push(data);
             return;
         }
          int top =s.pop();
           pushATbottom(s , data);
           s.push(top);
          
     }
     public static void reverseStack(Stack<Integer> s){
         if(s.isEmpty()){
             return;
         }
          int top =s.pop();
          reverseStack(s);
          pushATbottom( s ,top );
     }
      public static void Printsttack(Stack<Integer> s){
          while(!s.isEmpty()){
              System.out.println(s.pop());
          }
      }
    public static void main(String[] args){
        System.out.println("qustion 3");
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        Printsttack(s);
}
}
