package code;

public class RotateList {

	public static void main(String[] args) {
		var list = new ListNode(1, new ListNode(2, new ListNode(3)));
		print(rotateRight(list, 6));

		list = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		print(rotateRight(list, 2));

		list = null;
		print(rotateRight(list, 2));

	}

	public static ListNode rotateRight(ListNode head, int k) {
		if(k == 0 || head == null)
			return head;

		var size = size(head);
		var cicle = k % size;

		while (cicle > 0) {
			ListNode next = head.next;
			var value = head.val;
			while (next != null) {
				var tmp = next.val;
				next.val = value;
				value = tmp;
				next = next.next;
			}
			head.val = value;
			cicle--;
		}


		return head;
	}

	static void print(ListNode listNode) {
		System.out.print("[ ");
		var next = listNode;
		while (next != null) {
			System.out.print(next.val + ", ");
			next = next.next;
		}
		System.out.print("]");
		System.out.println();

	}

	private static int size(ListNode list) {
		if (list == null)
			return 0;

		var size = 0;
		ListNode next = list;

		while (next != null) {
			size++;
			next = next.next;
		}
		return size;
	}

	public static class ListNode {

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
	}
}
