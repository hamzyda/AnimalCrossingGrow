package animalCrossingGrow;

import java.util.Random;

public class player {
    Random random = new Random();
//    public static String successOrNot = "";
    public int MissionNum = 0;
    public String mission = "";
    public String missionAnswer = "";

     public void eat() {
         this.MissionNum = this.random.nextInt(4);

         if (this.MissionNum == 0) 
             this.mission = "chef of today is me";
         else if (this.MissionNum == 1) 
             this.mission = "Help yourself";
         else if (this.MissionNum == 2)
             this.mission = "Yummy";
         else if (this.MissionNum == 3)
             this.mission = "delicious food";
     }

     public void play() {
         this.MissionNum = this.random.nextInt(4);

         if (this.MissionNum == 0) 
             this.mission = "league of legends";
         else if (this.MissionNum == 1) 
             this.mission = "maplestory";
         else if (this.MissionNum == 2)
             this.mission = "singing";
         else if (this.MissionNum == 3)
             this.mission = "dancing";
     }

     public void shower() {
         this.mission = "shampoo";
     }

     public void sleep() {
         this.MissionNum = this.random.nextInt(2);

         if (this.MissionNum == 0) 
             this.mission = "Goodnight, baby";
         else if (this.MissionNum == 1) 
             this.mission = "Sweet dreams";
     }
}