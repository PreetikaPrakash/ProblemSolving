package queue;
/*

* Implementing Queue through Array
* Using Two pointers in queue
* front pointer - to delete elements from the start
* rear pointer - to insert elements at the end
*
* operations of queue
*   1. enqueue
*   2. dequeue
*   3. isEmpty
*   4. isFull

* */

class queueArray{
    int size;
    int front;
    int rear;
    int[] arr;

}
public class implementQueueinArray {

    static queueArray q = new queueArray();

    // create queue
        static void createQueue(){
            q.size = 10;
            q.front= -1;
            q.rear = -1;
            q.arr = new int[q.size];
        }

    // display queue
        static void display(){
            queueArray p = q;
            for(int i=0;i<p.size;i++){
                System.out.print(p.arr[i]+ " | ");
            }
        }


    // ifFull operation
        // when rear pointer is at the last position of the queue
        static boolean isFullArray(){
            if(q.rear==q.size-1){
                return true;
            }
            return false;
        }

    // isEmpty operation
        // when front and rear pointer both are at same place.
        static boolean isEmpty(){
            if(q.rear == q.front){
                return true;
            }
            return false;
        }

    // enqueue
        static void enqueueArray(int x){
            // first check if queue is full -> then we cant insert data
            // if isFull operation
            if(!isFullArray()){
                // 1. increment the rear pointer
                // 2. at the place of rear pointer insert the data
                q.rear = q.rear + 1;
                q.arr[q.rear] = x;
            }
            else{
                System.out.println("Queue is full ");
            }
        }

    // dequeue
        static int dequeueArray(){
            int delete = -1;
            // first check if queue is empty -> then nothing to delete
            // if isEmpty operation
            if(!isEmpty()){
                // 1. increment the front pointer
                // 2. delete the element at front pointer position or replace with 0
                q.front = q.front + 1;
                delete = q.arr[q.front];
                q.arr[q.front] = 0;
            }
            return delete;
        }


    public static void main(String[] args) {
        createQueue();
        enqueueArray(10);
        enqueueArray(20);
        enqueueArray(30);
        display();
        System.out.println("\n*************");
        System.out.println("Element removed is "+ dequeueArray() + " and it is replaced by 0");
        enqueueArray(40);
        enqueueArray(50);
        enqueueArray(60);
        display();
        System.out.println("\n*************");
        enqueueArray(70);
        enqueueArray(80);
        enqueueArray(90);
        enqueueArray(100);
        display();
        System.out.println("\n*************");
        System.out.println("Adding one more element 1000 --> queue full message should display");
        enqueueArray(1000);
        display();
        System.out.println("\n*************");
    }
}
/*OUTPUT

10 | 20 | 30 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
*************
Element removed is 10 and it is replaced by 0
0 | 20 | 30 | 40 | 50 | 60 | 0 | 0 | 0 | 0 |
*************
0 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 | 100 |
*************
Adding one more element 1000 --> queue full message should display
Queue is full
0 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 | 100 |
*************

* */