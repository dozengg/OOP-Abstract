package game;
import java.util.*;
  public class Task_Performance implements User_info,User_Story,User_Play  {
	 static Enemy enemy = new Enemy();
	 static stats damage = new stats();
	 static player play = new player();
	 static String name;
	 static String user_name;
	 static int user_mode;
	 static String plays;
	  static Scanner scn = new Scanner(System.in);
	 static TakenDamage taken = new TakenDamage();
	 static Task_Performance game = new Task_Performance();
	 
	 public void user_info( String user_name) {
		 this.user_name = user_name;
	 }
	 
	 public void user_story(int user_mode) {
		 this.user_mode = user_mode;
		 if (user_mode == 1) {
			 System.out.println("Story mode");
		 }else if(user_mode == 2) {
			 System.out.println("Survival mode");
		 }
	 }
	 public void user_play(String playy) {
		 this.plays = playy;
		 if(play.equals("P")) {
			 System.out.println("The game Started");
		 }
	 }
		
	 
	public static void main(String [] args) {
		
		
	Task_Performance game = new Task_Performance();
	game.user_play(plays);
	game.user_info(user_name);
	game.user_story(user_mode);
	
	System.out.print("Enter name: ");
	String name = scn.next();
	System.out.println("Press 1 or 2 to select your game mode");
	System.out.println("1 - Story Mode" );
	
	System.out.println("2 - Survival Mode ");
	int mode = scn.nextInt();
	System.out.println("Press P to start the game, " + name);
	String pl = scn.next();		
	
	
	survivalmode();
	
	}
	
	public static void storymode(){
		System.out.println("Welcome to StoryMode");
		System.out.println("Theres a found dead body on the street and the killer is one of your friends.");
		System.out.println("do you want to slove the Mystery?");
		System.out.println("Y for yes , N for no");
		String story = scn.next();
		if(story.equalsIgnoreCase("Y")) {
			System.out.println("Start solving the Crime");
		}else if(story.equalsIgnoreCase("N")) {
			System.out.println("Ignoring the crime");
		}
		
		
	}
	
	
	
	
	
	public static void player(int setHealth, int setDamage, int setSoul, int setSwordDamage) {
		play.setHealth(100);
		play.setDamage(5);
		play.setSoul(0);
		play.setSwordDamage(7);
		play.setCurrentHealth(100);
		
	}
	
	
	
	public static void skeleton(String setName, int setHealth, int setDamage) {
		enemy.setName("skeleton");
		enemy.setHealth(50);
		enemy.setDamage(10);
		enemy.setCurrentHealth(50);
		}
		
	public static void skeletonk(String setName, int setHealth, int setDamage) {
		enemy.setName("skeleton knight");
		enemy.setHealth(90);
		enemy.setDamage(30);
	}
	public static void goblin(String setName, int setHealth, int setDamage) {
		enemy.setName("goblin");
		enemy.setDamage(15);
		enemy.setHealth(60);
	}
	
	public static void gobling(String setName, int setHealth, int setDamage) {
		enemy.setName("goblin general");
		enemy.setHealth(100);
		enemy.setDamage(50);
	}
	
	
	public static void elves(String setName, int setHalth, int setDamage) {
		enemy.setName("elves");
		enemy.setHealth(70);
		enemy.setDamage(25);
	}
	public static void td (int setEnemydt, int setPlayerdt) {
				
	}
		
	public static void survivalmode() {
		System.out.println("Welcome to survival mode");
		System.out.println("");
		System.out.println("you get a free sword as a new player ");
		while(true) {
			Task_Performance.attackk();
		System.out.println("Enemy 1");
		player(play.getDamage(),play.getHealth(),play.getsoul(),play.getSwordDamage());
		System.out.println("Player name:" + name);
		System.out.println("Player damage:" + play.getDamage());
		System.out.println("sword damage:" + play.getSwordDamage());
		System.out.println("player health:" + play.getHealth());
		System.out.println("Player soul:" + play.getsoul());
		System.out.println("=============================================");
		System.out.println("");
		System.out.println("==============================================");
		skeleton(enemy.getName(), enemy.getHealth(),enemy.getDamage());
		System.out.println("Enemy name:" + enemy.getName());
		System.out.println("Enemy Health:" + enemy.getHealth());
		System.out.println("Enemy Damage:" + enemy.getDamage());
		System.out.println("press 1 to normal attack press 2 to use sword press 3 to use to summon");
		System.out.println("1 - normal attack");
		System.out.println("2 - sword attack");
		System.out.println("3- summom");
		Task_Performance.attackk();
		Task_Performance.enemyattack();
		int attack = scn.nextInt();
		if(attack == 1) {
			System.out.println("your using normal attack"  );
			
		 System.out.println("enemy current health: "  + enemy.getHealth() );
		 System.out.println("================================");
		System.out.println("the enemy is attacking you");
		System.out.println("your current hp is: " +  play.getHealth()  );
		}else if (attack == 2) {
			System.out.println("your using sword" );
			System.out.println("enemy current health:"  + enemy.getHealth());
			System.out.println("================================");
			System.out.println("the enemy is attacking you");
			System.out.println("your current hp is: " +  play.getHealth()  );
		}else if(attack == 3) {
			System.out.println("summoning a skeleton");
			break;
		}
		}
	}
   public static void attackk() {
	   if(enemy.getHealth() > play.getDamage()) {
		   	enemy.setHealth(enemy.getHealth() - play.getDamage());
		}else {
			enemy.setHealth(0);
		}
		
   }
	public static void enemyattack() {
		if(enemy.getHealth() < play.getHealth()) {
			play.setHealth(play.getHealth() - enemy.getDamage());
		}else {
			play.setHealth(0);
		}
	}

	
	 		
	 
}
