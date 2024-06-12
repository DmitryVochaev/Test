package TestCode;



import java.util.Random;


public class Main{
    public static void main(String[] args) {
        System.out.println("Student marks");

        Random random = new Random();
        int count = random.nextInt(4)+2;
        System.out.println(count);




        switch (count) {
            case 2 :
                System.out.println("bad mark");
                break;
            case 3 :
                System.out.println("satisfactory mark");
                break;
            case 4 :
                System.out.println("good mark");
                break;
            case 5 :
                System.out.println("excellent mark");
                break;
            default:
                System.out.println("Error mark");
        }
    }
}

