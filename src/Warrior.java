public class Warrior extends Classes{
    private String race_skill;
    public Warrior(String class_name, String class_skill, int melee_damage, int spell_damage, String race_skill) {
        super(class_name, class_skill, melee_damage, spell_damage);
        this.race_skill = race_skill;
    }

    @Override
    public void race_skill() {
        System.out.println("The warrior is casting " + race_skill);
        setMelee_damage(1000);
        System.out.println("Warrior is relentless now! He has +500 melee damage.");
        
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Your warrior's racial skill is " + race_skill);
    }
    
    
}
