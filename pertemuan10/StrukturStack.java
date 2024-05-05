package pertemuan10;

public class StrukturStack {

	    private int[] array;   
	    private int capacity;   
	    public int top;       
	    public final int MIN = -1; 

	    public StrukturStack(int capacity) {
	        super();
	        this.capacity = capacity;
	        array = new int[capacity]; 
	        top = MIN; 
	    }

	    public void display() {
	        
	        if(isEmpty()) {
	           
	            System.out.println("Elemen From TOP :");
	        } else {
	       
	            System.out.print("Elemen From TOP : ");

	            for(int i = top; i >= 0; i--) {
	              
	                System.out.print(array[i] + " ");
	            }
	            System.out.println();
	        }
	    }
	    public int size() {
	        return top + 1;
	    }

	    public void push(int data) {
	        if (isFull()) {
	        } else {
	            top++;
	            array[top] = data;
	        }
	    }
	    
	    public int pop() {
            if (isEmpty()) {
                return -1; // Jika tumpukan kosong, kembalikan nilai -1
            } else {
                int poppedElement = array[top];
                top--;
                return poppedElement;
            }
        }
	        
	    public int top() {
	        if (isEmpty()) {
	            return -1; 
	        } else {
	            return array[top];
	        }
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	    boolean isFull() {
	        return top == capacity - 1;
	    }
	}

