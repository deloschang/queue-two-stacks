package SA6;

/**
 * StackQueue.java
 *
 * Implements queue using two stacks
 * @author Delos Chang - 1/25/13
 * header comments for functions copied from CS10Queue.java
 */

public class StackQueue<T> implements CS10Queue<T> {
	
	// declare 2 stacks for implementation
	private ArrayListStack<T> inStack = new ArrayListStack<T>();
	private ArrayListStack<T> outStack = new ArrayListStack<T>();
	
	/**
	 * Add item to back of queue
	 * @return the item added to the rear of the queue
	 */
	public void enqueue(T item){
		inStack.push(item);
	}
	
	/**
	 * Remove item from front of queue
	 * @return the item removed from the front of the queue
	 */
	public T dequeue(){
		if (outStack.isEmpty()){
			while(!inStack.isEmpty()){
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}
	
	/**
	 * Return the item at the front of queue, but do not remove it
	 * @return the item at the front of the queue
	 */
	public T front(){
		return outStack.peek();
	}
	
	/**
	 * Is the queue empty?
	 * @return true iff queue is empty
	 */
	public boolean isEmpty(){
		return inStack.isEmpty() && outStack.isEmpty();
	}
	
	/**
	 * A testing program
	 */
	 public static void main (String [] args)  {
	   CS10Queue<String> q = new StackQueue<String>();
	   System.out.println("Is it empty? : " + q.isEmpty());
	   q.enqueue("cat");
	   q.enqueue("dog");
	   q.enqueue("bee");
	   System.out.println("Is it empty? : " + q.isEmpty());
	   System.out.println("Front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Is it empty? : " + q.isEmpty());
	   q.enqueue("eagle");
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Is it empty? : " + q.isEmpty());
	   System.out.println("dequeue of empty stack: " + q.dequeue());
	   
	   q.enqueue("bear");
	   q.enqueue("beaver");
	   System.out.println("front is: " + q.dequeue());
	   q.enqueue("cat");
	   q.enqueue("dog");
	   q.enqueue("sheep");
	   q.enqueue("cow");
	   q.enqueue("eagle");
	   q.enqueue("bee");
	   q.enqueue("lion");
	   q.enqueue("tiger");
	   q.enqueue("zebra");
	   q.enqueue("ant");
	   
	   System.out.println("Bigger example:");
	   System.out.println("front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Next front is: " + q.dequeue());
	   System.out.println("Is it empty? : " + q.isEmpty());
	   System.out.println("Next front is: " + q.dequeue());
	 }
}