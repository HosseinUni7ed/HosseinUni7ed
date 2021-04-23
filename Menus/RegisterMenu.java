
import java.util.regex.Pattern;

public class RegisterMenu extends Menu{
    public RegisterMenu(Menu parentMenu){
        super("Register Menu" , parentMenu);
        subMenus.put(Pattern.compile("user login"), loginMenu());
        subMenus.put(Pattern.compile("user create"), signupMenu());
    }

    public Menu loginMenu(){
        return new Menu("Login Menu", this) {
            @Override
            public void show(){}

            @Override
            public void execute(){}
        };
    }

    public Menu signupMenu(){
        return new Menu("Signup Menu", this) {
            @Override
            public void show() {

            }

            @Override
            public void execute() {

            }
        };
    }

    public void run(){}
}
