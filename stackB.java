import java .util.ArrayList;
public class stackB{
    static class node{
        int data;
        node next;
       node(int data){
           this .data=data;
           this.next=null ;
       }
    }
 static class stack{
     static node head = null ;
     public static boolean isEmpty(){
         return head == null ;
     }
     // push opration by linklist method 
     public static void push (int data){
         node newnode = new node(data);
         if(isEmpty()){
            head= newnode;
            return ;
         }
         newnode.next=head;
         head=newnode;
     }
        // pop opration by linklist method
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
           int   top=head.data;
             head=head.next;
             return top ;
        }
           // peek opration by linklist method
            public static int peek(){
                  if(isEmpty()){
                return -1;
                      }
            return head.data;
            }
           //(:    impelention of stack using the method of ArrayList :)
    //   static  ArrayList<Integer> list =new ArrayList<>();
    //   public static Boolean isEmpty(){
    //       return list.size()==0;
    //   }
    //   //push operation 
    //   public static void push(int data){
    //       list.add(data);
    //   }
    //     //pop operation 
    //     public static int pop(){
    //           if(isEmpty()){
    //             return-1;
    //         }
    //         int top =list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     // peek operation 
    //     public static int peek(){
    //           if(isEmpty()){
    //             return-1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    }
	public static void main(String[] args) {
		System.out.println(" welcome to new chapter stack ");
        // statck implementation using java collection framework (JCF)
        // stack<Integer> s=new stack<>();
		stack s=new stack();
        s.push(1);
    	s.push(2);
     	s.push(3);
    	s.push(4);
    	s.push(5);
    	while(!s.isEmpty()){
    	    System .out.println(s.peek());
    	    s.pop();
    	}
         				
	}
}