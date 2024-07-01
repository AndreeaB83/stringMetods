public class StringBuilderExamples {
    public static void main(String[] args) {

        String text = "Ana are mere";
        String result = "";

        System.out.println(result += "Ana");
        System.out.println(result += " are");
        System.out.println(result);

        result += "mere";
        System.out.println(result);
        result += " are ";
        System.out.println(result);
        result += "Ana";

        StringBuilder result2 = new StringBuilder();
        result2.append("Ana");
        System.out.println(result2);
        result2.append("mere");
        System.out.println(result2);
       result2.insert(3," are ");
        System.out.println(result2);





    }
}
