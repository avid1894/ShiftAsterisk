/*
 Shifting an * from left to right and then wrap it back to the left
 */
package shiftasterisk;

/**
 *
 * @author avid1894
 */
public class ShiftAsterisk {

    /**
     Considering an array of size 5
     */
    public static void main(String[] args) {
        
        char[] star = new char[5];
        for( int i=0; i<5; i++)
        {
            star[i]='*';
            if(i>0)
            { 
                star[i-1]=' ';
            }
            System.out.print("'*' is at position" + " " + i + ":" + " "+ star[i]);
            System.out.println();
            if(i==4)
            {
        
             star[0]='*'; 
             star[i]=' ';

            }    
        }
         System.out.println();
         System.out.println("After one shift through each position" );
            for( int j=0; j<5; j++)
        {
            if(star[j]=='*')
            {
                System.out.println("'*' is now at position :"+" "+j);
            }
            else
                //remaining content is nothing but spaces
            System.out.println("printing remaining content"+ star[j]+ "at " +j);
            //System.out.println();
        }
    
   
    }
}
