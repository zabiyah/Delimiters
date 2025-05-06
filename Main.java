import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        String[] tokens={"(","x+y",")","*5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));
        String open = "<sup>";
        String close = "</sup>";
        d = new Delimiters(open, close);
        ArrayList<String> delimiters = new ArrayList<>();
        String[] delims = {open,open,close,open,close,close};
        for(String s :delims) delimiters.add(s);
        System.out.println(d.isBalanced(delimiters));
        Delimiters p = new Delimiters(open, close);
        ArrayList<String> delimiter = new ArrayList<>();
        String[] delis = {open,close,close,open};
        for(String s :delis) delimiter.add(s);
        System.out.println(d.isBalanced(delimiter));
        Delimiters q = new Delimiters(open, close);
        ArrayList<String> delimite = new ArrayList<>();
        String[] deli = {close};
        for(String s :deli) delimite.add(s);
        System.out.println(d.isBalanced(delimite));
        Delimiters a = new Delimiters(open, close);
        ArrayList<String> delimie = new ArrayList<>();
        String[] del = {open,open,close};
        for(String s :del) delimie.add(s);
        System.out.println(d.isBalanced(delimie));
        
    }
}