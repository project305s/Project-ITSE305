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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        PresentationForgotPass presentationForgotPass0 = new PresentationForgotPass();
// flaky "1) test0005(RegressionTest0)":         presentationForgotPass0.startPasswordReset();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        PresentationForgotPass presentationForgotPass0 = new PresentationForgotPass();
        java.lang.Class<?> wildcardClass1 = presentationForgotPass0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass3 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.Class<?> wildcardClass1 = businessForgotPass0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass6 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        java.lang.Class<?> wildcardClass1 = dataForgotPass0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass6 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass5 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass5 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass7 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.Class<?> wildcardClass8 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass6 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass5 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        java.lang.Class<?> wildcardClass13 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass17 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("", "");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.Class<?> wildcardClass18 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.Class<?> wildcardClass6 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        java.lang.Class<?> wildcardClass13 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass18 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.Class<?> wildcardClass18 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass17 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass8 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass21 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass8 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password cannot be empty." + "'", str8, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str14 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password cannot be empty." + "'", str14, "Password cannot be empty.");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email cannot be empty." + "'", str9, "Email cannot be empty.");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.Class<?> wildcardClass18 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str24 = businessForgotPass0.resetPassword("", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass3 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email cannot be empty." + "'", str9, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass8 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email cannot be empty." + "'", str23, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str10 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.Class<?> wildcardClass4 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str12 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str20 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password cannot be empty." + "'", str10, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass13 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass3 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str25 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email cannot be empty." + "'", str18, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email cannot be empty." + "'", str20, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Password cannot be empty." + "'", str25, "Password cannot be empty.");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass15 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str28 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str31 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Email address not found." + "'", str28, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Email address not found." + "'", str31, "Email address not found.");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        java.lang.Class<?> wildcardClass15 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        java.lang.Class<?> wildcardClass13 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email cannot be empty." + "'", str14, "Email cannot be empty.");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass13 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass8 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        java.lang.Class<?> wildcardClass11 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str20 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str27 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str29 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Password cannot be empty." + "'", str24, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Email cannot be empty." + "'", str29, "Email cannot be empty.");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dataForgotPass0.generateResetToken("Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str20 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password cannot be empty." + "'", str20, "Password cannot be empty.");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password cannot be empty." + "'", str13, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("", "Email address not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dataForgotPass0.generateResetToken("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}
