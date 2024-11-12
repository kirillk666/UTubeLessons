package RandomTasks.strategies.marketModelsByAutofill;

import lombok.Getter;

@Getter
public enum AutoFillGroupCode {
    ABSENT("Absent"),
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High"),
    SUPER("Super"),
    SUPER2("Super2");

    private final String code;

    AutoFillGroupCode(String code) {
        this.code = code;
    }
}
