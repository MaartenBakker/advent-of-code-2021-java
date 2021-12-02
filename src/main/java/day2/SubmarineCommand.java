package day2;

import java.util.HashMap;
import java.util.Map;

public class SubmarineCommand {
    private final SubmarineCommandDirection direction;
    private final int amount;

    public SubmarineCommand(String command) {
        String[] splitCommand = command.split(" ");
        this.direction = SubmarineCommandDirection.getByLabel(splitCommand[0]);
        this.amount = Integer.parseInt(splitCommand[1]);
    }

    public SubmarineCommandDirection getDirection() {
        return direction;
    }

    public int getAmount() {
        return amount;
    }

    public enum SubmarineCommandDirection {
        FORWARD("forward"),
        DOWN("down"),
        UP("up");

        private static final Map<String, SubmarineCommandDirection> BY_LABEL = new HashMap<>();

        static {
            for (SubmarineCommandDirection s: values()) {
                BY_LABEL.put(s.label, s);
            }
        }

        public final String label;

        public static SubmarineCommandDirection getByLabel(String label) {
            return BY_LABEL.get(label);
        }

        private SubmarineCommandDirection(String label) {
            this.label = label;
        }
    }
}
