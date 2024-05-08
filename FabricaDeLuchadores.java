public class FabricaDeLuchadores {
    // Método estático para crear instancias de luchadores según el tipo
    public static Object createFighter(String fighterType) {
        if (fighterType.equals("1")) {
            // Crea una instancia de ChoroPortenho
            return new ChoroPortenho();
        } else if (fighterType.equals("2")) {
            // Crea una instancia de MineroWarrior
            return new MineroWarrior();
        } else if (fighterType.equals("3")) {
            // Manejar tipos no válidos, puede lanzar una excepción o retornar null
            return new PunkiPorteno();
        } else {
            // Manejar tipos no válidos, puede lanzar una excepción o retornar null
            return null;
        }
    }    
    
}

