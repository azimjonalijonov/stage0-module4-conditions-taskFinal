package school.mjc.stage0.conditions.finalTask;

import static java.lang.Math.abs;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if(firstSide>abs(secondSide-thirdSide)&&firstSide<(secondSide+thirdSide)&&secondSide>abs(firstSide-thirdSide)&&secondSide<(firstSide+thirdSide)&&thirdSide>abs(secondSide-firstSide)&&thirdSide<(secondSide+firstSide)){
            System.out.println("this is a valid triangle");
        }else {
            System.out.println("it's not a triangle");
        }
    }
}
