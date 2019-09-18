/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song;

/**
 *
 * @author mlarrubia
 */
public class Song {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String singer = "Elton John";
        String song = "Rocketman";
        
        System.out.println("+-------------------------------------------------+");
        System.out.println("| The following song is "+ song +" by "+singer+"   |");
        System.out.println("+-------------------------------------------------+");
                        //Verse 1
        System.out.print("She packed my bags last night,\n "
                       + "Pre-flight zero hour: 9:00 am \n"
                       + "And I'm gonna be high as a kite by then \n"
                       + "I miss the Earth so much, I miss my wife \n"
                       + "It's lonely out in space\n" 
                       +"On such a timeless flight");
        System.out.println("");
        chorus();
       
        System.out.println("");
        
                        //Verse 2
        System.out.print("Mars ain't the kind of place to raise your kids\n" 
                        +"In fact, it's cold as hell\n" 
                        +"And there's no one there to raise them if you did\n" 
                        +"And all this science I don't understand\n" 
                        +"It's just my job five days a week\n" 
                        +"A rocket man\n"  
                        +"A rocket man");
        System.out.println("");
        chorus();
        System.out.println("");
        
                        //Verse 3 also known as outro.
        System.out.print("And I think it's gonna be a long, long time \n"
                        +"And I think it's gonna be a long, long time \n"
                        +"And I think it's gonna be a long, long time \n"
                        +"And I think it's gonna be a long, long time \n"
                        +"And I think it's gonna be a long, long time \n"
                        +"And I think it's gonna be a long, long time \n"
                        +"And I think it's gonna be a long, long time \n"
                        +"And I think it's gonna be a long, long time \n"
                        +"And I think it's gonna be a long, long time");
        
            
    }
    
    public static void chorus(){
        System.out.println();
        System.out.print("And I think it's gonna be a long, long time"
                      +"'Til touchdown brings me 'round again to find\n" 
                      +"I'm not the man they think I am at home\n"
                      +"Oh no, no, no\n" 
                      +"I'm a rocket man\n" 
                      +"Rocket man, burning out his fuse up here alone \n"
                      + "And I think it's gonna be a long, long time\n"  
                      +"'Til touchdown brings me 'round again to find\n" 
                      +"I'm not the man they think I am at home\n" 
                      +"Oh no, no, no\n" 
                      +"I'm a rocket man\n" 
                      +"Rocket man, burning out his fuse up here alone");
        System.out.println("");
    }
    
}
