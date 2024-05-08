public class FabricaDeLuchadores {
    public static Luchador createFighter(String fighterType) {
        switch (fighterType) {
            case "1":
                return new ChoroPortenho();
            case "2":
                return new MineroWarrior();
            case "3":
                return new PunkiPorteno();
            default:
                return null;
        }
    }
}

