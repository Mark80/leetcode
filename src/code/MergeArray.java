package code;

import java.util.StringJoiner;

public class MergeArray {

	public static void main(String[] args) {
		MergeArray mergeArray = new MergeArray();

		var list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
		var list2 = new ListNode(1, new ListNode(2, new ListNode(3)));

		print(mergeArray.mergeTwoLists(list1,list2));


		list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

		print(mergeArray.mergeTwoLists(list1,list2));

		print(mergeArray.mergeTwoLists(null,null));


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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode listNode = new ListNode();
		if (list1 == null && list2 == null) {
			return null;
		}
		if (list1 != null && list2 == null) {
			listNode.val = list1.val;
			listNode.next = mergeTwoLists(list1.next, null);
		} else if (list1 == null) {
			listNode.val = list2.val;
			listNode.next = mergeTwoLists(list2.next, null);
		} else {
			if (list1.val < list2.val) {
				listNode.val = list1.val;
				listNode.next = mergeTwoLists(list1.next, list2);
			} else {
				listNode.val = list2.val;
				listNode.next = mergeTwoLists(list1, list2.next);
			}
		}

		return listNode;
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

		@Override
		public String toString() {
			return new StringJoiner(", ", ListNode.class.getSimpleName() + "[", "]")
					.add("val=" + val)
					.add("next=" + next)
					.toString();
		}
	}

}
