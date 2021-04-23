
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Menu {
    private String name;
    Menu parentMenu;
    public static Menu mainMenu;
    public static Menu userMenu;
    protected HashMap<Pattern, Menu> subMenus;
    static Scanner scanner;

    public Menu(String name, Menu parentMenu){
        this.name = name;
        this.parentMenu = parentMenu;
        subMenus = new HashMap<>();
    }

    public static void setScanner(Scanner scanner){
        Menu.scanner = scanner;
    }

    public void show(){}

    public void execute(){}
}
