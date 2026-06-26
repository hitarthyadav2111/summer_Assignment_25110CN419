import java.util.*;
public class Quiz_Application {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Which level do you want to attempt");
        System.out.println("1.Easy");
        System.out.println("2.Medium");
        System.out.println("3.Hard");
        System.out.println("Enter your choice");
        int choice=in.nextInt();
        int score=0;
        switch(choice){
            case 1:
                System.out.println("Enter either 1,2,3 or 4");
                System.out.println("Q1.Which planet is located closest to the Sun in our solar system?");
                System.out.println("1.Earth");
                System.out.println("2.Mercury");
                System.out.println("3.Mars");
                System.out.println("4.Venus");
                int ans=in.nextInt();
                if(ans==2){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q2.Who was the first president of the united states?");
                System.out.println("1.George Washington");
                System.out.println("2.Thomas Jefferson");
                System.out.println("3.John Adams");
                System.out.println("4.Abraham Lincoln");
                ans=in.nextInt();
                if(ans==1){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q3.Which continent is the largest by land area?");
                System.out.println("1.Asia");
                System.out.println("2.Africa");
                System.out.println("3.Europe");
                System.out.println("4.North America");
                ans=in.nextInt();
                if(ans==1){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q4.What primary gas do humans breathe in from the atmosphere to survive?");
                System.out.println("1.Carbon Dioxide");
                System.out.println("2.Nitrogen");
                System.out.println("3.Hydrogen");
                System.out.println("4.Oxygen");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q5.In which modern day country can you find the great the Great Pyramid of Giza?");
                System.out.println("1.Greece");
                System.out.println("2.Mexico");
                System.out.println("3.Egypt");
                System.out.println("4.Italy");
                ans=in.nextInt();
                if(ans==3){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q6.What is the capital city of France?");
                System.out.println("1.Paris");
                System.out.println("2.Rome");
                System.out.println("3.London");
                System.out.println("4.Berlin");
                ans=in.nextInt();
                if(ans==1){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q7.At what temperatue does pure water freeze at sea level on the Celsius Scale?");
                System.out.println("1.100 C");
                System.out.println("2.32 C");
                System.out.println("3.-10 C");
                System.out.println("4.0 C");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q8.Which famous passenger ship sank in 1912 after hitting an iceberg?");
                System.out.println("1.Mayflower");
                System.out.println("2.Santa Maria");
                System.out.println("3.Lusitania");
                System.out.println("4.Titanic");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q9.Which of the following is the largest ocean on Earth?");
                System.out.println("1.Arctic Ocean");
                System.out.println("2.Atlantic Ocean");
                System.out.println("3.Indian Ocean");
                System.out.println("4.Pacific Ocean");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q10.Which part of the plant is primarily responsible for conducting photosynthesis?");
                System.out.println("1.Stem");
                System.out.println("2.Flower");
                System.out.println("3.Leaf");
                System.out.println("4.Root");
                ans=in.nextInt();
                if(ans==3){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                    }
                    System.out.println("Your Score is : "+score+"/10");
                    if(score==10){
                        System.out.println("Excellent!! You aced the easy quiz.Try the medium level next time.");
                }
                break;
            case 2:
                System.out.println("Enter either 1,2,3 or 4");
                System.out.println("Q1.Which empire's capital city,Constantinople,fell to the Ottoman Turks in 1453,marking the end of the Middle Ages?");
                System.out.println("1.The Holy Roman Empire");
                System.out.println("2.The Persian Empire");
                System.out.println("3.The Byzantine Empire");
                System.out.println("4.The Mongol Empire");
                ans=in.nextInt();
                if(ans==3){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q2.In Physics ,what is the primary distinction between speed and velocity?");
                System.out.println("1.Velocity is always a constant value ");
                System.out.println("2.Speed measures the rate of acceleration  ");
                System.out.println("3. Speed is measured in metric units only");
                System.out.println("4. Velocity includes a direction component");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q3.Which country currently holds the record for the most time zones within its sovereign territory?");
                System.out.println("1.France");
                System.out.println("2.United States");
                System.out.println("3.Russia");
                System.out.println("4.China");
                ans=in.nextInt();
                if(ans==1){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q4.What was the primary objective of the Berlin Conference of 1884-1885?");
                System.out.println("1.To form a military alliance against the Ottoman Empire ");
                System.out.println("2.To establish the borders of post Napoleonic Europe");
                System.out.println("3.To negotiate the end of the Crimean War");
                System.out.println("4.To regulate European trade and colonization in Africa");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q5.Which chemical element accounts for approximately 73% of the Sun's total mass?");
                System.out.println("1.Carbon");
                System.out.println("2.Helium");
                System.out.println("3.Hydrogen");
                System.out.println("4.Oxygen");
                ans=in.nextInt();
                if(ans==3){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q6.The Strait of Gibraltar connects the Atlantic Ocean to which other major body of water?");
                System.out.println("1.The Caribbean Sea");
                System.out.println("2.The Black Sea");
                System.out.println("3.The Red Sea");
                System.out.println("4.The Mediterranean Sea");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q7.During the height of the Silk Road Trade ,which luxury good was most sought after by the roman empire from china?");
                System.out.println("1.Gunpowder Weapons");
                System.out.println("2.Silk Textiles");
                System.out.println("3.Spices like Black Pepper");
                System.out.println("4.Porcelain Pottery");
                ans=in.nextInt();
                if(ans==2){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q8.What is the primary biological purpose of the process known as meiosis?");
                System.out.println("1.To produce haploid gametes for reproduction");
                System.out.println("2.To replicate mitochondrial DNA for enrgy");
                System.out.println("3.To repair damaged skin and bone tissues");
                System.out.println("4.To synthesize proteins within the ribosomes");
                ans=in.nextInt();
                if(ans==1){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q9.At approxiately 430 meters below sea level,what is the the lowest land based elevation on Earth's surface?");
                System.out.println("1.Lake Baikal ");
                System.out.println("2.The Dead Sea Shore");
                System.out.println("3.The Captain Sea");
                System.out.println("4.Death Valley ");
                ans=in.nextInt();
                if(ans==2){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q10.Which radical polotical figure was the primary leader of the 'Reign od Terror' during the French Revoltuion?");
                System.out.println("1.King Louis XVI");
                System.out.println("2.Maximilien Robespierre");
                System.out.println("3.Napolean Bonaparte");
                System.out.println("4.Jean-Jacques Rousseau");
                ans=in.nextInt();
                if(ans==2){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                    }
                    System.out.println("Your Score is : "+score+"/10");
                    if(score==10){
                        System.out.println("Congratulations !! You aced the medium difficulty quiz.You should try the hard quiz next time.");
                    }
                break;
                case 3:
                    System.out.println("Enter either 1,2,3 or 4");
                System.out.println("Q1.Which 1494 treaty effectively divided the 'New World' between the territorial empires of Spain and Portugal?");
                System.out.println("1.Treaty of Alcacovas");
                System.out.println("2.Treaty of Tordesillas ");
                System.out.println("3.Treaty of Zaragoza");
                System.out.println("4.Treaty of Westphalia");
                ans=in.nextInt();
                if(ans==2){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q2.In stellar evolution, what is the specific value of the Chandrasekhar Limit,beyond which a white dwarf will collapse into a neutron star or black hole?");
                System.out.println("1. 0.50 solar masses");
                System.out.println("2. 1.44 solar masses");
                System.out.println("3. 3.00 solar masses");
                System.out.println("4. 2.10 solar masses");
                ans=in.nextInt();
                if(ans==2){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q3.Which of the following is the largest endorheic basin(a drainage sytem with no outflow to the ocean) in the world ");
                System.out.println("1.The Lake Chad Basin");
                System.out.println("2.The Great Basin");
                System.out.println("3.The Caspian Sea");
                System.out.println("4.The Aral Sea");
                ans=in.nextInt();
                if(ans==3){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q4.In 1962,Neil Barlett synthesized the first stable compound of a noble gas.Which element was used in this landmark experiment?");
                System.out.println("1.Radon");
                System.out.println("2.Krypton");
                System.out.println("3.Argon");
                System.out.println("4.Xenon");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q5.Which 19-th century conflict is often cited as the first 'total war' due to its use of the industrial-scale weaponry and mass civilian mobilisation?");
                System.out.println("1.The Napoleonic Wars");
                System.out.println("2.The France-Prussian Wat");
                System.out.println("3.The American Civil War");
                System.out.println("4.The Crimean Wat");
                ans=in.nextInt();
                if(ans==3){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q6.Due to Earth's equitorial bulg, which mountain's summit is technivally the furthest point from the Earth's center?");
                System.out.println("1.Mount Everest");
                System.out.println("2.Mount Kilimanjaro");
                System.out.println("3.Mauna Kea");
                System.out.println("4.Mount Chimborazo");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q7.What primary biological evidenvce supports the endosynbiotic theory regarding the origin od the mitochondria and chloroplasts?");
                System.out.println("1.They use 80S ribosomes");
                System.out.println("2.They possess circular DNA");
                System.out.println("3.They have cellulose walls");
                System.out.println("4.They lack a double membrane");
                ans=in.nextInt();
                if(ans==2){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q8.The 'Pax Mongolica' of the 13th and 14th centuries is historically significant primarily for facilitating which of the following which of the following?");
                System.out.println("1.Universal Religious Conversion");
                System.out.println("2.The Discovery of Gunpowder");
                System.out.println("3.Trans-Eurasian trade safety");
                System.out.println("4.The end of nomadic lifestyle");
                ans=in.nextInt();
                if(ans==3){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q9.Which unique territory on the border od egypt and sudan remains 'terra nullius'(unclaimed by any state) due to conflicting colonial-era maps?");
                System.out.println("1.Bir Tawil");
                System.out.println("2.The Caprivi Strip ");
                System.out.println("3.The Hala'ib Triangle");
                System.out.println("4.The Wakhan Corridor ");
                ans=in.nextInt();
                if(ans==1){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                System.out.println("Q10.According to the Standard Model of particle physics,which particle is rsponsible for giving other fundamental particles their mass?");
                System.out.println("1.The Gluon");
                System.out.println("2.The Photon");
                System.out.println("3.The Neutrino");
                System.out.println("4.The Higgs Boson");
                ans=in.nextInt();
                if(ans==4){
                    System.out.println("Correct Answer");
                    score++;
                }                
                else{
                    System.out.println("Incorrect Answer");
                }
                    System.out.println("Your Score is : "+score+"/10");
                    if(score==10){
                        System.out.println("Unbelievable !! You aced the hardest quiz . Congratulations!!");
                    }
                break;
            default:
                System.out.println("Invalid Input!! Choose from the given options only.");
        }
    }
}
