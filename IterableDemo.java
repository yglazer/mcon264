
public class IterableDemo {
    public static void main(String[] args) {
        int[] list = { 918, 762, 103, 894, 567 };
        MyList mylist = new MyList(list);

        
        System.out.println("List Items:");
        for (int y:mylist ) {
            System.out.println(y);
        }
    }
}
