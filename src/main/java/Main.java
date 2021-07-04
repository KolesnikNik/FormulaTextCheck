
public class Main {
    public static void main(String[] args) {

        String test1 = "(asda+dfasf)()";
        String test2 = ")(asda+dfasf)";
        String test3 = "(((asda+dfasf))";
        String test4 = "((asda+dfasf)))";
        String test5 = "(asda+dfasf)(fsdf-afdsa)";
        String test6 = "(((asda+dfasf)))";


        System.out.println(test1 + " " + BracketChecker.test(test1));
        System.out.println(test2 + " " + BracketChecker.test(test2));
        System.out.println(test3 + " " + BracketChecker.test(test3));
        System.out.println(test4 + " " + BracketChecker.test(test4));
        System.out.println(test5 + " " + BracketChecker.test(test5));
        System.out.println(test6 + " " + BracketChecker.test(test6));
    }
}