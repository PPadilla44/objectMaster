import com.objectmaster.Human;

public class HumanTest {

    public static void main(String[] args) {
        Human pablo = new Human();
        Human rheanna = new Human();

        System.out.println(pablo);
        System.out.println(rheanna);

        System.out.println("ATTACK");
        pablo.attack(rheanna);

        System.out.println(pablo);
        System.out.println(rheanna);
    }

}
