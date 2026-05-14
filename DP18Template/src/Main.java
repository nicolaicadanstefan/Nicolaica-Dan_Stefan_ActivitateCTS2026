package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Test JUnit ===");
        TemplateTestare junit = new TestareJUnit();
        junit.testeaza();

        System.out.println("\n=== Test NUnit ===");
        TemplateTestare nunit = new TestareNUnit();
        nunit.testeaza();
    }
}