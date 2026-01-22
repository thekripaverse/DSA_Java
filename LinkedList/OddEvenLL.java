package LinkedList;
public class OddEvenLL {
	 int val;
	 OddEvenLL next;
	 OddEvenLL() {}
	 OddEvenLL(int val) { this.val = val; }
	 OddEvenLL(int val, OddEvenLL next) { this.val = val; this.next = next; }
class Solution {
    public OddEvenLL oddEvenList(OddEvenLL head) {
        if (head==null || head.next==null){
            return head;
        }
        OddEvenLL odd=head;
        OddEvenLL even=head.next;
        OddEvenLL evenHead = head.next;
        while(even!=null && even.next!=null) {
			odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;

		}
        odd.next=evenHead;
        return head;
    }
}
