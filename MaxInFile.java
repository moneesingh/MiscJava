
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
/*
 * Create a file with n random numbers (preferably 10 million). 
 * Then find the highest 10 numbers. 
 */

public class MaxInFile {
   public static void main(String [] args)
   {
	  String filename = "random1.txt";
	  int count = 150; 
	  int n = 10;
      createFile(filename, count);
      int max[] = findMax10(filename, count, n);
      for (int i: max){
    	  System.out.println(i);
      }
   }
   
   /*
    * Generate a file 'filename' with 'count' number of random numbers.
    */
   private static void createFile(String filename, int count) {
	   PrintWriter out = null;
	   try {
	   	  out = new PrintWriter(new File(filename));
	      Random rand = new Random();
	      int number, counter=0;
	      while(counter!=count)
	      {
	        number=rand.nextInt(150)+1;
	        out.println(number);
	        counter++;
	      }
	      
	   } catch (FileNotFoundException fe) {
		   fe.printStackTrace();
	   } finally {
		   if (out != null)
			   out.close();
	   }
   }
   
   /*
    * Read file that has 'filesize' number of random numbers.
    * Find highest 'n' numbers in the file.
    */
   
   private static int [] findMax10(String filename, int filesize, int n) {
	   BufferedReader br = null;
		FileReader fr = null;
		Integer [] arr = new Integer[filesize];
		int count=0;
		try {
			fr = new FileReader(filename);

			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				arr[count++] = Integer.valueOf(line);
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		Arrays.sort(arr, Collections.reverseOrder());
		count =0;
		int [] maxVals = new int [n];
		for(int i=0; i<=n-1; i++) {
			maxVals[count++] = arr[i];
		}
		return maxVals;
   }
}