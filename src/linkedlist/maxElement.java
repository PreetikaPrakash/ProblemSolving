package linkedlist;

// Node Structure
class displayMaxNode {
    int data;
    displayMaxNode next;

    displayMaxNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class maxElement {

    // Array to Linked List
    static void convertMax(int[] arr, displayMaxNode cn){
        displayMaxNode ln;
        ln = cn;

        for(int i=1;i<arr.length;i++){
            // first create a node
            displayMaxNode suq = new displayMaxNode(arr[i]);
            ln.next = suq;
            ln = suq;
        }

        displayMaxNode gn = cn;
        while(gn!=null){
            System.out.println(gn.data);
            gn=gn.next;
        }

    }

    // ITERATIVE
    static int maxofNodes(displayMaxNode dm){

        int max = dm.data;

        displayMaxNode dmm =dm.next;
        while(dmm!=null){
            if(dmm.data>max){
                max = dmm.data;
            }
            dmm=dmm.next;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {2,5,3,7,8};
        displayMaxNode cn = new displayMaxNode(arr[0]);
        convertMax(arr, cn);

        displayMaxNode dm = cn;

        System.out.println("Max of nodes element is --- Iteratively "+ maxofNodes(dm));
    }
}



