
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard wizard = new Wizard("Stormraven");
        System.out.println("Wizard Name: " + wizard.getName());
        System.out.println("Starting Health: " + wizard.getHealth());

        // This will test takeDamage
        wizard.takeDamage(10);
        System.out.println("Health from taking 10 damage points: " + wizard.getHealth());

        // This tests the lock
        wizard.setKey(1234);
        wizard.lock(1234);
        wizard.takeDamage(30);
        System.out.println("Health after attempting to take 30 damage points while locked: " + wizard.getHealth());

        // This shows return to unlocked
        wizard.unlock(1234);
        wizard.takeDamage(40);
        System.out.println("Health after taking 40 damage points after unlocking: " + wizard.getHealth());
    }
}
