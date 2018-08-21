
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to WoW Character Creator!");
        System.out.println("Press q for quitting. ");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Classes :\n"
                        +  "Warrior , Druid , Rogue , Priest");
       
        while (true) {
            System.out.println("Which class do you want to create?");
            String class_req = scanner.nextLine();
            if (class_req.equals("q")) {
                System.out.println("Quitting the program");
                break;
            }
            else {
                ClassCreator create_class = new ClassCreator();
                Classes classes = create_class.classCreator(class_req);
                if (classes == null) {
                    System.out.println("Please type a class shown above...");
                }
                else {
                    classes.displayInfo();
                    classes.race_skill();
                    classes.attack();
                }
            }
            
        }
}
}
