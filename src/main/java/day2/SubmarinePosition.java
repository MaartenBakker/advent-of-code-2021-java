package day2;

public class SubmarinePosition {
    final int horizontalPos;
    final int depth;

    public SubmarinePosition(int horizontalPos, int depth) {
        this.horizontalPos = horizontalPos;
        this.depth = depth;
    }

    public SubmarinePosition move(SubmarineCommand command){
        return switch (command.getDirection()) {
            case FORWARD -> new SubmarinePosition(this.horizontalPos + command.getAmount(), this.depth);
            case DOWN -> new SubmarinePosition(this.horizontalPos, this.depth + command.getAmount());
            case UP -> new SubmarinePosition(this.horizontalPos, this.depth - command.getAmount());
        };
    }

    public long multiplyPosByDepth() {
        return (long) this.horizontalPos * this.depth;
    }

    @Override
    public String toString() {
        return "SubmarinePosition{" +
                "horizontalPos=" + horizontalPos +
                ", depth=" + depth +
                '}';
    }
}
