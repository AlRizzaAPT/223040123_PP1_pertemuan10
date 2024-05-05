package pertemuan10;

public class StuktureStackMain {
	    public static void main(String[] args) {
	        StrukturStack stack = new StrukturStack(3); 
	        System.out.println("#Sebelum push :");
	        System.out.println("Size : " + (stack.size()));
	        System.out.println("Empty : " + stack.isEmpty());
	        System.out.println("Full : " + stack.isFull());
	        System.out.println("Top : " + stack.top());
	        stack.display();
	        
	        stack.push(2);
	        stack.push(4);
	        stack.push(1);
	        
	        
	        System.out.println("#Melakukan Push 3x :");
	        System.out.println("Size : " + (stack.size()));
	        System.out.println("Empty : " + stack.isEmpty());
	        System.out.println("Full : " + stack.isFull());
	        System.out.println("Top : " + stack.top());
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.display();
	    }
	}

