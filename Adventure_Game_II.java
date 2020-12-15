/** 
 * To give the user the option of whether to use the Fibonacci Sequence or to use Pascal's Triangle. 
 *
 * @author (Rienzi) 
 * @version (December 9) 
 */
import java.util.Scanner;

public class Adventure_Game_II
{    
    static void gameOver() 
    {
        //intro
        System.out.println("Game Over. Welp, great job! You dun-goofed. PLEASE CHOOSE AN ACTUAL ");
        System.out.println("OPTION NEXT TIME!!!");
    }
    static void end() 
    {
        //end
        System.out.println(" ");
        System.out.println("Game Over.");
        System.out.println("Do you want to play again?");
        System.out.println("Type yes or no.");
        System.out.print("Your choice was:  ");
    }
    static void erase() 
    {
        //erase
        System.out.println('\u000C');
    }
    static void intro()
    {
        //intro
        System.out.println("You come from a small farm village in the eastern region ");
        System.out.println("of the Land of Oof. You have just come of age to decide ");
        System.out.println("whether you want to stay or to leave. The village leader");
        System.out.println("confonts you and asks if you want to go or to stay. You'd");
        System.out.println("say yes without hesitation, but you feel bounded to this place ");
        System.out.println("because this is where you grew up, and you have to care for ");
        System.out.println("your grandfather. Please choose option (1) to stay or (2) to leave. ");
    }
    static void end1()
    {
        //end1
        System.out.println("Congratulations! You have reached The End!");
    }
    public static void main(String[] args)    
    {       
      erase();
      // Instantiate the input from the user.
      Scanner inputScanner = new Scanner(System.in);
      Scanner user_input = new Scanner(System.in);
      //int's
      int A1 = 1;
      int A2 = 2;
      int A3 = 3;
      int decision;
      int decision2;
      int decision3;
      int decision4;
      int decision5;
      String name;
      String playAgain = "yes";
      System.out.print("Please type in your name: ");
      name = user_input.next();
     
       do
      {
        System.out.println(" ");
        System.out.println("Hello " + name + ".");
        intro(); 
        decision = inputScanner.nextInt();
        if (decision == 1)
        {           
          System.out.println("You have chosen option 1.");
          System.out.println( name + " has decided to stay within the village. Your grandfather");
          System.out.println("is pleased with your decision. Oh no! The Village is under");
          System.out.println("attack by goblins! They've reached your grandfather's");
          System.out.println("house. There's a sword right besides you and a huge stick on the");
          System.out.println("ground. Please choose either (1) to grab a stick to fight");
          System.out.println("or (2) to grab a sword. ");
          decision2 = inputScanner.nextInt();
          if  (decision2 == 1)
          {
           System.out.println("You grab the stick and run towards the growing crowd of goblins.");
           System.out.println("Courageously you smack a goblin across the head with the stick,");
           System.out.println("but it breaks. The goblin then smashes you and you don't get up.");
           System.out.println( name + " has died.");
          }
          else if (decision2 == 2)
          {
           System.out.println("You grab the sword and run towards the crowd of goblins. You raise");
           System.out.println("your arm and slash at the largest goblin. It falls. The remaining");
           System.out.println("goblins see this and in fear they retreat back into the southern woods.");
           System.out.println("You look at your grandpa and he smiles. That night the Village throws");
           System.out.println("a party in celebration of you saving everyone. Rejoice! " + name + " has");
           System.out.println("saved us! To your surprise, your grandfather comes up to you and");
           System.out.println("tells you that he believes that you are ready. That you are");
           System.out.println("ready to go out into the world and discover new things. You smile at");
           System.out.println("this, and the next morning you set off. Where would you like to go?");
           System.out.println("Choose (1) to head for the capital of the kingdom or (2) to hunt down");
           System.out.println("the goblins that attacked your village.");
           decision3 = inputScanner.nextInt();
            if  (decision3 == 1)
           {
            System.out.println("You're well on your way to the capital now. On your adventure you see");
            System.out.println("countless extravagant views of vibrant forests and wonderful mountains.");
            System.out.println("It's been three days and you've been running low on food. You come across");
            System.out.println("a town, would you like to (1) stay for a night and rest? Or (2)");
            System.out.println("skip the town and keep going towards the capital?");
            decision4 = inputScanner.nextInt();
             if  (decision4 == 1)
            {
             System.out.println("You walk into the town and go towards the inn. You eat a bit and then");
             System.out.println("at last you go to a room. The next morning you decide to check out");
             System.out.println("what's in the town, and while strolling by, a sword in the window catches");
             System.out.println("your eye. You walk in and find the dark encrypted sword and buy it from");
             System.out.println("the store clerk for 99 silver. You're now broke. Now as you continue to");
             System.out.println("make your way towards the capital, you come across the same goblins that");
             System.out.println("attacked your village. Do you want to (1) attack them or (2) sneak around");
             System.out.println("them?");
             decision5 = inputScanner.nextInt();
              if  (decision5 == 1)
             {
             System.out.println("You sprint full speed at them with a sword in each hand. You caught them");
             System.out.println("off guard and was able to destroy all of them. Unexpectedly they dropped");
             System.out.println("a bunch of money, enough so that it replenishes all that you spent. You ");
             System.out.println("continue on with your journey to the capital. When you reach the gates,");
             System.out.println("your greeted with an unexpected surprise. \"" + name + " is that you?\"");
             System.out.println("As you look ahead, you see your father, whom you thought was eaten");
             System.out.println("by goblins a long time ago, and he greets you with the fattest hug ever."); 
             System.out.println("Appearantly he's the the King's right hand man. You are given a tour of");
             System.out.println("the capital and your father offers you a position in the palace. You refuse");
             System.out.println("so that you can continue to explore the various parts of the Land of Oof.");
             System.out.println("Although you have refused the offer, you are still entitled to come back");
             System.out.println("and visit whenever you want.");
             end1();
             }
              else if (decision5 == 2)
             {
              System.out.println("You decided to put your cloak on and try to sneak past the crowd of goblins.");
              System.out.println("They hear you step on the leaves and turn their heads. They smell your presence.");
              System.out.println("Because they know your there they surround you. You fend off for as long as you");
              System.out.println("can but they overwhelm you. One catches you off guard and knocks you to the");
              System.out.println("ground. You feel paralyzed and can't get up. They eat you.");
              System.out.println( name + " has died.");
             }
              else  // Unrecognized input
             {
               gameOver();
             }
            }
             else if (decision4 == 2)
            {
             System.out.println("You decide to skip town and you eventually reach a forest. The village is");
             System.out.println("quite far away now so you can't turn back. While walking through the narrow");
             System.out.println("pathway you hear goblins. They jump at you! But you can't do anything due to");
             System.out.println("your exhaustion. Your knocked out, and eaten.");
             System.out.println( name + " has died.");
            }
             else  // Unrecognized input
            {
             gameOver();
           }
           }
            else if (decision3 == 2)
           {
            System.out.println("You've chosen to hunt down the very goblins that decided to attack your");
            System.out.println("village. You head down south through tough cliffs and wide open plains.");
            System.out.println("For 3 days you've traveled, and your exhausted. There's an inn nearby,");
            System.out.println("Do you want to either (1) go rest and restock or (2) skip the inn");
            decision4 = inputScanner.nextInt();
            if  (decision4 == 1)
             {
             System.out.println("You reach the inn, eat, restock, and head up to your room to rest for");
             System.out.println("the night. As your eating breakfast the next morning you see a guy with");
             System.out.println("a really nice sword and ask if he was willing to sell it since your");
             System.out.println("current sword looks like it's about to break. He says yes and you were");
             System.out.println("able to bargain the ellegant light encrypted sword for 90 silver. After ");
             System.out.println("eating, you venture off into the deepest parts of the forest. You reach a");
             System.out.println("large cave entrance that looks like it runs deep. You go in deeper, and you");
             System.out.println("reach another opening. Where shall you go? (1) right? Or (2) left?");
             decision5 = inputScanner.nextInt();
              if (decision5 == 1)
             {
               System.out.println("You went right. Haha coincidentally, right was the right way. You");
               System.out.println("reach the end of the tunnel, where you find all of the goblins ");
               System.out.println("celebrating in all of their riches. You catch them by surprise, and");
               System.out.println("by using both your old sword and your new one, you slaughter all of");
               System.out.println("them. You defeat the enemies and bring them into extinction. You now");
               System.out.println("return with all of the riches that the goblins were celebrating with.");
               System.out.println("The village uses the money to both save up as emergency funds, and ");
               System.out.println("to upgrade self-defences. The village and the kingdom is now safe from");
               System.out.println("any and all goblins, and you live happily ever after.");
               end1();
             }
              else if (decision5 == 2)
             {
               System.out.println("You went left. Turns out that was a bad idea because it was a trap made");
               System.out.println("so that the goblins could catch food more easily. You were hit with a");
               System.out.println("paralyzing arrow, and an alarm mechanism notifys the goblins of your");
               System.out.println("presence. As you are stuck there not being able to move, the goblins");
               System.out.println("start to come towards you. You're helpless now, and have been eaten.");
               System.out.println("Like many others, you have fallen victim to the gory of the goblins");
               System.out.println( name + " has died.");
             }
              else  // Unrecognized input
             {
              gameOver();
             }
             }
              else if (decision4 == 2)
             {
               System.out.println("You skip the inn, and due to refusing to rest and restock. You collapse");
               System.out.println("of exhaustion. Congratulations! You were so exhausted that the goblins");
               System.out.println("found you lying there in the open plains, and eat you.");
               System.out.println( name + " has died.");
             }
              else  // Unrecognized input
             {
                gameOver();
             }
           }
            else  // Unrecognized input
           {
             gameOver();
           }
          }
           else  // Unrecognized input
          {
            gameOver();
          }
        }
        else if (decision == 2) 
        {
          System.out.println("You have chosen option 2.");
          System.out.println( name + " has decided to leave. Screw being restrained from");
          System.out.println("adventure and the rest of the world. Oh wait...The Village");
          System.out.println("is under attack by goblins! They have reached your grandfathers");
          System.out.println("house. Please choose either (1) to leave anyways or (2) to go back.");
          System.out.println("and save the Village.");
          decision2 = inputScanner.nextInt();
          if (decision2 == 1)
          {
            System.out.println("You are a terrible person. Due to this you get struck with an unlucky");
            System.out.println("streak of bad luck. It was so bad that while walking away you head into");
            System.out.println("a forest. You rest here for a few hours, and that's when you realize that");
            System.out.println("the goblins are coming back. They see you and as you try to hide it's too");
            System.out.println("late. They've already picked up your scent. They find you behind a tree.");
            System.out.println("They eat you.");
            System.out.println( name + " has died.");
          }
          else if (decision2 == 2)
          {
            System.out.println("You go back for the village. As you get there everything's in chaos.");
            System.out.println("Buildings are destroyed, people are missing, and everything's somehow on");
            System.out.println("fire. Will you (1) go to your grandpa's house first or (2) help out the");
            System.out.println("survivors get to safety.");
            decision3 = inputScanner.nextInt();
            switch (decision3)
            {
              case 1:
              System.out.println("As you reach your grandpa's house you watch as a goblin attacks him.");
              System.out.println("You try to reach him...but you were too late. You're put in shock. And due");
              System.out.println("to this, you are left vulnerable. A goblin approaches you from behind.");
              System.out.println("It eats you");
              System.out.println( name + " has died.");
              break;
            
              case 2: 
              System.out.println("You help out as many people as you can. But still you can't help but");
              System.out.println("worry about your grandfather's well-being. As you search for surviviors you");
              System.out.println("come across a sword. You grab it just in case. Off in the distance you see");
              System.out.println("your grandpa. You run towards him and notice that a goblin's approaching");
              System.out.println("him. You run faster. And out of anger and desperation you slash the goblin");
              System.out.println("as hard as you can, scaring the other goblins away. The village survives.");
              System.out.println("Though winning, you are tramautized and no longer want to leave home.");
              System.out.println("You stay in the village and continue to protect it by driving all of");
              System.out.println("the goblins away.");
              end1();
              break; 
            
              case 3: // Unrecognized input
              gameOver();
              break;
            }
          }
           else  // Unrecognized input
          {
            gameOver();
          }
        }  
         else  // Unrecognized input
        {
          gameOver();
        }
        end();
        playAgain = inputScanner.next();
      }
      while (playAgain.equals("yes") || playAgain.equals("Yes"));
  }
}
