public class ArrayList<E> implements List<E> {
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elementData;
	private int size = 0;

	public ArrayList() {
		this.elementData = new Object[DEFAULT_CAPACITY];
	}

	public ArrayList(int size) {
		this.elementData = new Object[size];
	}

	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			str.append(elementData[i]);
			if (i < size - 1)
				str.append(", ");
		}
		str.append("]");
		return new String(str);
	}

	public boolean addLast(E element) {
		if(size+1>elementData.length)
			resize();
		this.elementData[size++] = element;
		return true;
	}
	
	public boolean addFirst(E element) {
		return add(0, element);
	}
	
	public boolean add(int index, E element) {
		if(elementData[index-1] == null && index != 0)
			return false;
		for(int i=size-1;i>=index;i--) {
			elementData[i+1] = elementData[i];
		}
		
		elementData[index] = element;
		size++;
		return true;
	}
	
	public E remove(int index) {
		Object obj = this.elementData[index];
		if(isEmpty()==true)
			return null;
		for(int i = index + 1; i<= size -1; i++) {
			this.elementData[i-1] = this.elementData[i];
		}
		size--;
		elementData[size] = null;
		return (E)obj;
	}
	
	public E removeFirst() {
		return this.remove(0);
	}
	
	public E removeLast() {
		return this.remove(size-1);
	}
	
	public E get(int index) {
		return (E)this.elementData[index];
	}
	
	public int size() {
		return this.size;
	}
	
	public int indexOf(E element) {
		for(int i=0;i<size;i++) {
			if(element.equals(elementData[i]))
				return i;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		if(this.size == 0)
			return true;
		else
			return false;
	}
	
	public E set(int index, E element) {
		Object e = elementData[index];
		elementData[index] = element;
		return (E)e;
	}
	
	private void resize() {
		Object[] elementDataCopy = new Object[size];
		for(int i=0;i<size;i++)
			elementDataCopy[i] = elementData[i];
		elementData = new Object[size*2];
		for(int i=0;i<size;i++)
			elementData[i] = elementDataCopy[i];
	}
}