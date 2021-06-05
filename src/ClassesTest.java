import com.objectmaster.classes.Ninja;
import com.objectmaster.classes.Samurai;
import com.objectmaster.classes.Wizard;

public class ClassesTest {

    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        Wizard wizard = new Wizard();

        System.out.println(ninja);
        System.out.println(samurai);
        System.out.println(wizard);

        System.out.println("\nSamurai attacks wizzard\n");

        samurai.deathBlow(wizard);

        System.out.println(samurai);
        System.out.println(wizard);

        System.out.println("\nSamurai Meditates\n");

        samurai.meditate();

        System.out.println(samurai);

        System.out.println("\nWizard heals self & Ninja\n");

        wizard.heal(wizard);
        wizard.heal(ninja);

        System.out.println(wizard);
        System.out.println(ninja);

        System.out.println("\nWizard attacks Samurai");

        wizard.fireball(samurai);

        System.out.println(wizard);
        System.out.println(samurai);

        System.out.println("\nNinja steals from Samurai\n");

        ninja.steal(samurai);

        System.out.println(ninja);
        System.out.println(samurai);

        System.out.println("\nNinja runs away\n");

        ninja.runAway();

        System.out.println(ninja);

        System.out.println("\nCounting all samurais\n");
        Samurai bob = new Samurai();
        Samurai jeff = new Samurai();

        System.out.println(Samurai.howMany());
    }

}
