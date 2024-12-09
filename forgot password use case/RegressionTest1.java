import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "Email address not found.");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass17 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str24 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        boolean boolean18 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass19 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass15 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email cannot be empty." + "'", str9, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass21 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.String str27 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.Class<?> wildcardClass25 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str27 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email cannot be empty." + "'", str14, "Email cannot be empty.");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass18 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
            dataForgotPass0.updatePassword("hi!", "Email address not found.");
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.Class<?> wildcardClass17 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str25 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass17 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password cannot be empty." + "'", str13, "Password cannot be empty.");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass15 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        java.lang.String str30 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Email address not found." + "'", str30, "Email address not found.");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str20 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass17 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("");
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str14 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass15 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email cannot be empty." + "'", str9, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
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
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str26 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Password cannot be empty." + "'", str25, "Password cannot be empty.");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str20 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass21 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str9 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password cannot be empty." + "'", str6, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass21 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email cannot be empty." + "'", str20, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str27 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email cannot be empty." + "'", str25, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str21 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email cannot be empty." + "'", str18, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("hi!");
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
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str26 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str28 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Email address not found." + "'", str28, "Email address not found.");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        boolean boolean20 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass18 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Password cannot be empty." + "'", str11, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str11 = businessForgotPass0.resetPassword("", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password cannot be empty." + "'", str8, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("Password cannot be empty.");
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
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Password cannot be empty." + "'", str16, "Password cannot be empty.");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str12 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass3 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email cannot be empty." + "'", str2, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("Password cannot be empty.");
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
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass15 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email cannot be empty." + "'", str16, "Email cannot be empty.");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass7 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str21 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Password cannot be empty." + "'", str16, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        boolean boolean20 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email cannot be empty.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass5 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("");
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
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str26 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str29 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Email address not found." + "'", str29, "Email address not found.");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        java.lang.Class<?> wildcardClass25 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Password cannot be empty." + "'", str24, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email cannot be empty." + "'", str2, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("");
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
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass5 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str27 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass17 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass8 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str28 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        java.lang.String str31 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Email address not found." + "'", str28, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Email address not found." + "'", str31, "Email address not found.");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email cannot be empty." + "'", str9, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean20 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dataForgotPass0.generateResetToken("Password cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("hi!", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str16 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str24 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass25 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email cannot be empty." + "'", str24, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("");
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str20 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str22 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass8 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "Email cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.lang.String str24 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str26 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str29 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password cannot be empty." + "'", str29, "Password cannot be empty.");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str28 = businessForgotPass0.resetPassword("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Email address not found." + "'", str28, "Email address not found.");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("Password cannot be empty.");
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
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        boolean boolean18 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str28 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str30 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Email address not found." + "'", str28, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Email cannot be empty." + "'", str30, "Email cannot be empty.");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Email address not found.", "Password cannot be empty.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "");
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("");
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str16 = businessForgotPass0.resetPassword("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Password cannot be empty." + "'", str16, "Password cannot be empty.");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email cannot be empty." + "'", str18, "Email cannot be empty.");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str26 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str24 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email cannot be empty.");
        java.lang.String str27 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str24 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Password cannot be empty." + "'", str24, "Password cannot be empty.");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        boolean boolean18 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dataForgotPass0.generateResetToken("Password cannot be empty.");
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.lang.String str26 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass27 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("hi!");
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
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass26 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email cannot be empty." + "'", str23, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.lang.Class<?> wildcardClass21 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email cannot be empty." + "'", str18, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email cannot be empty." + "'", str20, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        java.lang.String str27 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str30 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Password cannot be empty." + "'", str30, "Password cannot be empty.");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email cannot be empty." + "'", str14, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email cannot be empty." + "'", str16, "Email cannot be empty.");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str12 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str20 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.Class<?> wildcardClass21 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password cannot be empty." + "'", str20, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str24 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        boolean boolean18 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dataForgotPass0.generateResetToken("");
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str20 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean18 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dataForgotPass0.generateResetToken("");
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str26 = businessForgotPass0.resetPassword("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Password cannot be empty." + "'", str26, "Password cannot be empty.");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str21 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email cannot be empty." + "'", str16, "Email cannot be empty.");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str24 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str27 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean18 = dataForgotPass0.validateEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str25 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("");
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
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email cannot be empty." + "'", str9, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("hi!");
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
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean18 = dataForgotPass0.validateEmail("");
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        boolean boolean18 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dataForgotPass0.generateResetToken("Email address not found.");
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str25 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email cannot be empty." + "'", str18, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str27 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str29 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str31 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email cannot be empty." + "'", str25, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Email address not found." + "'", str29, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Email address not found." + "'", str31, "Email address not found.");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass25 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("");
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
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("Email cannot be empty.");
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
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
            dataForgotPass0.updatePassword("hi!", "Email address not found.");
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Password cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email cannot be empty." + "'", str23, "Email cannot be empty.");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        boolean boolean18 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean20 = dataForgotPass0.validateEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dataForgotPass0.generateResetToken("Email address not found.");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str20 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email cannot be empty." + "'", str22, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str20 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        boolean boolean20 = dataForgotPass0.validateEmail("hi!");
        boolean boolean22 = dataForgotPass0.validateEmail("Password cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str24 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass15 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email cannot be empty." + "'", str14, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean20 = dataForgotPass0.validateEmail("Email cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        java.lang.String str26 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str29 = businessForgotPass0.resetPassword("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password cannot be empty." + "'", str29, "Password cannot be empty.");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("Email address not found.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Password cannot be empty." + "'", str11, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password cannot be empty." + "'", str14, "Password cannot be empty.");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("Email cannot be empty.");
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
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str10 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("");
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
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass18 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str28 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str31 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Password cannot be empty." + "'", str28, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Email address not found." + "'", str31, "Email address not found.");
    }
}

