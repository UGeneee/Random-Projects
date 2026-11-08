package pkg07labexer2_ebb;

public class Main {

    public static void main(String[] args) {
        
        // Problem 1
        // String = Music Therapy
        // Output should be 6
        String musicTherapy = "Music Therapy";
        
        int therapy = musicTherapy.indexOf("T");
        
        System.out.println("(1) The letter T in the word Music Therapy is index: " + therapy); // 6
        /*-----------------------------*/
        
        // Problem 2
        // String = Oro Plata Mata
        // Output should be -1
        String oroPlataMata = "Oro Plata Mata";
        
        int plataMata = oroPlataMata.indexOf("B");
        
        System.out.println("(2) The letter B is: " + plataMata); 
        // The output is -1 because letter B does not exists in the String provided.
        /*-----------------------------*/
        
        // Problem 3
        // Strings = Out, Inside (2 strings)
        // Output should be: Inside Out, OutInside
        
        String str1 = "Out";
        String str2 = "Inside "; // add space for so it will be Inside_Out
        
        System.out.println("(3) first output: " + str2.concat(str1)); // Inside Out
        System.out.println("(3) second output: " + str1.concat(str2)); // OutInside
        /*-----------------------------*/
        
        // Problem 4
        // Strings = Programming, Coding, Writing (3 strings)
        // Output should be: -13, 7, -20
        
        String prog = "Programming";
        String code = "Coding";
        String write = "Writing";
        
        int compareProg = code.compareTo(prog);
        int compareCode = write.compareTo(prog);
        int compareWrite = code.compareTo(write);
        
        System.out.println("(4) Use of compareTo: " + compareProg + ", " + compareCode + ", " + compareWrite);
        
    }
    
}
