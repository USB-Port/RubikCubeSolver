/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcubesolver;

import java.util.Random;

/**
 *
 * @author Siris
 */
public class Cube {
    private final char cube[][][] = new char[6][3][3]; 
 
    private static final int FRONT = 0;
    private static final int BACK = 1;
    private static final int RIGHT = 2;
    private static final int LEFT = 3;
    private static final int TOP = 4;
    private static final int DOWN = 5;
    
    public Cube(){

	for (int i = 0; i < 6; i++) {
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
                            switch(i){
                                case FRONT:
                                    cube[FRONT][k][j] = 'W';
                                    break;
                                case BACK:
                                    cube[BACK][k][j] = 'B';
                                    break;
                                case RIGHT:
                                    cube[RIGHT][k][j] = 'G';
                                    break;
                                case LEFT:
                                    cube[LEFT][k][j] = 'Y';
                                    break;
                                case TOP:
                                    cube[TOP][k][j] = 'R';
                                    break;
                                case DOWN:
                                    cube[DOWN][k][j] = 'O';
                                    break;
                                default:
                                    System.out.println("Error: Initializing cube failed!\n");
                                    
                            }

			}
		}
	}
}
       public void displayCube(){
	//Prints out the current cube configuration.
	for (int i = 0; i < 6; i++) {
		System.out.println("\n------------------\n");
		switch(i){
                    case FRONT:
                        System.out.println("Front:\n");
                        break;
                    case BACK:
                        System.out.println("Back:\n");
                        break;
                    case LEFT:
                        System.out.println("Left:\n");
                        break;
                    case RIGHT:
                        System.out.println("Right:\n");
                        break;
                    case TOP:
                        System.out.println("Top:\n");
                        break;
                    case DOWN:
                        System.out.println("Down:\n");
                        break;
                    default:                                    
                       
                }
                
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cube[i][k][j] + " ");
			}
		}
                
	}
}
       public boolean isSolved(){
            for (int i = 0; i < 6; i++) {
                    for (int k = 0; k < 3; k++) {
                            for (int j = 0; j < 3; j++) {
                                switch(i){
                                    case FRONT:
                                        if(cube[FRONT][k][j] != 'W'){
                                            return false;
                                        }
                                        break;
                                    case BACK:
                                        if(cube[BACK][k][j] != 'B'){
                                            return false;
                                        }
                                        break;
                                    case RIGHT:
                                        if(cube[RIGHT][k][j] != 'G'){
                                            return false;
                                        }
                                        break;
                                    case LEFT:
                                        if(cube[LEFT][k][j] != 'Y'){
                                            return false;
                                        }
                                        break;
                                    case TOP:
                                        if(cube[TOP][k][j] != 'R'){
                                            return false;
                                        }
                                        break;
                                    case DOWN:
                                        if(cube[DOWN][k][j] != 'O'){
                                            return false;
                                        }
                                        break;
                                    default:
                                        System.out.println("Error: checking for a solved cube failed!\n");

                                }

                            }
                    }
            }
            return true;
       }
       
       public void randomizeCube(){
           Random rand = new Random();
           
           for(int i = 150; i >= 0; i--){
               
               	switch(rand.nextInt(6)){
                    case FRONT:
                        F();
                        break;
                    case BACK:
                        B();
                        break;
                    case LEFT:
                        L();
                        break;
                    case RIGHT:
                        R();
                        break;
                    case TOP:
                        T();
                        break;
                    case DOWN:
                        D();
                        break;
                    default:                                    
                       
                }
           }
       }
        public void randomRotate(int side){

               	switch(side){
                    case FRONT:
                        F();
                        System.out.println("Front");
                        break;
                    case BACK:
                        B();
                        System.out.println("Back");
                        break;
                    case LEFT:
                        L();
                        System.out.println("Left");
                        break;
                    case RIGHT:
                        R();
                        System.out.println("Right");
                        break;
                    case TOP:
                        T();
                        System.out.println("Top");
                        break;
                    case DOWN:
                        D();
                        System.out.println("Down");
                        break;
                    default:                                    
                       
                }
           
        }
        
        public void rotateStream(String moves){
            for(int i = 0; i <moves.length(); i++){
                switch(moves.charAt(i)){
                    case 'F':
                        if(moves.length() == i+1){
                            F();
                        }
                        else{
                            if(moves.charAt(i+1) == 'p'){
                                Fp();
                                i++;
                            }
                            else{
                                F();
                            }
                        }
                        break;
                    case 'B':
                        if(moves.length() == i+1){
                            B();
                        }
                        else{
                            if(moves.charAt(i+1) == 'p'){
                                Bp();
                                i++;
                            }
                            else{
                                B();
                            }
                        }
                        break;
                    case 'L':
                        if(moves.length() == i+1){
                            L();
                        }
                        else{
                            if(moves.charAt(i+1) == 'p'){
                                Lp();
                                i++;
                            }
                            else{
                                L();
                            }
                        }
                        break;
                    case 'R':
                        if(moves.length() == i+1){
                            R();
                        }
                        else{
                            if(moves.charAt(i+1) == 'p'){
                                Rp();
                                i++;
                            }
                            else{
                                R();
                            }
                        }
                        break;
                    case 'T':
                        if(moves.length() == i+1){
                            T();
                        }
                        else{
                            if(moves.charAt(i+1) == 'p'){
                                Tp();
                                i++;
                            }
                            else{
                                T();
                            }
                        }
                        break;
                    case 'D':
                        if(moves.length() == i+1){
                            D();
                        }
                        else{
                            if(moves.charAt(i+1) == 'p'){
                                Dp();
                                i++;
                            }
                            else{
                                D();
                            }
                        }
                        break;
                    default:                                    
                       
                }
                
            }
        }
       
       
       public void F(){
           //Rotate the front corner colors
           char temp = cube[FRONT][0][0];
           cube[FRONT][0][0] = cube[FRONT][0][2];
           cube[FRONT][0][2] = cube[FRONT][2][2];
           cube[FRONT][2][2] = cube[FRONT][0][2];
           cube[FRONT][0][2] = temp;
           
           //rotate the front center colors
           temp = cube[FRONT][0][1];
           cube[FRONT][0][1] = cube[FRONT][1][0];
           cube[FRONT][1][0] = cube[FRONT][2][1];
           cube[FRONT][2][1] = cube[FRONT][1][2];
           cube[FRONT][2][1] = temp;
           
           //rotate the outter top corner colors
           temp = cube[TOP][0][0];
           cube[TOP][0][0] = cube[RIGHT][0][0];
           cube[RIGHT][0][0] = cube[DOWN][0][0];
           cube[DOWN][0][0] = cube[LEFT][2][2];
           cube[LEFT][2][2] = temp;
           
           //rotate the otter side corner
           temp = cube[TOP][2][0];
           cube[TOP][2][0] = cube[RIGHT][2][0];
           cube[RIGHT][2][0] = cube[DOWN][2][0];
           cube[DOWN][2][0] = cube[LEFT][0][2];
           cube[LEFT][0][2] = temp;
           
           //rotate the outter edge colors
           temp = cube[TOP][1][0];
           cube[TOP][1][0] = cube[RIGHT][1][0];
           cube[RIGHT][1][0] = cube[DOWN][1][0];
           cube[DOWN][1][0] = cube[LEFT][1][2];
           cube[LEFT][1][2] = temp;
          
       }
       
       public void R(){
           //Rotate the front corner colors
           char temp = cube[RIGHT][0][0];
           cube[RIGHT][0][0] = cube[RIGHT][0][2];
           cube[RIGHT][0][2] = cube[RIGHT][2][2];
           cube[RIGHT][2][2] = cube[RIGHT][0][2];
           cube[RIGHT][0][2] = temp;
           
           //rotate the front center colors
           temp = cube[RIGHT][0][1];
           cube[RIGHT][0][1] = cube[RIGHT][1][0];
           cube[RIGHT][1][0] = cube[RIGHT][2][1];
           cube[RIGHT][2][1] = cube[RIGHT][1][2];
           cube[RIGHT][2][1] = temp;
           
           //rotate the outter top corner colors
           temp = cube[TOP][0][2];
           cube[TOP][0][2] = cube[FRONT][2][2];
           cube[FRONT][2][2] = cube[DOWN][0][2];
           cube[DOWN][0][2] = cube[BACK][0][0];
           cube[BACK][0][0] = temp;
           
           //rotate the otter side corner
           temp = cube[FRONT][0][2];
           cube[FRONT][0][2] = cube[DOWN][0][0];
           cube[DOWN][0][0] = cube[BACK][0][2];
           cube[BACK][0][2] = cube[TOP][2][2];
           cube[TOP][2][2] = temp;
           
           //rotate the outter edge colors
           temp = cube[TOP][2][1];
           cube[TOP][2][1] = cube[FRONT][1][2];
           cube[FRONT][1][2] = cube[DOWN][0][1];
           cube[DOWN][0][1] = cube[BACK][0][1];
           cube[BACK][0][1] = temp;
          
       }
       public void L(){
           //Rotate the front corner colors
           char temp = cube[LEFT][0][0];
           cube[LEFT][0][0] = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[LEFT][2][2];
           cube[LEFT][2][2] = cube[LEFT][0][2];
           cube[LEFT][0][2] = temp;
           
           //rotate the front center colors
           temp = cube[LEFT][0][1];
           cube[LEFT][0][1] = cube[LEFT][1][0];
           cube[LEFT][1][0] = cube[LEFT][2][1];
           cube[LEFT][2][1] = cube[LEFT][1][2];
           cube[LEFT][2][1] = temp;
           
           //rotate the outter top corner colors
           temp = cube[TOP][0][2];
           cube[TOP][0][2] = cube[FRONT][0][0];
           cube[FRONT][0][0] = cube[DOWN][2][0];
           cube[DOWN][2][0] = cube[BACK][2][2];
           cube[BACK][2][2] = temp;
           
           //rotate the otter side corner
           temp = cube[FRONT][2][0];
           cube[FRONT][2][0] = cube[DOWN][2][2];
           cube[DOWN][2][2] = cube[BACK][0][2];
           cube[BACK][0][2] = cube[TOP][0][0];
           cube[TOP][0][0] = temp;
           
           //rotate the outter edge colors
           temp = cube[TOP][1][0];
           cube[TOP][0][1] = cube[FRONT][1][0];
           cube[FRONT][1][0] = cube[DOWN][2][1];
           cube[DOWN][2][1] = cube[BACK][1][2];
           cube[BACK][0][1] = temp;
          
       }
       public void B(){
           //Rotate the front corner colors
           char temp = cube[BACK][0][0];
           cube[BACK][0][0] = cube[BACK][0][2];
           cube[BACK][0][2] = cube[BACK][2][2];
           cube[BACK][2][2] = cube[BACK][2][0];
           cube[BACK][2][0] = temp;
           
           //rotate the front center colors
           temp = cube[BACK][0][1];
           cube[BACK][0][1] = cube[BACK][1][2];
           cube[BACK][1][2] = cube[BACK][2][1];
           cube[BACK][2][1] = cube[BACK][1][0];
           cube[BACK][1][0] = temp;
           
           //rotate the outter top corner colors
           temp = cube[TOP][2][2];
           cube[TOP][2][2] = cube[LEFT][0][0];
           cube[LEFT][0][0] = cube[DOWN][2][2];
           cube[DOWN][2][2] = cube[RIGHT][2][2];
           cube[RIGHT][2][2] = temp;
           
           //rotate the otter side corner
           temp = cube[TOP][0][2];
           cube[TOP][0][2] = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[DOWN][0][2];
           cube[DOWN][0][2] = cube[RIGHT][0][2];
           cube[RIGHT][0][2] = temp;
           
           //rotate the outter edge colors
           temp = cube[TOP][1][2];
           cube[TOP][1][2] = cube[LEFT][0][1];
           cube[LEFT][0][1] = cube[DOWN][1][2];
           cube[DOWN][1][2] = cube[RIGHT][1][2];
           cube[RIGHT][1][2] = temp;
          
       }
       
       public void T(){
           //Rotate the front corner colors
           char temp = cube[TOP][0][0];
           cube[TOP][0][0] = cube[TOP][0][2];
           cube[TOP][0][2] = cube[TOP][2][2];
           cube[TOP][2][2] = cube[TOP][0][2];
           cube[TOP][0][2] = temp;
           
           //rotate the front center colors
           temp = cube[TOP][0][1];
           cube[TOP][0][1] = cube[TOP][1][0];
           cube[TOP][1][0] = cube[TOP][2][1];
           cube[TOP][2][1] = cube[TOP][1][2];
           cube[TOP][2][1] = temp;
           
           //rotate the outter top corner colors
           temp = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[BACK][0][2];
           cube[BACK][0][2] = cube[RIGHT][0][2];
           cube[RIGHT][0][2] = cube[FRONT][0][2];
           cube[FRONT][0][2] = temp;
           
           //rotate the otter side corner
           temp = cube[LEFT][2][0];
           cube[LEFT][2][0] = cube[BACK][0][0];
           cube[BACK][0][0] = cube[RIGHT][0][0];
           cube[RIGHT][0][0] = cube[FRONT][0][0];
           cube[FRONT][0][0] = temp;
           
           //rotate the outter edge colors
           temp = cube[LEFT][1][0];
           cube[LEFT][1][0] = cube[BACK][0][1];
           cube[BACK][0][1] = cube[RIGHT][0][1];
           cube[RIGHT][0][1] = cube[FRONT][0][1];
           cube[FRONT][0][1] = temp;
          
       }
       
       public void D(){
           //Rotate the front corner colors
           char temp = cube[DOWN][0][0];
           cube[DOWN][0][0] = cube[DOWN][0][2];
           cube[DOWN][0][2] = cube[DOWN][2][2];
           cube[DOWN][2][2] = cube[DOWN][0][2];
           cube[DOWN][0][2] = temp;
           
           //rotate the front center colors
           temp = cube[DOWN][0][1];
           cube[DOWN][0][1] = cube[DOWN][1][0];
           cube[DOWN][1][0] = cube[DOWN][2][1];
           cube[DOWN][2][1] = cube[DOWN][1][2];
           cube[DOWN][2][1] = temp;
           
           //rotate the outter top corner colors
           temp = cube[RIGHT][2][0];
           cube[RIGHT][2][0] = cube[BACK][2][0];
           cube[BACK][2][0] = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[FRONT][2][0];
           cube[FRONT][2][0] = temp;
           
           //rotate the otter side corner
           temp = cube[RIGHT][2][2];
           cube[RIGHT][2][2] = cube[BACK][2][2];
           cube[BACK][2][2] = cube[LEFT][2][2];
           cube[LEFT][2][2] = cube[FRONT][2][2];
           cube[FRONT][2][2] = temp;
           
           //rotate the outter edge colors
           temp = cube[RIGHT][2][1];
           cube[RIGHT][2][1] = cube[BACK][2][1];
           cube[BACK][2][1] = cube[LEFT][1][2];
           cube[LEFT][1][2] = cube[FRONT][2][1];
           cube[FRONT][2][1] = temp;
          
       }
       
       
       public void Fp(){
           //Rotate the front corner colors R
           char temp = cube[FRONT][0][2];
           cube[FRONT][0][2] = cube[FRONT][2][2];
           cube[FRONT][2][2] = cube[FRONT][0][2];
           cube[FRONT][0][2] = cube[FRONT][0][0];
           cube[FRONT][0][0] = temp;
           
           //rotate the front center colors R
           temp = cube[FRONT][2][1];
           cube[FRONT][2][1] = cube[FRONT][1][2];
           cube[FRONT][1][2] = cube[FRONT][2][1];
           cube[FRONT][2][1] = cube[FRONT][1][0];
           cube[FRONT][1][0] = temp;
           
           //rotate the outter top corner colors     R
           temp = cube[LEFT][2][2];
           cube[LEFT][2][2] = cube[DOWN][0][0];
           cube[DOWN][0][0] = cube[RIGHT][0][0];
           cube[RIGHT][0][0] = cube[TOP][0][0];
           cube[TOP][0][0] = temp;
           
           //rotate the otter side corner  R
           temp = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[DOWN][2][0];
           cube[DOWN][2][0] = cube[RIGHT][2][0];
           cube[RIGHT][2][0] = cube[TOP][2][0];
           cube[TOP][2][0] = temp;
           
           //rotate the outter edge colors  R
           temp = cube[LEFT][1][2];
           cube[LEFT][1][2] = cube[DOWN][1][0];
           cube[DOWN][1][0] = cube[RIGHT][1][0];
           cube[RIGHT][1][0] = cube[TOP][1][0];
           cube[TOP][1][0] = temp;
          
       }
       
       public void Dp(){
           //Rotate the front corner colors
           char temp = cube[DOWN][0][2];
           cube[DOWN][0][2] = cube[DOWN][2][2];
           cube[DOWN][2][2] = cube[DOWN][0][2];
           cube[DOWN][0][2] = cube[DOWN][0][0];
           cube[DOWN][0][0] = temp;
           
           //rotate the front center colors
           temp = cube[DOWN][2][1];
           cube[DOWN][2][1] = cube[DOWN][1][2];
           cube[DOWN][1][2] = cube[DOWN][1][0];
           cube[DOWN][1][0] = cube[DOWN][0][1];
           cube[DOWN][0][1] = temp;
           
           //rotate the outter top corner colors           
           temp = cube[FRONT][2][0];
           cube[FRONT][2][0] = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[BACK][2][0];
           cube[BACK][2][0] = cube[RIGHT][2][0];
           cube[RIGHT][2][0] = temp;
           
           //rotate the otter side corner
           temp = cube[FRONT][2][2];
           cube[FRONT][2][2] = cube[LEFT][2][2];
           cube[LEFT][2][2] = cube[BACK][2][2];
           cube[BACK][2][2] = cube[RIGHT][2][2];
           cube[RIGHT][2][2] = temp;
           
           //rotate the outter edge colors
           temp = cube[FRONT][2][1];
           cube[FRONT][2][1] = cube[LEFT][1][2];
           cube[LEFT][1][2] = cube[BACK][2][1];
           cube[BACK][2][1] = cube[RIGHT][2][1];
           cube[RIGHT][2][1] = temp;
          
       }
       
       public void Tp(){
           //Rotate the front corner colors     
           char temp = cube[TOP][0][2];
           cube[TOP][0][2] = cube[TOP][2][2];
           cube[TOP][2][2] = cube[TOP][0][2];
           cube[TOP][0][2] = cube[TOP][0][0];
           cube[TOP][0][0] = temp;
           
           //rotate the front center colors     
           temp = cube[TOP][2][1];
           cube[TOP][2][1] = cube[TOP][1][0];
           cube[TOP][1][0] = cube[TOP][0][1];
           cube[TOP][0][1] = cube[TOP][1][2];
           cube[TOP][1][2] = temp;
           
           //rotate the outter top corner colors        
           temp = cube[FRONT][0][2];
           cube[FRONT][0][2] = cube[RIGHT][0][2];
           cube[RIGHT][0][2] = cube[BACK][0][2];
           cube[BACK][0][2]  = cube[LEFT][0][2];
           cube[LEFT][0][2] = temp;
           
           //rotate the otter side corner    
           temp = cube[FRONT][0][0];
           cube[FRONT][0][0] = cube[RIGHT][0][0];
           cube[RIGHT][0][0] = cube[BACK][0][0];
           cube[BACK][0][0] = cube[LEFT][2][0];
           cube[LEFT][2][0] = temp;
           
           //rotate the outter edge colors
           temp = cube[FRONT][0][1];
           cube[FRONT][0][1] = cube[RIGHT][0][1];
           cube[RIGHT][0][1] = cube[BACK][0][1];
           cube[BACK][0][1] = cube[LEFT][1][0];
           cube[LEFT][1][0] = temp;
          
       }
       
       public void Bp(){
           //Rotate the front corner colors
           char temp = cube[BACK][2][0];
           cube[BACK][2][0] = cube[BACK][2][2];
           cube[BACK][2][2] = cube[BACK][0][2];
           cube[BACK][0][2] = cube[BACK][0][0];
           cube[BACK][0][0] = temp;
           
           //rotate the front center colors
           temp = cube[BACK][1][0];
           cube[BACK][1][0] = cube[BACK][2][1];
           cube[BACK][2][1] = cube[BACK][1][2];
           cube[BACK][1][2] = cube[BACK][0][1];
           cube[BACK][0][1] = temp;
           
           //rotate the outter top corner colors
           temp = cube[RIGHT][2][2];
           cube[RIGHT][2][2] = cube[DOWN][2][2];
           cube[DOWN][2][2] = cube[LEFT][0][0];
           cube[LEFT][0][0] = cube[TOP][2][2];
           cube[TOP][2][2] = temp;
           
           //rotate the otter side corner       
           temp = cube[RIGHT][0][2];
           cube[RIGHT][0][2] = cube[DOWN][0][2];
           cube[DOWN][0][2] = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[TOP][0][2];
           cube[TOP][0][2] = temp;
           
           //rotate the outter edge colors
           temp = cube[RIGHT][1][2];
           cube[RIGHT][1][2] = cube[DOWN][1][2];
           cube[DOWN][1][2] = cube[LEFT][0][1];
           cube[LEFT][0][1] = cube[TOP][1][2];
           cube[TOP][1][2] = temp;
          
       }
       
       public void Lp(){
           //Rotate the front corner colors
           char temp = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[LEFT][2][2];
           cube[LEFT][2][2] = cube[LEFT][0][2];
           cube[LEFT][0][2] = cube[LEFT][0][0];
           cube[LEFT][0][0] = temp;
           
           //rotate the front center colors
           temp = cube[LEFT][2][1];
           cube[LEFT][2][1] = cube[LEFT][1][0];
           cube[LEFT][1][0] = cube[LEFT][0][1];
           cube[LEFT][0][1] = cube[LEFT][1][2];
           cube[LEFT][1][2] = temp;
           
           //rotate the outter top corner colors
           temp = cube[BACK][2][2];
           cube[BACK][2][2] = cube[DOWN][2][0];
           cube[DOWN][2][0] = cube[FRONT][0][0];
           cube[FRONT][0][0] = cube[TOP][0][2];
           cube[TOP][0][2] = temp;
           
           //rotate the otter side corner
           temp = cube[TOP][0][0];
           cube[TOP][0][0] = cube[BACK][0][2];
           cube[BACK][0][2] = cube[DOWN][2][2];
           cube[DOWN][2][2] = cube[FRONT][2][0];
           cube[FRONT][2][0] = temp;
           
           //rotate the outter edge colors
           temp = cube[BACK][0][1];
           cube[BACK][0][1] = cube[DOWN][2][1];
           cube[DOWN][2][1] = cube[FRONT][1][0];
           cube[FRONT][1][0] = cube[TOP][0][1];
           cube[TOP][0][1] = temp;
          
       }
       
       public void Rp(){
           //Rotate the front corner colors
           char temp = cube[RIGHT][0][2];
           cube[RIGHT][0][2] = cube[RIGHT][2][2];
           cube[RIGHT][2][2] = cube[RIGHT][0][2];
           cube[RIGHT][0][2] = cube[RIGHT][0][0];
           cube[RIGHT][0][0] = temp;
           
           //rotate the front center colors
           temp = cube[RIGHT][2][1];
           cube[RIGHT][2][1] = cube[RIGHT][1][0];
           cube[RIGHT][1][0] = cube[RIGHT][0][1];
           cube[RIGHT][0][1] = cube[RIGHT][1][2];
           cube[RIGHT][1][2] = temp;
           
           //rotate the outter top corner colors
           temp = cube[BACK][0][0];
           cube[BACK][0][0]  = cube[DOWN][0][2];
           cube[DOWN][0][2] = cube[FRONT][2][2];
           cube[FRONT][2][2] = cube[TOP][0][2];
           cube[TOP][0][2] = temp;
           
           //rotate the otter side corner
           temp = cube[TOP][2][2];
           cube[TOP][2][2] = cube[BACK][0][2];
           cube[BACK][0][2] = cube[DOWN][0][0];
           cube[DOWN][0][0] = cube[FRONT][0][2];
           cube[FRONT][0][2] = temp;
           
           //rotate the outter edge colors
           temp = cube[BACK][0][1];
           cube[BACK][0][1] = cube[DOWN][0][1];
           cube[DOWN][0][1] = cube[FRONT][1][2];
           cube[FRONT][1][2] = cube[TOP][2][1];
           cube[TOP][2][1] = temp;
          
       }
        
}
