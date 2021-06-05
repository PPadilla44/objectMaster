import com.objectmaster.Human;

public class HumanTest {

    public static void main(String[] args) {
        Human pablo = new Human();
        Human rheanna = new Human();

        System.out.println(pablo.getHealth());
        System.out.println(rheanna.getHealth());

        pablo.attack(rheanna);

        System.out.println(pablo.getHealth());
        System.out.println(rheanna.getHealth());
    }

}
