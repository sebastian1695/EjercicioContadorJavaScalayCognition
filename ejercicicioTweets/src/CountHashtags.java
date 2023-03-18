import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CountHashtags  {
    public static void main(String[] args) {

                List<String> tweets = new ArrayList<>();
                tweets.add("#Java and #Scala are the languages");
                tweets.add("#Scala is functional language");
                tweets.add("#Java is non functional language");
                tweets.add("#Java is oop language");
                tweets.add("#Java is the best language");
                tweets.add("IBM are building an integrated platform with work with #Java #Scala and #cognitive");

                Map<String, Long> hashtagMap = new HashMap<>();
                Pattern pattern = Pattern.compile("#(Java|Scala|cognitive)");

                for (String tweet : tweets) {
                    Matcher matcher = pattern.matcher(tweet);
                    while (matcher.find()) {
                        String hashtag = matcher.group();
                        hashtagMap.put(hashtag, hashtagMap.getOrDefault(hashtag, 0L) + 1);
                    }
                }

                System.out.println("Total #Java: " + hashtagMap.getOrDefault("#Java", 0L));
                System.out.println("Total #Scala: " + hashtagMap.getOrDefault("#Scala", 0L));
                System.out.println("Total #cognitive: " + hashtagMap.getOrDefault("#cognitive", 0L));
            }
        }
