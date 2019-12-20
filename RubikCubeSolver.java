/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Siris
 */
public class RubikCubeSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cube cube = new Cube();
        //cube.randomizeCube();
        
        
        cube.rotateStream("F");
        cube.displayCube();
        
        if(cube.isSolved())
            System.out.println("The Cube has been solved!");
        else
            System.out.println("The cube is not solved!");
        //cube.displayCube();
        /*
        long count = 0;
        Random rand = new Random();
        
        while(!cube.isSolved()){
            cube.randomRotate(rand.nextInt(6));
            count++;
            //cube.displayCube();
        }
        if(cube.isSolved())
            System.out.println("The Cube has been solved!");
        else
            System.out.println("The cube is not solved!");
        cube.displayCube();
        */
        System.out.println("");
        
    }
    
}
