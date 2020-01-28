import java.util.Scanner;

public class AdminOperations {
    private static AdminOperations adminOperations= new AdminOperations();
    private Admin admin;
    private AdminOperations getInstance(){
        return adminOperations;
    }
    private  class Admin{
        public Admin(String name, String password) {
            this.name = name;
            this.password = password;
        }

        String name;
        String password;
    }

    private void configureThemePark(){
        if(login()){
            for(int i=0;i<ThemPark.games.size();i++){
                System.out.println("Select "+i+1+"for"+ThemPark.games.get(1).getName());
            }
            int selectGameOption = GeneralUtils.getInstance().checkAndReturnValidInteger();
            Game selectedGame = ThemPark.games.get(selectGameOption-1);
            for(int i=0;i<ThemPark.games.size();i++){
                System.out.println("Select "+i+1+"to for"+ThemPark.availableOperators.get(1).name);
            }
            int selectedOperatorAction = GeneralUtils.getInstance().checkAndReturnValidInteger();
            Operator selectedOperator =ThemPark.availableOperators.get(selectedOperatorAction-1);

        }
    }

    private boolean registerAdmin(){
        System.out.println("Enter Your Name");
        String name= GeneralUtils.getInstance().checkAndReturnValidString();
        System.out.println("Enter your New password");
        String password =GeneralUtils.getInstance().checkAndReturnValidString();
        System.out.println("Enter your  password again");
        String retypedPassword =GeneralUtils.getInstance().checkAndReturnValidString();
        if(password.equals(retypedPassword)){
            System.out.println("Admin Registered Successfully");
            this.admin=new Admin(name,password);
            return true;
        }else{
            System.out.println("Password not  matched Kindly try again");
            return registerAdmin();
        }

    }

    private  boolean login(){
        if(admin==null){
         return registerAdmin();
        }else{
            System.out.println("Enter Your Name");
            String name= GeneralUtils.getInstance().checkAndReturnValidString();
            System.out.println("Enter your New password");
            String password =GeneralUtils.getInstance().checkAndReturnValidString();
            if(admin.name.equals(name)&&password.equals(password)){
                System.out.println("Authentication Succeed");
                return true;
            }else{
                System.out.println("Authentication failed retry");
                return login();
            }
        }
    }

}
