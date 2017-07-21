package gen;
import java.util.Scanner;
public class arrayrep {

	public static void main(String[] args) {
		 int [] numbers = new int [5];
		    Scanner inn = new Scanner(System.in);
		    boolean b = true;
		    int temp = 0;
		    int numbers=0;

		    void sjekk(){
		        System.out.println("Write five numbers");
		        for(int i = 0; i < numbers.length; i++){
		        numbers [i] = inn.nextInt();
		    }

		    System.out.print("\nNumbers that are repeated: ");
		    for(int i = 0; i < numbers.length; i++){

		        if(!b){
		            System.out.print(temp + " ");
		        }

		        b = true;
		        temp = numbers[i];
		        for(int j = 0; j < numbers.length; j++){
		            if(i != j && temp == numbers[j] && numbers[j] != -2){
		                b = false;
		                numbers[j] = -2;
		            }
		        }
		    }


	}

}
