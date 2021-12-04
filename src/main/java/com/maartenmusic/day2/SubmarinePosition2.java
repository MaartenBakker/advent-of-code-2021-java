package com.maartenmusic.day2;

public class SubmarinePosition2 extends SubmarinePosition{
    private final int aim;

    public SubmarinePosition2(int horizontalPos, int depth, int aim) {
        super(horizontalPos, depth);
        this.aim = aim;
    }

    @Override
    public SubmarinePosition2 move(SubmarineCommand command){
        return switch (command.getDirection()) {
            case FORWARD -> new SubmarinePosition2(
                    this.horizontalPos + command.getAmount(),
                    this.depth + this.aim * command.getAmount(),
                    this.aim);
            case DOWN -> new SubmarinePosition2(this.horizontalPos, this.depth, this.aim + command.getAmount());
            case UP -> new SubmarinePosition2(this.horizontalPos, this.depth, this.aim - command.getAmount());
        };
    }

    @Override
    public String toString() {
        return "SubmarinePosition2{" +
                "horizontalPos=" + horizontalPos +
                ", depth=" + depth +
                ", aim=" + aim +
                '}';
    }
}
