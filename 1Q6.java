import java.util.*;
class Login{
    static int i;
    static String userId = "jp",pass = "botany";
    public static String loginUser(String userId, String pass) {
        if(userId.equals("jp")&&pass.equals("botany"))
        {
            return "Welcome jp";
        }
        else{
            for(i=0;i<4;i++){
                
            return "You have entered wrong credentials";
            }if(i==3)
            {
                return "Contact Admin";
            }
        }
        return (" ");
    }

}
public class Assignment1Q6 extends Login{
    public static void main(String[] args) {
        
        String userId, password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        userId = sc.nextLine();
        System.out.print("Enter password:");
        pass = sc.nextLine();
        System.out.println(loginUser(userId,pass));
        
}
}