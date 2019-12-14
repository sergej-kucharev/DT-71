package task3.textio;

public class MyParser {
    public static String parceName(String str)
    {
        int pos = str.indexOf("=");
        String name = (String)str.subSequence(pos + 1, str.length());
        return name;
    }
    public static Double parceSalary(String str)
    {
        int pos = str.indexOf("=");
        String salaryString = (String)str.subSequence(pos + 1, str.length());
        Double salary = Double.parseDouble(salaryString);
        return salary;
    }
    public static Integer parceID(String str)
    {
        int pos = str.indexOf("=");
        String idString = (String)str.subSequence(pos + 1, str.length());
        Integer id = Integer.parseInt(idString);
        return id;
    }
}
