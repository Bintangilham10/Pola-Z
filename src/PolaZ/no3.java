/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class no3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        //rumus Perulangan for//
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                
                //rumus percabangan if//
                if (i == 0 || i == 5 - 1 || j == 5 - 1 - i)
                {
                    
                    //menampilkan output hasil//
                    System.out.print("@ ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
          
    }
    
}

