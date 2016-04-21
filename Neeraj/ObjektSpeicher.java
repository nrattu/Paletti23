/*https://github.com/nrattu/Paletti23*/
package Neeraj;

public class ObjektSpeicher<E> {
	Object[] e;
	public ObjektSpeicher(int size) {
		e = new Object[size];
	}

	public void add(E e1, int position) {
		e[position] = e1;
	}

	@SuppressWarnings("unchecked")
	public E get(int position) {
		return (E) e[position];

	}

	public int size() {
		return e.length;
	}

	public int numberOfElements() {
		int j = 0;
		for (int i = 0; i < e.length; i++)
			if (e[i] != null)
				j++;
		return j;
	}

	public String toString() {
		String str = "";
		for(Object o : e){
			if(o != null)
				str +=o+"\n";
		}
		return str;

	}
}
