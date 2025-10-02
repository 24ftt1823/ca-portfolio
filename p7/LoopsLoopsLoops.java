public class LoopsLoopsLoops {
    
    public static void main(String[] args) {

        int num = 1;
        int doNum = 50;
        char charLoop;
        
        
        System.out.println("Below is generated using while loop: ");
        while (num <= 20) {
            System.out.print(num + " ");
            num++;   
        }

        System.out.println("\n");

        System.out.println("Below is generated using dowhile loop: ");
       do {
        System.out.print(doNum + " ");
         doNum--;
       } while (doNum >= 35);
     
       System.out.println("\n");
    
        System.out.println("Below is generated using for loop ");
        for (charLoop = 'a'; charLoop <= 'z'; charLoop++) {
             System.out.print(charLoop + " ");
        }
      
    }
    
}
    


