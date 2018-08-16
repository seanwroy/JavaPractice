package Lottery;

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
			boolean flag = true;
			int temp = 0;
			
			//While flag is true, assigns random Int to array index
			//but if the number is a repeat, breaks from for-loop
			while(flag) {
				temp = (int)(Math.random() * 49 + 1);
				for(int y = 0; y <= i; y++) {
					if(array[y] == temp) {
						break;
					}
				}
				flag = false;
			}
			array[i] = temp;
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

