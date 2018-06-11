public class DeckOfCards{
   
     public static void main(String []args){
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
         for (String suit : suits){
             for (String rank : ranks){
                System.out.println(rank +" "+suit);
             }
         }
     }
}