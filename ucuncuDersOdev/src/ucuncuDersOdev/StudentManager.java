package ucuncuDersOdev;

public class StudentManager extends UserManager {
    public void logIn(User user) {
   	 System.out.println(user.getFirstName()+" "+user.getLastName()+":Ogrenci giris yaptý.");
    }
}
