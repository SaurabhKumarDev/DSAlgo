public class SwitchStatement {
    public static void main(String[] args) {
        /* Switch Cases*/
        // In switch case when one condition gets true then other condition also getting true
        // To prevent this we can use the break; keyword

        // Integer
        int choice = 1;
        switch (choice) {
            case 1 :
                System.out.println("Samosa");
                break;
            case 2 :
                System.out.println("Burger");
                break;
            case 3 :
                System.out.println("Rabdi");
                break;
            default:
                System.out.println("Enter right choice");
        }

        // Character
        char ch = 'b';
        switch (ch) {
            case 'a' :
                System.out.println("Samosa");
                break;
            case 'b' :
                System.out.println("Burger");
                break;
            case 'c' :
                System.out.println("Rabdi");
                break;
            default:
                System.out.println("Enter right choice");
        }

        // String
        String str = "two";
        switch (str) {
            case "one" :
                System.out.println("Samosa");
                break;
            case "two" :
                System.out.println("Burger");
                break;
            case "three" :
                System.out.println("Rabdi");
                break;
            default:
                System.out.println("Enter right choice");
        }
    }
}