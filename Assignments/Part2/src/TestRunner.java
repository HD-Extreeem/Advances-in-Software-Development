import org.junit.runner.JUnitCore;

public class TestRunner {

    public static void main(String[] args) {

        org.junit.runner.Result result = JUnitCore.runClasses(TestSuite.class);

        System.out.println(result.wasSuccessful());

    }

}
