package Leetcode;

public class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

    
        ListNode a = new ListNode(0);
        a.next = head;
        ListNode current = a;


        while (current.next != null) {
            if (set.contains(current.next.val)) {
            
                current.next = current.next.next;
            } else {
                
                current = current.next;
            }
        }

        
        return a.next;
    }
}