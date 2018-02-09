package com.lc.arithmetic.code452;

import java.util.Random;

public class Lession452 {

    /*
        * @param head: a ListNode
        * @param val: An integer
        * @return: a ListNode
        */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if(head==null){
            return head;
        }
        ListNode curNode = head;
        ListNode nextNode = head.next;
        while (nextNode!=null){
            //如果等于
            if(val==nextNode.val){
                //改变原链表的下一个为当前链表的下一个
                curNode.next = nextNode.next;
                nextNode = nextNode.next;
            }else {
                curNode = curNode.next;
                nextNode = nextNode.next;
            }
        }
        if(head.val==val){
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        Random rand = new Random();
        ListNode tmpNode = head1;
        for(int i =0;i<10;i++){
            tmpNode.next = new ListNode(rand.nextInt(4));
            tmpNode = tmpNode.next;
        }
        System.out.println(head1);


        Lession452 lession452 = new Lession452();

        System.out.println(lession452.removeElements(head1,1));

    }
}
 