package genericArray;
public class GenericArray<T>{
	
	private T[] myarray;
	private int lengthArray;
	private int size;
	
	@SuppressWarnings("unchecked")
	public GenericArray(int size) {
		myarray= (T[]) new Object [size];
		this.size=size;
		
	}
	public T get(int index) {
		return myarray[index];
		
	}
	public void set(int index, T value) {
		myarray[index]=value;
		
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if (myarray.length==0) {
			return true;
		}
		return false;
	}
}