package linkedlist;

class displaySumNode {
    int data;
    displaySumNode next;

    displaySumNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class sumNodes {

    // ITERATIVE
    static int sumofNodes(displaySumNode dd){
        int sum = 0;
        while(dd!=null){
            sum = sum + dd.data;
            dd=dd.next;
        }
        return sum;
    }

    // RECURSIVE
    static int recursumofNodes(displaySumNode dd){
        if(dd!=null){
            return recursumofNodes(dd.next)+ dd.data;
        }
        else{
            return 0;
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,5,3,7,8};
        //array to linked list
        displaySumNode cn = new displaySumNode(arr[0]);
        displaySumNode ln;
        ln = cn;

        for(int i=1;i<arr.length;i++){
            // first create a node
            displaySumNode subs = new displaySumNode(arr[i]);
            ln.next = subs;
            ln = subs;
        }

        displaySumNode gn = cn;
        while(gn!=null){
            System.out.println(gn.data);
            gn=gn.next;
        }

        System.out.println("Sum of nodes is --- Iteratively "+ sumofNodes(cn));
        System.out.println("Sum of nodes is --- Recursively "+ recursumofNodes(cn));
    }
}

