import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        data.UserRepository userRepository0 = null;
        business.RegistrationService registrationService1 = new business.RegistrationService(userRepository0);
        java.lang.Class<?> wildcardClass2 = registrationService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        data.UserRepository userRepository0 = null;
        business.RegistrationService registrationService1 = new business.RegistrationService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = registrationService1.registerUser("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Username cannot be null or empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        data.UserRepository userRepository0 = new data.UserRepository();
        business.RegistrationService registrationService1 = new business.RegistrationService(userRepository0);
        userRepository0.saveUser("", "hi!");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        data.UserRepository userRepository0 = new data.UserRepository();
        business.RegistrationService registrationService1 = new business.RegistrationService(userRepository0);
        boolean boolean4 = userRepository0.validatePassword("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        data.UserRepository userRepository0 = new data.UserRepository();
        business.RegistrationService registrationService1 = new business.RegistrationService(userRepository0);
        presentation.RegistrationUI registrationUI2 = new presentation.RegistrationUI(registrationService1);
// flaky "1) test6(RegressionTest0)":         registrationUI2.startRegistration();
    }
}
