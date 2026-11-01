import java.util.Scanner;
public class UncheckedExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        try{
            validateName(name);
            System.out.println("Name: "+name);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();
    }
    public static void validateName(String name){
        if(name==null||name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty ");
        }
    }
}
