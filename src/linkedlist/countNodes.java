package linkedlist;
class displayCountNode {
    int data;
    displayCountNode next;

    displayCountNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class countNodes {

    // ITERATIVELY
    static int countofNodes(displayCountNode dd){
        int count = 0;
        while(dd!=null){
            count++;
            dd=dd.next;
        }
        return count;
    }

    // RECURSIVELY
    static int recurcountofNodes(displayCountNode dd){
        if(dd!=null){
            return recurcountofNodes(dd.next)+ 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,7,8};
        //array to linked list
        displayCountNode cn = new displayCountNode(arr[0]);
        displayCountNode ln;
        ln = cn;

        for(int i=1;i<arr.length;i++){
            // first create a node
            displayCountNode subs = new displayCountNode(arr[i]);
            ln.next = subs;
            ln = subs;
        }

        displayCountNode gn = cn;
        while(gn!=null){
            System.out.println(gn.data);
            gn=gn.next;
        }

        System.out.println("Count of nodes is --- Iteratively "+ countofNodes(cn));
        System.out.println("Count of nodes is --- Recursively "+ recurcountofNodes(cn));
    }
}

// OUTPUT
/*
2
5
3
7
8
Count of nodes is --- Iteratively 5
Count of nodes is --- Recursively 5
*/
