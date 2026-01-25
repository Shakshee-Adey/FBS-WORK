package Stack;

public class stack1 {
   int arr[];
   int top;
   
   stack1(int size)
   {
	   arr = new int[size];
	   top =-1;
   }
   
   boolean isFull()
   {
	   if(top==arr.length-1)
		   return true;
	   else
		   return false;
   }
   
   boolean isEmpty()
   {
	   if(top==-1)
		   return true;
	   else
		   return false;
   }
   
   void push(int ele)
   {
	   boolean result = isFull();
	   if(result == false)
	   {
		   top++;
		   arr[top] = ele;
	   }
	   else
	   {
		   System.out.println("Stack overflow");
	   }
   }
   
   int pop()
   {
	   if(isEmpty()==false)
	   {
		   int ele = arr[top];
		   top --;
		   return ele;
	   }
	   else
	   {
		   System.out.println("Stack overflow");
		   return -1;
	   }
   }
   
   int peek()
   {
	   if(isEmpty()== false)
		   return arr[top];
	   else
		   System.out.println("Stack overFlow");
		   return -1;
   }
   
   class Demo
   {
	   public static void main(String args[])
	   {
		   stack1 obj = new stack1(5);
		   
		   obj.push(30);
		   obj.push(40);
		   obj.push(50);
		   obj.push(60);
		   System.out.println("popped element : "+obj.pop());   //60
		   System.out.println("popped element : "+obj.peek());  //50
	   }
   }
}
