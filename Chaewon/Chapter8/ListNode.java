package Chaewon.Chapter8;

public class ListNode<E> {
    public E value;
    public ListNode<E> next;

    public ListNode() {}

    public ListNode(E value){
        this.value = value;
    }

    public ListNode(E value, ListNode<E> next){
        this.value = value;
        this.next = next;
    }

    /**
     * int 배열로 받은 문제의 input 데이터를 ListNode에 넣음
     * @param input
     * @return
     */
    public ListNode<Integer> addIntData(int[] input){
        ListNode<Integer> head = new ListNode(0);
        ListNode<Integer> last = head;
        for(int i = 0; i < input.length; i++){
            last.next = new ListNode(input[i]);
            last = last.next;
        }
        return head.next;
    }
}
