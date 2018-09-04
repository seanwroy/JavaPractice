public class Bubble_Sort {
  public static void main(String[] arg) {

    // Declaring and initializing an example array
    int[] list = new int[5];
    list[0] = 15;
    list[1] = 4;
    list[2] = 65;
    list[3] = 3;
    list[4] = 45;
    int temp;  // Temporary variable
      
    displayArrayOrder(list, "Original");
    
    // Bubble Sort Algorithm using a while loop and a for-loop
    // Descending order (largest to smallest)
    boolean flag = true; 

    while(flag){
      flag = false;   
      for(int j=0; j<list.length-1; j++){ 
        if(list[j]<list[j+1]){   
          temp = list[j];  
          list[j] = list[j+1];
          list[j+1] = temp;
          flag = true;  
        } 
      } 
    }  
    
    displayArrayOrder(list, "Final");
  }
  
  private static void displayArrayOrder(int[] array, String order){
    System.out.println(order + " array order:");
    for(int i=0; i<array.length; i++)
      System.out.println("list[" + i + "] = " + array[i]);
    System.out.println("\n");
  }
}
