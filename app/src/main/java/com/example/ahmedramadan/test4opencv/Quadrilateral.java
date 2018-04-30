package com.example.ahmedramadan.test4opencv;

/**
 * Created by AhmedRamadan on 4/5/2018.
 */

import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;

public class Quadrilateral {
    public MatOfPoint contour;
    public Point[] points;

    public Quadrilateral(MatOfPoint contour, Point[] points) {
        this.contour = contour;
        this.points = points;
    }
}