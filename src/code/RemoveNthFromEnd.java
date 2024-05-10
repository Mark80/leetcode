package code;

import static code.RemoveNthFromEnd.ListNode.of;

public class RemoveNthFromEnd {

	public static void main(String[] args) {



		System.out.println(removeNthFromEnd2(new ListNode(1), 1));
		System.out.println(removeNthFromEnd2(of(1, 2, 3), 3));
		System.out.println(removeNthFromEnd2(of(1, 2, 3, 4), 1));
		System.out.println(removeNthFromEnd2(of(1, 2, 3, 4), 3));
		System.out.println(removeNthFromEnd2(of(1, 2, 3, 4), 2));
		System.out.println(removeNthFromEnd2(of(1, 2, 3, 4, 5), 2));

	}

	public static ListNode removeNthFromEnd2(ListNode head, int n) {
		int size = getSize(head);
		n = size - n + 1;

		var arr = new int[size - 1];

		ListNode current = head;

		int count = 1;
		int i = 0;
		while (count < size + 1){
			if(count == n) {
				current = current.next;
				count++;
			}else {
				arr[i] = current.val;
				current = current.next;
				count++;
				i++;
			}
		}

		return of(arr);

	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int size = getSize(head);
		n = size - n + 1;

		ListNode current = head;
		ListNode previous = head;

		while (n > 0) {
			previous = current;
			current = current.next;
			n--;
		}

		previous.next = current.next;

		return head;

	}

	private static int getSize(ListNode head) {
		int size = 0;

		var c = head;
		while (c != null) {
			c = c.next;
			size++;
		}
		return size;
	}

	static class ListNode {

		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		static ListNode of(int... value) {
			if(value.length == 0)
				return null;
			var head = new ListNode();
			var current = head;
			for (int i = 0; i < value.length; i++) {
				current.val = value[i];
				if (i < value.length - 1) {
					current.next = new ListNode();
					current = current.next;
				}
			}

			return head;
		}

		@Override
		public String toString() {

			var current = this;

			String s = "[";

			while (current != null) {
				s = s + current.val + " ,";
				current = current.next;
			}

			return s + "]";
		}
	}

}
