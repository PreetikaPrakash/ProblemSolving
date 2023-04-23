/**
 Understanding how array stores elements of object type or how it stores references of objects
 */
package arrays;
public class arrayofObjects {

    // with the help of constructor values are assigned to object
    // constructor is used for initializing member variables of the class.
    private String name;
    private String color;
    arrayofObjects(String name, String color){
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        arrayofObjects arr[] = new arrayofObjects[5]; // Array of size 5 is created of arrayOfObjects(class type)
        // each 5 elements of array will hold reference of 5 different objects containing 5 different values.

        // array element 1; object 1; object 1 holds values name="Jade", color="yellow"
        arr[0] = new arrayofObjects("Jade","yellow");
        arr[1] = new arrayofObjects("Joan","red");
        arr[2] = new arrayofObjects("Jacob","brown");
        arr[3] = new arrayofObjects("Jen","pink");
        arr[4] = new arrayofObjects("Jack","mauve");

        // extract details from the object array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].name + " likes " + arr[i].color + " color.");
        }

    }
}
