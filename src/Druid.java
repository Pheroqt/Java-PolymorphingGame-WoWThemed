public class Druid extends Classes{
     private String race_skill;
    public Druid(String class_name, String class_skill, int melee_damage, int spell_damage, String race_skill) {
        super(class_name, class_skill, melee_damage, spell_damage);
        this.race_skill = race_skill;
    }

    @Override
    public void race_skill() {
        System.out.println("The druid is casting " + race_skill);
        setSpell_damage(600);
        System.out.println("Druid is hidden in the shadows now! She has +300 spell damage. ");
        
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Your druid's racial skill is " + race_skill);
    }
}
