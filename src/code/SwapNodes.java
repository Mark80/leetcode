package code;

public class SwapNodes {

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

	public static void main(String[] args) {
		SwapNodes swapNodes = new SwapNodes();
		var list = new ListNode(1, new ListNode(2, new ListNode(3)));
		print(list);
		print(swapNodes.swapPairs(list));

		list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		print(list);
		print(swapNodes.swapPairs(list));

		list = new ListNode();
		print(list);
		print(swapNodes.swapPairs(list));

		list = new ListNode(1);
		print(list);
		print(swapNodes.swapPairs(list));

	}

	public ListNode swapPairs(ListNode head) {
		if(head == null)
			return null;
		var next = head.next;
		if (next != null) {
			head.next = next.next;
			next.next = head;
			if (head.next != null)
				head.next = swapPairs(head.next);
		} else {
			return head;
		}

		return next;
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

}
