public class Selection_Sort {
  
  public static void main(String[] arg) {

    // Declare and initialize the array
    // Test values
    int[] list = new int[5];
    list[0] = 15;
    list[1] = 4;
    list[2] = 65;
    list[3] = 3;
    list[4] = 45;
     
    displayArrayOrder(list, "Original");
    
    // Selection Sort Algorithm using for loops
    // Decending order (largest to smallest number)
    int curMin, temp;  
    for (int i = list.length-1; i>0; i--){
      curMin = 0; 
      for(int j = 1; j <= i; j ++){   
        if( list[j] < list[curMin] )         
          curMin = j;
      }
      temp = list[curMin];  
      list[curMin] = list[i];
      list[i] = temp; 
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
