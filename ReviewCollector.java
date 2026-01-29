import java.util.*;


public class ReviewCollector {
   private ArrayList<ProductReview> reviewList;
  private ArrayList<String> productList;


  public ReviewCollector(){
   reviewList=new ArrayList<>();
   productList = new ArrayList<>();
  }
  public void addReview(ProductReview prodReview){


  }  public int getNumGoodReviews(String prodName){
   return 0;
  }

  public void processSentiments(String filePath) {
        // Read lines from sentiments.txt
        ArrayList<String> lines = FileOperator.getStringList(filePath);

        // Regex pattern to match word,decimal pairs
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]+),(-?\\d+\\.\\d+)");


        // Process each line
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String word = matcher.group(1); // Extract the word
                Double value = Double.parseDouble(matcher.group(2)); // Extract the value

                // Add to instance variables
                words.add(word);
                values.add(value);

                // Print the result
                System.out.println(word + "   ----  " + value);
   
            }
        }
    }

  
}
