class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode fast = head;
        ListNode slow = head ;

        while( fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }

        ListNode firsthalf = head ;
        ListNode secondhalf = reverse(slow);

      

        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val)return false;
            firsthalf = firsthalf.next;
            secondhalf =secondhalf.next;
        }return true;
    }
      private ListNode reverse( ListNode head){
            ListNode curr = head;
            ListNode prev = null;
            ListNode next = null;
            while(curr != null){
                next = curr.next ;
                curr.next = prev;
                prev = curr;
                curr = next;
            }return prev;
        }
}
