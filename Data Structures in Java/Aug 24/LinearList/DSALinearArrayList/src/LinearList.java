
public interface LinearList {
	boolean isEmpty();
	int size();
	String outputList();
	void add(int index,Object obj);
	Object remove(int index);
	Object get(int index);
	int indexOf(Object obj);
}
