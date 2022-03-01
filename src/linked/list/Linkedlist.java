package linked.list;

public class Linkedlist<T> {
	Node<T> head;
	private int length = 0;

	public Linkedlist() {
		this.head = null;
	}

	public void add(T data) {
		Node<T> temp = new Node<>(data);

		if (this.head == null) {
			head = temp;
		} else {
			Node<T> X = head;

			while (X.next != null) {
				X = X.next;
			}
			X.next = temp;
		}

		length++;
	}

	public boolean empty() {

		if (head == null) {
			return true;
		}
		return false;
	}

	public int length() {
		return this.length;
	}

	@Override
	public String toString() {
		String S = "[ ";
		 
        Node<T> X = head;
 
        if (X == null)
            return S + " ]";
 
        while (X.next != null) {
            S += String.valueOf(X.data) + " , ";
            X = X.next;
        }
 
        S += String.valueOf(X.data);
        return S + " ]";
	
	}
	
	
}
