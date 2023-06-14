import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
	Random rand = new Random();
	
	System.out.println("Rolling dice...");
	int num;
	int sum = 0;
	for(int i=0; i < 2; i++){
	    num = rand.nextInt(6) + 1;
	    sum += num;
	    System.out.println("Die " + i + ": " + num);
	}
	System.out.println("Total value: " + sum);
    }
}
