import java.util.*;
public class Complete_Mini_Project_using_arrays_strings_functions {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Complete_Mini_Project_using_arrays_strings_functions ob=new Complete_Mini_Project_using_arrays_strings_functions();
        System.out.println("This is a word guessing game");
        int score=0;
        int play=1;
        //String
        String word_list[]={"Geyser","Calculator","Pillow","Classroom","Kangaroo","Camera","Glasses","Dinosaur","Mango","Graphic","Charger","Hairstyle","Football","Mat","Keyboard","Laptop","Mouse","Bedsheet","Television","Table","Exam","Pencil","Biology","Chemical","Vampire","Apple","Bookshelf","Cap","Destroy","Eagle","Fetch","Joker"};
        while(play==1){
            String org_word=ob.getanyword(word_list);
            char c[]=org_word.toCharArray();  //Array
            int attempt=0;
            String guess="";
            int k=0;
            while(!org_word.equalsIgnoreCase(guess)){
                attempt++;
                System.out.println("Enter your guess");
                guess=in.nextLine();
                if(org_word.equalsIgnoreCase(guess)){
                    if(attempt==1){
                        System.out.println("Wow !! You guessed the word in first try !!");
                        score+=100;
                        System.out.println("Score : "+score);
                    }
                    else{
                        System.out.println("Congrats on guessing the word !! It took you only "+attempt+" attempts ");
                        score+=100-(attempt-1)*10;
                        System.out.println("Score : "+score);
                    }
                }
                else{
                    if((k+1)<org_word.length()){
                        System.out.println("Oops !! You guessed it wrong !!");
                        System.out.println("Hint : "+(k+1)+"th letter is = "+c[k]);
                        k++;
                    }
                    else{
                        System.out.println("Oops !! You lost , the word was "+org_word);
                        System.out.println("Score : "+score);
                        break;
                    }
                }
            }
            if(score>1000){
                System.out.println("Congratulation on getting a 1000 score !! ^_^ ");
            }
            System.out.println("Enter 1 to play again or any other number to quit");
            play=in.nextInt();
            in.nextLine();
            if(play!=1){
                System.out.println("Thank You for playing !! Final Score : "+score);
            }
        } 
    }
    //Function
    String getanyword(String a[]){
        Random r =new Random();
        int i=r.nextInt(0,31);
        return a[i];
    }
}
