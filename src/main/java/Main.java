public class Main {
    public static void main(String[] args) {

        String test1 = "(asda+dfasf)()";
        String test2 = ")(asda+dfasf)";
        String test3 = "(((asda+dfasf))";
        String test4 = "((asda+dfasf)))";
        String test5 = "(asda+dfasf)(fsdf-afdsa)";
        String test6 = "(((asda+dfasf)))";

        BracketChecker bk = new BracketChecker();

        System.out.println(test1 + " " + bk.test(test1));
        System.out.println(test2 + " " + bk.test(test2));
        System.out.println(test3 + " " + bk.test(test3));
        System.out.println(test4 + " " + bk.test(test4));
        System.out.println(test5 + " " + bk.test(test5));
        System.out.println(test6 + " " + bk.test(test6));
    }
}