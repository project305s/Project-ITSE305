import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("Email address not found.", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Password cannot be empty." + "'", str25, "Password cannot be empty.");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "");
        java.lang.String str22 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str25 = businessForgotPass0.resetPassword("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Password cannot be empty." + "'", str25, "Password cannot be empty.");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str10 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.String str26 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        java.lang.String str31 = businessForgotPass0.requestPasswordReset("");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Email cannot be empty." + "'", str31, "Email cannot be empty.");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email cannot be empty." + "'", str22, "Email cannot be empty.");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        boolean boolean22 = dataForgotPass0.validateEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dataForgotPass0.generateResetToken("Email address not found.");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str22 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str25 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
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
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str21 = businessForgotPass0.resetPassword("", "hi!");
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        java.lang.Class<?> wildcardClass24 = businessForgotPass0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        boolean boolean22 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean24 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean26 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str24 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "");
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        // The following exception was thrown during execution in test generation
        try {
            dataForgotPass0.updatePassword("Password cannot be empty.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email address.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email cannot be empty." + "'", str18, "Email cannot be empty.");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.String str27 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str29 = businessForgotPass0.requestPasswordReset("Email address not found.");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Email address not found." + "'", str29, "Email address not found.");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
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
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("");
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email cannot be empty." + "'", str16, "Email cannot be empty.");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str22 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email cannot be empty." + "'", str25, "Email cannot be empty.");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
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
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email cannot be empty." + "'", str19, "Email cannot be empty.");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        java.lang.Class<?> wildcardClass9 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email cannot be empty." + "'", str16, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.lang.String str30 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Email address not found." + "'", str30, "Email address not found.");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str24 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        java.lang.String str31 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email cannot be empty." + "'", str14, "Email cannot be empty.");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("Email address not found.");
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        java.lang.String str24 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass15 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str24 = businessForgotPass0.resetPassword("Email address not found.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Password cannot be empty." + "'", str24, "Password cannot be empty.");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str22 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str24 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email cannot be empty." + "'", str24, "Email cannot be empty.");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "");
        java.lang.String str22 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass10 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str9 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password cannot be empty." + "'", str6, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str22 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str25 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.String str27 = businessForgotPass0.resetPassword("hi!", "hi!");
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
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.String str25 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str28 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str30 = businessForgotPass0.requestPasswordReset("hi!");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Email address not found." + "'", str25, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Email address not found." + "'", str28, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Email address not found." + "'", str30, "Email address not found.");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        boolean boolean22 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean24 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean26 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass12 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.String str27 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str22 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email cannot be empty." + "'", str16, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        boolean boolean20 = dataForgotPass0.validateEmail("");
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email cannot be empty." + "'", str9, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str17 = businessForgotPass0.resetPassword("", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password cannot be empty." + "'", str10, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.lang.String str26 = businessForgotPass0.resetPassword("", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str20 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        java.lang.String str28 = businessForgotPass0.requestPasswordReset("Email address not found.");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Email address not found." + "'", str28, "Email address not found.");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password cannot be empty." + "'", str14, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.String str24 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.String str26 = businessForgotPass0.requestPasswordReset("Email address not found.");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        boolean boolean20 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean22 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.resetPassword("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str26 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
            java.lang.String str18 = dataForgotPass0.generateResetToken("Email address not found.");
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass11 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password cannot be empty." + "'", str8, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        boolean boolean22 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean24 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean26 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email cannot be empty." + "'", str21, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email cannot be empty." + "'", str23, "Email cannot be empty.");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.Class<?> wildcardClass19 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.lang.String str27 = businessForgotPass0.requestPasswordReset("hi!");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Email address not found." + "'", str27, "Email address not found.");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email cannot be empty.");
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password cannot be empty." + "'", str20, "Password cannot be empty.");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str11 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str14 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str20 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.Class<?> wildcardClass21 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.Class<?> wildcardClass22 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        java.lang.Class<?> wildcardClass7 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email address not found.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password cannot be empty." + "'", str14, "Password cannot be empty.");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email cannot be empty." + "'", str14, "Email cannot be empty.");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        boolean boolean22 = dataForgotPass0.validateEmail("hi!");
        boolean boolean24 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
            java.lang.String str22 = dataForgotPass0.generateResetToken("");
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.Class<?> wildcardClass18 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email address not found.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dataForgotPass0.generateResetToken("Email address not found.");
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str17 = businessForgotPass0.resetPassword("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password cannot be empty." + "'", str14, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str9 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str12 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        java.lang.String str32 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Email address not found." + "'", str32, "Email address not found.");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str6 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str12 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Email address not found." + "'", str3, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "");
        java.lang.String str24 = businessForgotPass0.requestPasswordReset("Email address not found.");
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str23 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
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
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str9 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email address not found.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password cannot be empty." + "'", str22, "Password cannot be empty.");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        boolean boolean22 = dataForgotPass0.validateEmail("");
        boolean boolean24 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        java.lang.String str26 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password cannot be empty." + "'", str21, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Password cannot be empty." + "'", str24, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("hi!");
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
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        java.lang.String str26 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str28 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str31 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email cannot be empty." + "'", str23, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Email cannot be empty." + "'", str28, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Email address not found." + "'", str31, "Email address not found.");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Password cannot be empty." + "'", str16, "Password cannot be empty.");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str22 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password cannot be empty." + "'", str17, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("");
        java.lang.Class<?> wildcardClass14 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email cannot be empty." + "'", str13, "Email cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.lang.String str29 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str32 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password cannot be empty." + "'", str32, "Password cannot be empty.");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str14 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str22 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str18 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str22 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str25 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str8 = businessForgotPass0.resetPassword("", "hi!");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str22 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.Class<?> wildcardClass23 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email cannot be empty." + "'", str10, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Email address not found." + "'", str19, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Email address not found." + "'", str22, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "Email cannot be empty.");
        java.lang.Class<?> wildcardClass16 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.resetPassword("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email cannot be empty." + "'", str11, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password cannot be empty." + "'", str14, "Password cannot be empty.");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("", "");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password cannot be empty." + "'", str13, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str15 = businessForgotPass0.resetPassword("Password cannot be empty.", "hi!");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email cannot be empty." + "'", str17, "Email cannot be empty.");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str20 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str23 = businessForgotPass0.resetPassword("Email address not found.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password cannot be empty." + "'", str23, "Password cannot be empty.");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean14 = dataForgotPass0.validateEmail("");
        boolean boolean16 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email cannot be empty." + "'", str7, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email cannot be empty." + "'", str12, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email cannot be empty." + "'", str14, "Email cannot be empty.");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
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
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str7 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str14 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Email address not found." + "'", str7, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email cannot be empty." + "'", str9, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("hi!");
        boolean boolean8 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
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
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Password cannot be empty.", "");
        java.lang.Class<?> wildcardClass9 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password cannot be empty." + "'", str8, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("hi!");
        boolean boolean4 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        boolean boolean18 = dataForgotPass0.validateEmail("Email address not found.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email cannot be empty." + "'", str15, "Email cannot be empty.");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str6 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str8 = businessForgotPass0.requestPasswordReset("");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email cannot be empty." + "'", str8, "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.lang.String str26 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str29 = businessForgotPass0.resetPassword("Email cannot be empty.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Password cannot be empty." + "'", str26, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Email address not found." + "'", str29, "Email address not found.");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str20 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str23 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password cannot be empty." + "'", str20, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        boolean boolean22 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str12 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str15 = businessForgotPass0.resetPassword("Email cannot be empty.", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str21 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str24 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.String str27 = businessForgotPass0.resetPassword("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password cannot be empty." + "'", str9, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password cannot be empty." + "'", str12, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password cannot be empty." + "'", str15, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password cannot be empty." + "'", str18, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Password cannot be empty." + "'", str24, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Password cannot be empty." + "'", str27, "Password cannot be empty.");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean12 = dataForgotPass0.validateEmail("Email address not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str7 = businessForgotPass0.resetPassword("", "");
        java.lang.String str10 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str14 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password cannot be empty." + "'", str7, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Email address not found." + "'", str14, "Email address not found.");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("hi!");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str5 = businessForgotPass0.resetPassword("", "");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Email address not found.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Password cannot be empty." + "'", str5, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str20 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        java.lang.String str23 = businessForgotPass0.resetPassword("hi!", "Email cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Email address not found." + "'", str23, "Email address not found.");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("Email address not found.", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email cannot be empty.");
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("hi!");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean16 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean6 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean10 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        boolean boolean14 = dataForgotPass0.validateEmail("hi!");
        boolean boolean16 = dataForgotPass0.validateEmail("hi!");
        boolean boolean18 = dataForgotPass0.validateEmail("Password cannot be empty.");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean4 = dataForgotPass0.validateEmail("");
        boolean boolean6 = dataForgotPass0.validateEmail("Email cannot be empty.");
        boolean boolean8 = dataForgotPass0.validateEmail("Email address not found.");
        boolean boolean10 = dataForgotPass0.validateEmail("Password cannot be empty.");
        boolean boolean12 = dataForgotPass0.validateEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("hi!", "hi!");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Password cannot be empty.");
        java.lang.String str19 = businessForgotPass0.resetPassword("hi!", "");
        java.lang.Class<?> wildcardClass20 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        java.lang.String str26 = businessForgotPass0.requestPasswordReset("Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Email address not found." + "'", str18, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Email address not found." + "'", str24, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Email address not found." + "'", str26, "Email address not found.");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        DataForgotPass dataForgotPass0 = new DataForgotPass();
        boolean boolean2 = dataForgotPass0.validateEmail("");
        boolean boolean4 = dataForgotPass0.validateEmail("hi!");
        java.lang.Class<?> wildcardClass5 = dataForgotPass0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str7 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.resetPassword("Email address not found.", "hi!");
        java.lang.String str12 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str15 = businessForgotPass0.resetPassword("", "");
        java.lang.String str18 = businessForgotPass0.resetPassword("Email address not found.", "Email cannot be empty.");
        java.lang.String str21 = businessForgotPass0.resetPassword("", "Email address not found.");
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str2 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str4 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str6 = businessForgotPass0.requestPasswordReset("Email cannot be empty.");
        java.lang.String str9 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str12 = businessForgotPass0.resetPassword("", "Email address not found.");
        java.lang.Class<?> wildcardClass13 = businessForgotPass0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Email address not found." + "'", str2, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Email address not found." + "'", str4, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Email address not found." + "'", str6, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Email address not found." + "'", str9, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Email address not found." + "'", str12, "Email address not found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str11 = businessForgotPass0.resetPassword("Email cannot be empty.", "Password cannot be empty.");
        java.lang.String str13 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str15 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str17 = businessForgotPass0.requestPasswordReset("Email address not found.");
        java.lang.String str20 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Email address not found." + "'", str11, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Email address not found." + "'", str15, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Email address not found." + "'", str17, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Email address not found." + "'", str20, "Email address not found.");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        BusinessForgotPass businessForgotPass0 = new BusinessForgotPass();
        java.lang.String str3 = businessForgotPass0.resetPassword("Email address not found.", "");
        java.lang.String str5 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str8 = businessForgotPass0.resetPassword("hi!", "Password cannot be empty.");
        java.lang.String str10 = businessForgotPass0.requestPasswordReset("hi!");
        java.lang.String str13 = businessForgotPass0.resetPassword("Email address not found.", "Email address not found.");
        java.lang.String str16 = businessForgotPass0.resetPassword("Password cannot be empty.", "Email address not found.");
        java.lang.String str19 = businessForgotPass0.resetPassword("", "");
        java.lang.String str21 = businessForgotPass0.requestPasswordReset("Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password cannot be empty." + "'", str3, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Email address not found." + "'", str5, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Email address not found." + "'", str8, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Email address not found." + "'", str10, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Email address not found." + "'", str13, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Email address not found." + "'", str16, "Email address not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password cannot be empty." + "'", str19, "Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Email address not found." + "'", str21, "Email address not found.");
    }
}

