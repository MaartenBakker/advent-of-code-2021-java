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
        if (pointA.getX() == pointB.getX()) {
            createVerticalLine();
        } else if (pointA.getY() == pointB.getY()) {
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
        int startY = Math.min(pointA.getY(), pointB.getY());
        int endY = startY == pointA.getY() ? pointB.getY() : pointA.getY();

        for (int i = startY; i <= endY; i++) {
            points.add(new Point(pointA.getX(), i));
        }
    }

    private void createHorizontalLine() {
        //check pos or neg
        int startX = Math.min(pointA.getX(), pointB.getX());
        int endX = startX == pointA.getX() ? pointB.getX() : pointA.getX();

        for (int i = startX; i <= endX ; i++) {
            points.add(new Point(i, pointA.getY()));
        }
    }

    private void createDiagonalLine() {
        //force left to right, choose between up and down
        int startX = Math.min(pointA.getX(), pointB.getX());
        int endX = startX == pointA.getX() ? pointB.getX() : pointA.getX();
        int startY = startX == pointA.getX() ? pointA.getY() : pointB.getY();
        int endY = startY == pointA.getY()? pointB.getY() : pointA.getY();

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
