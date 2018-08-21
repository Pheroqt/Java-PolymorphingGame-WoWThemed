public class Priest extends Classes{
    private String race_skill;
    public Priest (String class_name, String class_skill, int melee_damage, int spell_damage, String race_skill) {
        super(class_name, class_skill, melee_damage, spell_damage);
        this.race_skill = race_skill;
    }

    @Override
    public void race_skill() {
        System.out.println("The priest is casting " + race_skill);
        System.out.println("Priest is activated his stealth detector! He is seeing stealth enemies from far away!");
        
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Your priest's racial skill is " + race_skill);
    }
}
