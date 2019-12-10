public class ExceptionDemo {
    public static void func() {
        int[] arr = {1, 2, 3};
        try {
            System.out.printf("befor %d \n", arr[0] );
            System.out.println(arr[100]);
            System.out.println("after");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        func();
        System.out.println("after func");
    }
}
