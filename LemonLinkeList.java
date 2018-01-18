package LinkedList;


public class LemonLinkeList<E> implements Linked<E> {
	private Node<E> fstNode;
	private Node<E> lstNode;
	private int size = 0;

	public LemonLinkeList() {
		lstNode = new Node<E>(null, fstNode, null);
		fstNode = new Node<E>(null, null, lstNode);
	}

	private class Node<E> {
		private E currentElement;
		private Node<E> nextElement;
		private Node<E> prevElement;

		private Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
			this.currentElement = currentElement;
			this.nextElement = nextElement;
			this.prevElement = prevElement;

		}
	}

	@Override
	public void addLast(E e) {

		Node<E> prev = lstNode; // Создали указатель на обьект который был последний. Теперь обращаем по PREV.
		prev.setCurrentElement(e); // Задаем элемент.
		lstNode = new Node<E>(null, prev, null); // Создаем новую Node с null в конец.
		prev.setNextElement(lstNode); // Задаем указатель на след. элемент null.
		size++;

	}

	@Override
	public void addFirst(E e) {
		// TODO Auto-generated method stub

	}

}
