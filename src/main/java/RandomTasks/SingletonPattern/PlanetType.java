package RandomTasks.SingletonPattern;

public enum PlanetType {
    EARTH("Earth", "Земля"),
    SUN("Sun", "Солнце"),
    MOON("Moon", "Луна");

    final String nameEn;
    final String nameRu;

    PlanetType(String nameEn, String nameRu) {
        this.nameEn = nameEn;
        this.nameRu = nameRu;
    }
}
