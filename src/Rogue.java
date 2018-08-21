public class Rogue extends Classes{
     private String race_skill;
    public Rogue(String class_name, String class_skill, int melee_damage, int spell_damage, String race_skill) {
        super(class_name, class_skill, melee_damage, spell_damage);
        this.race_skill = race_skill;
    }

    @Override
    public void race_skill() {
        System.out.println("The rogue is casting " + race_skill);
        System.out.println("Rogue is recuperating himself! He is eating the enemy corpses!");
        
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Your rogue's racial skill is " + race_skill);
    }
}
