package Chaewon.Chapter8;

public class 두_정렬_리스트의_병합 {
    public ListNode<Integer> myAnswerUseListNode(){
        int[] data1 = {1, 2, 5};
        ListNode<Integer> node1 = new ListNode<>();
        node1 = node1.addIntData(data1);

        int[] data2 = {1, 3, 4};
        ListNode<Integer> node2 = new ListNode<>();
        node2 = node2.addIntData(data2);

        ListNode<Integer> answer = new ListNode();

        while(node1 != null && node2 != null){
            if(node1.value > node2.value){
                answer = node1;
                answer.next = node2;
            }else{
                answer = node2;
                answer.next = node1;
            }
        }

        return node2;
    }
}
