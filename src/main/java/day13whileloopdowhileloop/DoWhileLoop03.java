package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*
        Usernama = "admın" Password= "pwd123"
        Kullanıcıdan username ve password' u alın
        Username ve password doğru ise "Hesabınıza hoşgeldiniz."
        Username ve password yanlış ise 4 kere "Username ve password'unuzu giriniz" mesajı versin
        Username ve password 4. kere yanlış girilirse "Hesabınız bloke olmuştur" mesajı vererek işlemi tamamlayınız.
         */

        Scanner input = new Scanner(System.in);


        int counter =0;//sayaç oluşturduk "0" sıfır olmasını sebebi daha hiç giriş yapmadık
        do{
            if(counter==4){
                System.out.println("Hesabınız bloke olmuştur.");
                break;
            }
            System.out.println("Username'i giriniz..");
            String username = input.next();

            System.out.println("Password'u giriniz.");
            String password = input.next();

            if(username.equals("admin")&& password.equals("pwd123")){
                System.out.println("Hesabınıza hoşgeldiniz.");
                break;
            }
            counter++;

        }while (true);

    }
}
