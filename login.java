import java.util.Scanner;
class login {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String username;
    String password;

    System.out.println("Log in:");
    System.out.println("username: ");
    username = input.next();

    System.out.println("password: ");
    password = input.next();

 

    if(username.equals("sss") && password.equals(password)) 
{
        System.out.println("You are logged in");
}
else
{
System.out.println("Wrong");
}



}

}