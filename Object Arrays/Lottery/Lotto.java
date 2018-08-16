package Exercise7;

public class Lotto {
	private int[] numbers;
	
	public Lotto() {
		
	}
	
	public Lotto(int[] numbers) {
		this.numbers = numbers;
	}
	
	
	//Constructor that will randomly generate 
	//numbers from 1-49 in the array
	public void setNumbers(){
		//Array for each line
		int[] array = new int[6];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 49 + 1);	
		}
		this.numbers = array;
	}
	
	public int[] getNumbers() {
        return numbers;
    }
	
	
	//toString method that prints out numbers in one array
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
           if (i > 0) {
              sb.append(", ");
           }
           sb.append(numbers[i]);
        }
        return sb.toString();
    }
    
}

