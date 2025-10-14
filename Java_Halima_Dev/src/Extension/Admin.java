package Extension;

public class Admin {
    private String adminName = "Admin";
    private  String password = "12345678";
    private String mail = "225376@gmail.com";
    String photo = "png.jpeg";
    void sharePhoto(){
        System.out.println(photo);
    }

    private void deleteUser(){
        System.out.println("deleted User");
    }
}

class User extends Admin{
        String username = "jkfnklnakl";
        void userInfo(){
            System.out.println(username);
            System.out.println(photo);
        }

    public static void main(String[] args) {
        User user = new User();
        Admin admin = new Admin();
        System.out.println("Info about the admin");
        admin.sharePhoto();
        System.out.println("Info about the user");
        user.userInfo();

    }
}
