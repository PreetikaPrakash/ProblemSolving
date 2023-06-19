package linkedlist;

class mergeNode{
    int data;
    mergeNode next;

    mergeNode(int data, mergeNode next){
        this.data=data;
        this.next=next;
    }
}

public class mergeSortedLL {
    static mergeNode head1= null;
    static mergeNode tail1= null;
    static mergeNode head2= null;
    static mergeNode tail2= null;

    static void insert1(int data){
        mergeNode newNode = new mergeNode(data,null);
        if(head1==null){
            head1 = newNode;
            tail1 = newNode;
        }
        head1.next = newNode;
        head1 = newNode;
    }

    static void insert2(int data){
        mergeNode newNode = new mergeNode(data,null);
        if(head2==null){
            head2 = newNode;
            tail2 = newNode;
        }
        head2.next = newNode;
        head2 = newNode;
    }

    static void display(mergeNode disp1){

        while(disp1!=null){
            System.out.print(disp1.data+" | ");
            disp1 = disp1.next;
        }
        System.out.println();
    }

    static void merge(mergeNode tail1 , mergeNode tail2){
        mergeNode first = tail1;
        mergeNode second = tail2;
        mergeNode third = null;
        mergeNode last = null;

        if(first.data<second.data){
            third = first;
            first = first.next;
            third.next = null;
            last = third;
        }
        else{
            third = second;
            second = second.next;
            third.next = null;
            last = third;
        }

        while(first!=null && second!=null){
            if(first.data<second.data){
                last.next = first;
                last = first;
                first = first.next;
                last.next = null;
            }
            else{
                last.next = second;
                last = second;
                second = second.next;
                last.next = null;
            }

        }
        if (first!=null){
            last.next = first;
        }
        else{
            last.next = second;
        }

        mergeNode th = third;
        while(th!=null){
            System.out.print(th.data+" | ");
            th = th.next;
        }
        System.out.println();

    }



    public static void main(String[] args) {
        insert1(5);
        insert1(10);
        insert1(15);
        insert1(40);
        display(tail1);

        insert2(2);
        insert2(3);
        insert2(20);
        display(tail2);

        merge(tail1,tail2);


    }

}

/*
Input:
N = 4, M = 3
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
* */

