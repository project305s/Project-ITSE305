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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str27 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("", "hi!");
        boolean boolean18 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean21 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean25 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str22 = datalogin0.getUserRole("");
        java.lang.String str24 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("");
        java.lang.String str16 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass9 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str27 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("hi!");
        boolean boolean24 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        boolean boolean21 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass22 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
        java.lang.String str27 = buisnesslogin0.loginUser("", "");
        java.lang.String str30 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("", "");
        java.lang.String str22 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str24 = datalogin0.getUserRole("");
        java.lang.String str26 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        boolean boolean11 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str27 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean13 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("");
        boolean boolean21 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.String str18 = datalogin0.getUserRole("");
        java.lang.String str20 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass19 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        boolean boolean18 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str20 = datalogin0.getUserRole("hi!");
        boolean boolean23 = datalogin0.validateUser("", "hi!");
        boolean boolean26 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("");
        boolean boolean22 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = datalogin0.getUserRole("");
        boolean boolean27 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean30 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass24 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass19 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("", "hi!");
        boolean boolean26 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass28 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("");
        java.lang.String str23 = datalogin0.getUserRole("hi!");
        java.lang.String str25 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        boolean boolean22 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass23 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        boolean boolean19 = datalogin0.validateUser("", "");
        boolean boolean22 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean25 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str23 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        java.lang.String str20 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str24 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean27 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("");
        boolean boolean21 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean16 = datalogin0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass28 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        java.lang.String str5 = datalogin0.getUserRole("hi!");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str27 = buisnesslogin0.loginUser("", "");
        java.lang.String str30 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str33 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str36 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str39 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Invalid username or password. Please try again." + "'", str33, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Invalid username or password. Please try again." + "'", str36, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Invalid username or password. Please try again." + "'", str39, "Invalid username or password. Please try again.");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        java.lang.String str20 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        boolean boolean10 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean13 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass25 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean27 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        java.lang.String str14 = datalogin0.getUserRole("hi!");
        boolean boolean17 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str30 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass19 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass25 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("");
        java.lang.String str24 = datalogin0.getUserRole("");
        boolean boolean27 = datalogin0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("", "");
        boolean boolean22 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass22 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean23 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean26 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass21 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("");
        boolean boolean24 = datalogin0.validateUser("", "hi!");
        java.lang.String str26 = datalogin0.getUserRole("");
        java.lang.String str28 = datalogin0.getUserRole("hi!");
        java.lang.String str30 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass19 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str22 = datalogin0.getUserRole("hi!");
        boolean boolean25 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass26 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "");
        java.lang.String str21 = datalogin0.getUserRole("");
        java.lang.String str23 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str22 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str27 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("", "");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        boolean boolean22 = datalogin0.validateUser("", "");
        boolean boolean25 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        boolean boolean20 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean19 = datalogin0.validateUser("hi!", "");
        boolean boolean22 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("hi!");
        java.lang.String str23 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str25 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean28 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("hi!", "");
        java.lang.String str22 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str24 = datalogin0.getUserRole("");
        java.lang.String str26 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        boolean boolean21 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str9 = datalogin0.getUserRole("");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("");
        boolean boolean18 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str30 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str33 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str36 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Invalid username or password. Please try again." + "'", str33, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Invalid username or password. Please try again." + "'", str36, "Invalid username or password. Please try again.");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("");
        boolean boolean22 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("", "");
        boolean boolean18 = datalogin0.validateUser("hi!", "");
        boolean boolean21 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean24 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean27 = datalogin0.validateUser("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "");
        boolean boolean17 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str26 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str27 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        boolean boolean20 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass21 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        boolean boolean18 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass25 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass23 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass9 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass21 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean21 = datalogin0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("");
        boolean boolean18 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("");
        boolean boolean14 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("");
        boolean boolean24 = datalogin0.validateUser("", "hi!");
        java.lang.String str26 = datalogin0.getUserRole("");
        java.lang.String str28 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass29 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        java.lang.String str10 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str13 = datalogin0.getUserRole("");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("", "");
        boolean boolean23 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str25 = datalogin0.getUserRole("");
        java.lang.String str27 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean22 = datalogin0.validateUser("", "");
        boolean boolean25 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("");
        boolean boolean18 = datalogin0.validateUser("hi!", "");
        boolean boolean21 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "hi!");
        boolean boolean21 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str23 = datalogin0.getUserRole("");
        boolean boolean26 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("hi!");
        java.lang.String str23 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
        java.lang.String str27 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        boolean boolean20 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean25 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("", "hi!");
        java.lang.String str25 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str27 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str30 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str27 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        boolean boolean16 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.String str18 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("");
        java.lang.String str17 = datalogin0.getUserRole("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        boolean boolean16 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass25 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str30 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str20 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.String str18 = datalogin0.getUserRole("");
        boolean boolean21 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("hi!", "");
        boolean boolean14 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass22 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        java.lang.String str11 = datalogin0.getUserRole("");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str27 = buisnesslogin0.loginUser("", "");
        java.lang.String str30 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str33 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str36 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str39 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Invalid username or password. Please try again." + "'", str33, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Invalid username or password. Please try again." + "'", str36, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Invalid username or password. Please try again." + "'", str39, "Invalid username or password. Please try again.");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str30 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass22 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str11 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        boolean boolean13 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("", "");
        java.lang.String str22 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str24 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass25 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str13 = datalogin0.getUserRole("");
        boolean boolean16 = datalogin0.validateUser("", "");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean18 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        boolean boolean10 = datalogin0.validateUser("", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("");
        java.lang.String str14 = datalogin0.getUserRole("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
        java.lang.String str27 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str30 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str33 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str36 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid username or password. Please try again." + "'", str24, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid username or password. Please try again." + "'", str27, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid username or password. Please try again." + "'", str30, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Invalid username or password. Please try again." + "'", str33, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Invalid username or password. Please try again." + "'", str36, "Invalid username or password. Please try again.");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        java.lang.String str20 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str25 = datalogin0.getUserRole("");
        boolean boolean28 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str30 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
    }
}

