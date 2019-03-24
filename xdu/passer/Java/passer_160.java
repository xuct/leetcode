package com.passer._0323;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class IntersectionOfTwoList {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode curA = headA;
		ListNode curB = headB;
		int time = 0;
		while (curA != null && curB != null) {
			if (curA == curB)
				return curA;
			if (time >= 3)
				break;
			curA = curA.next;
			curB = curB.next;
			if (curA == null) {
				curA = headB;
				time++;
			}
			if (curB == null) {
				curB = headA;
				time++;
			}
		}
		return null;
	}
}
