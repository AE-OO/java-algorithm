package Chaewon.Chapter8;

import java.util.Deque;
import java.util.LinkedList;

public class 팰린드롬_연결_리스트 {
    public boolean myAnswerUseListNode(){
        int[] data = {1, 2, 3, 2, 1};
        ListNode<Integer> input = new ListNode<>();
        // listNode에 값 넣음
        input = input.addIntData(data);

        // listNode의 값을 deque에 넣음
        Deque<Integer> deque = new LinkedList<>();
        while(input != null){
            deque.add(input.value);
            input = input.next;
        }

        // deque의 양쪽에서 값을 꺼내면서 두 값이 같은지 비교
        while(deque.size() > 1){
            if(deque.pollFirst() != deque.pollLast()){
                return false;
            }
        }
        
        return true;
    }

    public boolean runner(){
        int[] data = {1, 2, 3, 2, 1};
        ListNode<Integer> input = new ListNode<>();
        // listNode에 값 넣음
        input = input.addIntData(data);

        ListNode fast = input, slow = input;
        // 빠른 러너가 끝까지 갈 때까지 느린 러너와 함께 진행
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // 홀수 개일 때 느린 러너가 한 칸 더 앞으로 가도록 처리
        if (fast != null)
            slow = slow.next;

        // 중간에 도달한 느린 러너를 기준으로 하여 역순 연결 리스트를 만든다.
        ListNode rev = null;
        while (slow != null) {
            // 느린 러너로 역순 연결 리스트 rev를 만들어나간다.
            ListNode next = slow.next;
            slow.next = rev;
            rev = slow;
            slow = next;
        }

        // rev 연결 리스트를 끝까지 이동하며 비교
        while (rev != null) {
            // 역순 연결 리스트 rev와 기존 연결 리스트 head를 차례대로 비교
            if (rev.value != input.value)
                return false;
            rev = rev.next;
            input = input.next;
        }
        return true;

    }
}
