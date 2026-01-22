import java.util.ArrayList;

public class Re{
    public static void main(String[] args) {
        String re="[AA|BAAB]+";
        String text="AABAABBBA";
        // read posts.txt
        // Step 1 file Operator obj

        ArrayList<String> posts = FileOperator.getStringList("C:\Users\pjsmo\github-classroom\BCTSCS\data-analysis-polsmo26\posts.txt");
        System.out.println(posts);
        for (String post : posts){
            String
        }
        boolean result = text.matches(re);
        System.out.println(result);
    }
}