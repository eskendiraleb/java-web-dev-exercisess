package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
    public class Area {
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius");
        Double radius = input.nextDouble();
        //Double pi = 3.14;
        Double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area + " .");

          }
}
