package com.java.hacks.pattern.container;

import java.util.Iterator;

public class BeanContainer<BEAN> {
	protected class Node {
		private BEAN element;

		Node next = null;
		Node previous = null;

		public Node(BEAN element) {
			this.element = element;
		}
	}

	protected Node head = null;
	protected Node tail = null;

	public class NodeIterator implements Iterator<BEAN> {
		protected Node p = head;

		public boolean hasNext() {
			return p != null;
		}

		public BEAN next() {
			if (p == null) {
				return null;
			}
			BEAN element = p.element;
			p = p.next;
			return element;
		}

		public void remove() {
			p.previous.next = p.next;
			p.next.previous = p.previous;
		}
	}

	public void add(BEAN o) {
		if (head == null)
			tail = head = new Node(o);
		else {
			Node newnode = new Node(o);
			newnode.previous = tail;
			tail = tail.next = newnode;
		}

	}

	public Iterator<BEAN> iterator() {
		return new NodeIterator();
	}

	public void removeAll() {
		head = null;
		tail = null;
	}
}
