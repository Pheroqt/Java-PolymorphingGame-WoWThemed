public class Classes {
    private String class_name;
    private String class_skill;
    private int melee_damage;
    private int spell_damage;
    
    public Classes (String class_name, String class_skill, int melee_damage, int spell_damage) {
        this.class_name = class_name;
        this.class_skill = class_skill;
        this.melee_damage = melee_damage;
        this.spell_damage = spell_damage;
    }
    public void displayInfo () {
        System.out.println("Class Name : " + class_name);
        System.out.println("Class Skill : " + class_skill);
        System.out.println("Melee Damage : " + melee_damage);
        System.out.println("Spell Damage : " + spell_damage);
        
    }
    public void attack () {
        System.out.println(class_name + " attacking with " + class_skill + " with " + melee_damage + " melee damage and " + spell_damage + " spell damage. ");
    }
    public void race_skill () {
        System.out.println("This class doesn't have a race!");
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getClass_skill() {
        return class_skill;
    }

    public void setClass_skill(String class_skill) {
        this.class_skill = class_skill;
    }

    public int getMelee_damage() {
        return melee_damage;
    }

    public void setMelee_damage(int melee_damage) {
        this.melee_damage = melee_damage;
    }

    public int getSpell_damage() {
        return spell_damage;
    }

    public void setSpell_damage(int spell_damage) {
        this.spell_damage = spell_damage;
    }
    
}
