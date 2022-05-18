package examples.medium;
import java.util.Map;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl/
 */
public class ProblemNumber535 {
    Map<String, String> map = new HashMap();
    String host = "http://tinyurl.com/";

    public String encode(String longUrl) {
        String shortUrl = getShortUtl();
        while(map.containsKey(shortUrl)) {
            shortUrl = getShortUtl();
        }
        map.put(shortUrl, longUrl);
        return host+shortUrl;
    }

    public String decode(String shortUrl) {
        String key = shortUrl.replace(host,"");
        return map.get(key);
    }

    private String getShortUtl()
    {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(6);

        for (int i = 0; i < 6; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int)(AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

}
