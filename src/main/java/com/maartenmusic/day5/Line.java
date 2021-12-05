package com.maartenmusic.day5;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private final List<Point> points = new ArrayList<>();
    private final Point pointA;
    private final Point pointB;

    // format: "x,y -> x,y"
    public Line(String input) {
        String[] splitInput = input.split(" -> ");
        pointA = new Point(Integer.parseInt(splitInput[0].split(",")[0]), Integer.parseInt(splitInput[0].split(",")[1]));
        pointB = new Point(Integer.parseInt(splitInput[1].split(",")[0]), Integer.parseInt(splitInput[1].split(",")[1]));

        //check horizontal or vertical
        if (pointA.x() == pointB.x()) {
            createVerticalLine();
        } else if (pointA.y() == pointB.y()) {
            createHorizontalLine();
        // comment out for part 1
        } else {
            createDiagonalLine();
        }
    }

    public List<Point> getPoints() {
        return points;
    }

    private void createVerticalLine() {
        //check pos or neg
        int startY = Math.min(pointA.y(), pointB.y());
        int endY = startY == pointA.y() ? pointB.y() : pointA.y();

        for (int i = startY; i <= endY; i++) {
            points.add(new Point(pointA.x(), i));
        }
    }

    private void createHorizontalLine() {
        //check pos or neg
        int startX = Math.min(pointA.x(), pointB.x());
        int endX = startX == pointA.x() ? pointB.x() : pointA.x();

        for (int i = startX; i <= endX ; i++) {
            points.add(new Point(i, pointA.y()));
        }
    }

    private void createDiagonalLine() {
        //force left to right, choose between up and down
        int startX = Math.min(pointA.x(), pointB.x());
        int endX = startX == pointA.x() ? pointB.x() : pointA.x();
        int startY = startX == pointA.x() ? pointA.y() : pointB.y();
        int endY = startY == pointA.y()? pointB.y() : pointA.y();

        boolean up = startY < endY;

        for (int i = startX; i <= endX; i++) {
            points.add(new Point(i, startY));
            if (up) {
                startY++;
            } else {
                startY--;
            }
        }
    }

    @Override
    public String toString() {
        points.forEach(System.out::println);
        return "";
    }
}
