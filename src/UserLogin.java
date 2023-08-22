import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if (userName.equals("nesly") && password.equals("java123")) {
            System.out.print("Giriş Başarılı!");
        } else {
            System.out.print("Bilgileriniz Yanlış!");
        }
    }
}
