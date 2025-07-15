import java.util.*;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name =  sc.nextLine();
        System.out.println("Name is:"+ name);

        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Age is:"+ age);
        sc.nextLine();

        System.out.println("Enter your college name:");
        String CollegeName = sc.nextLine();
        System.out.println("College name:"+ CollegeName);

        System.out.println("Enter your Branch:");
        String Branch = sc.nextLine();
        System.out.println("Branch is:"+ Branch);
    }
}
