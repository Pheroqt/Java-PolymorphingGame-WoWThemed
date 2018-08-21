public class ClassCreator {
    public Classes classCreator (String class_type) {
        if (class_type.equals("Warrior")) {
            return new Warrior("Warrior", "Heroic String", 500, 0, "Berserker Rage");
        }
        else if (class_type.equals("Druid")) {
            return new Druid("Druid", "Bash", 400, 300, "Shadowmeld");
        }
        else if (class_type.equals("Rogue")) {
            return new Rogue("Rogue", "Backstab", 600, 100, "Cannibalism");
        }
        else if (class_type.equals("Priest")) {
            return new Priest("Priest", "Shadow bolt", 400, 100, "Thief detection");
        }
        else {
            return null;
        }
    }
}
