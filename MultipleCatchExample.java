public class MultipleCatchExample {
    public static void main(String args[]){
        try{
            int arr[] = new int[5];
            arr[10]= 100;
            int num =10/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }
        catch(ArithmeticException e){
             System.out.println("Arithmetic error");
        }
    }
}
