package ucuncuDersOdev;

public class InstructorManager extends UserManager {
    public void logIn(User user) {
   	 System.out.println(user.getFirstName()+" "+user.getLastName()+" Egitmen girisi yapýldý.");
    }

}
