
import java.util.ArrayList;
import java.util.HashMap;

public class certificateissued {

    public static boolean verification(ArrayList<String> rc, HashMap<String, String> ic, HashMap<String, String> lc) 
    {

        // ic = [("in.com", "abc.com"), ("be.com", "la.in"), ("la.in", "re.in")]
        // lc = [("a.in", "in.com"), ("b.in", "na.in"), ("b.in", "b.in")]
        // inputs: subject, issuer 
        // output: true/ false - whether valid or yes
        // eg:-
        //  input: "a.in", "in.com"
        //  output : true
        String input = "a.in";

        if (!lc.containsKey(input)) {

            return false;

        }

        String certificateReciever = lc.get(input); //be.com

        String certificateIssuer = ic.get(certificateReciever); //la.in.com

        while (ic.containsKey(certificateReciever) && !certificateReciever.equals(certificateIssuer)) {

            if (rc.contains(certificateIssuer)) {
                return true;
            }

            certificateReciever = certificateIssuer;
            certificateIssuer = ic.get(certificateReciever);

        }

        return false;
    }

    public static void main(String[] args) 
    {
        ArrayList<String> rc = new ArrayList<String>();
        rc.add("abc.com");
        rc.add("le.com");
        rc.add("re.in");
        HashMap<String, String> ic = new HashMap<>();
        ic.put("in.com", "in.com");
        ic.put("be.com", "la.in.com");
        ic.put("la.in.com", "la.com");
        ic.put("la.com", "le.com");

        HashMap<String, String> lc = new HashMap<>();
        lc.put("a.in", "in.com");
        // lc.put("b.in", "na.in");
        lc.put("b.in", "in.com");

        boolean res = verification(rc, ic, lc);
        System.out.println(res);

    }

}