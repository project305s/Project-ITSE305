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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        presentationlogin presentationlogin0 = new presentationlogin();
// flaky "1) test001(RegressionTest0)":         presentationlogin0.startLogin();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        presentationlogin presentationlogin0 = new presentationlogin();
        java.lang.Class<?> wildcardClass1 = presentationlogin0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        datalogin datalogin0 = new datalogin();
        java.lang.Class<?> wildcardClass1 = datalogin0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass7 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass10 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass7 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass6 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass3 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass7 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass6 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.Class<?> wildcardClass1 = buisnesslogin0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass5 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass7 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass4 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass6 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass10 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass7 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass8 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass7 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass10 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass9 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("");
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        java.lang.String str6 = datalogin0.getUserRole("hi!");
        boolean boolean9 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean23 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean16 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass21 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass8 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass10 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        boolean boolean7 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass10 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        boolean boolean9 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass7 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str22 = datalogin0.getUserRole("");
        boolean boolean25 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.String str19 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        boolean boolean22 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass7 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str22 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass23 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        boolean boolean7 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean13 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass9 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        boolean boolean7 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("");
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean21 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "");
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
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
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
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("", "");
        boolean boolean20 = datalogin0.validateUser("", "");
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        java.lang.String str10 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str12 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
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
        java.lang.String str26 = datalogin0.getUserRole("");
        java.lang.String str28 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str8 = datalogin0.getUserRole("hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        java.lang.String str18 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass10 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass22 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str22 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean25 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
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
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("");
        boolean boolean24 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass22 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        java.lang.String str10 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        boolean boolean16 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("", "");
        java.lang.String str21 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("", "");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean22 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        boolean boolean27 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass9 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("hi!", "");
        boolean boolean23 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "");
        boolean boolean18 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
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
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        java.lang.String str18 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass19 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass8 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        java.lang.String str6 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass7 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
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
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
        java.lang.Class<?> wildcardClass24 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "hi!");
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        java.lang.String str10 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean13 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        boolean boolean10 = datalogin0.validateUser("", "hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("", "");
        java.lang.String str17 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass25 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        boolean boolean16 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        boolean boolean22 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        java.lang.String str9 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        java.lang.String str21 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str22 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean25 = datalogin0.validateUser("", "hi!");
        boolean boolean28 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean18 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass13 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "hi!");
        java.lang.String str20 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
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
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "");
        boolean boolean22 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        java.lang.String str6 = datalogin0.getUserRole("hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass10 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        boolean boolean10 = datalogin0.validateUser("", "hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("", "");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("hi!", "");
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
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("", "");
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str22 = datalogin0.getUserRole("hi!");
        boolean boolean25 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean28 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean31 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass32 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        java.lang.String str11 = datalogin0.getUserRole("");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
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
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        java.lang.String str18 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean21 = datalogin0.validateUser("hi!", "hi!");
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
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        boolean boolean29 = datalogin0.validateUser("", "");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass8 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("hi!");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean23 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("hi!");
        boolean boolean24 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("", "");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        java.lang.String str20 = datalogin0.getUserRole("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
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
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        java.lang.String str6 = datalogin0.getUserRole("");
        boolean boolean9 = datalogin0.validateUser("", "");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass8 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("hi!", "");
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
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        java.lang.String str20 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass21 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass8 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("");
        boolean boolean18 = datalogin0.validateUser("", "hi!");
        java.lang.String str20 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        java.lang.String str20 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str6 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass4 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
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
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        boolean boolean7 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean13 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("", "");
        boolean boolean27 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean30 = datalogin0.validateUser("hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        java.lang.String str18 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
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
        java.lang.String str26 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass27 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
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
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        boolean boolean16 = datalogin0.validateUser("hi!", "");
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("", "");
        boolean boolean27 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
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
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
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
        java.lang.String str26 = datalogin0.getUserRole("");
        boolean boolean29 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        boolean boolean10 = datalogin0.validateUser("", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("");
        boolean boolean15 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass9 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "hi!");
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "hi!");
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
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("", "");
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
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        java.lang.Class<?> wildcardClass25 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass24 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str21 = datalogin0.getUserRole("hi!");
        boolean boolean24 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        boolean boolean27 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str23 = datalogin0.getUserRole("");
        java.lang.String str25 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        java.lang.Class<?> wildcardClass25 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass9 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        boolean boolean26 = datalogin0.validateUser("hi!", "hi!");
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
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
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
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("", "");
        boolean boolean20 = datalogin0.validateUser("", "");
        boolean boolean23 = datalogin0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass23 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.String str18 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean21 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean24 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        boolean boolean7 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = datalogin0.getUserRole("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        boolean boolean7 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean18 = datalogin0.validateUser("", "hi!");
        boolean boolean21 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str23 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("hi!");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass9 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass22 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "");
        java.lang.String str8 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str22 = datalogin0.getUserRole("hi!");
        boolean boolean25 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        boolean boolean17 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
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
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "hi!");
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
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
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
        java.lang.String str27 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass23 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        boolean boolean19 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str21 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean19 = datalogin0.validateUser("hi!", "");
        boolean boolean22 = datalogin0.validateUser("hi!", "");
        java.lang.String str24 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str22 = datalogin0.getUserRole("hi!");
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
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("");
        java.lang.String str16 = datalogin0.getUserRole("hi!");
        java.lang.String str18 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("", "hi!");
        java.lang.String str21 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "");
        java.lang.String str27 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
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
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean11 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass12 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = datalogin0.getUserRole("");
        boolean boolean21 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean14 = datalogin0.validateUser("hi!", "");
        java.lang.String str16 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean24 = datalogin0.validateUser("", "");
        boolean boolean27 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean30 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        boolean boolean7 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
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
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str13 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
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
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        java.lang.String str26 = datalogin0.getUserRole("");
        boolean boolean29 = datalogin0.validateUser("", "");
        java.lang.String str31 = datalogin0.getUserRole("");
        java.lang.String str33 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass18 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("", "");
        boolean boolean20 = datalogin0.validateUser("", "");
        boolean boolean23 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        boolean boolean10 = datalogin0.validateUser("", "hi!");
        boolean boolean13 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        java.lang.String str9 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass10 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        java.lang.String str10 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass16 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        boolean boolean10 = datalogin0.validateUser("", "hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass16 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        boolean boolean7 = datalogin0.validateUser("hi!", "");
        java.lang.String str9 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass4 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
        boolean boolean20 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        java.lang.String str11 = datalogin0.getUserRole("");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "");
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
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "");
        java.lang.String str21 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str23 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass24 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
        java.lang.String str26 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass27 = datalogin0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean10 = datalogin0.validateUser("", "hi!");
        java.lang.Class<?> wildcardClass11 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.String str16 = datalogin0.getUserRole("");
        java.lang.String str18 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass19 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("hi!", "");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("", "");
        boolean boolean14 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean17 = datalogin0.validateUser("", "");
        java.lang.String str19 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        java.lang.String str11 = datalogin0.getUserRole("");
        boolean boolean14 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean17 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        java.lang.String str7 = datalogin0.getUserRole("hi!");
        boolean boolean10 = datalogin0.validateUser("", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("");
        java.lang.String str14 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass15 = datalogin0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        java.lang.String str9 = datalogin0.getUserRole("hi!");
        boolean boolean12 = datalogin0.validateUser("hi!", "");
        java.lang.String str14 = datalogin0.getUserRole("hi!");
        boolean boolean17 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean9 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.String str11 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        java.lang.String str10 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean16 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean9 = datalogin0.validateUser("hi!", "");
        java.lang.String str11 = datalogin0.getUserRole("hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "");
        java.lang.String str24 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str27 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str30 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.Class<?> wildcardClass31 = buisnesslogin0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass13 = buisnesslogin0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        boolean boolean18 = datalogin0.validateUser("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        java.lang.String str16 = datalogin0.getUserRole("");
        boolean boolean19 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass23 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
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
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
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
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean16 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
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
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean23 = datalogin0.validateUser("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        java.lang.String str7 = datalogin0.getUserRole("");
        boolean boolean10 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str12 = datalogin0.getUserRole("hi!");
        boolean boolean15 = datalogin0.validateUser("hi!", "");
        java.lang.String str17 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean8 = datalogin0.validateUser("", "");
        boolean boolean11 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("");
        boolean boolean22 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str24 = datalogin0.getUserRole("");
        java.lang.String str26 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("hi!", "hi!");
        java.lang.String str8 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid username or password. Please try again." + "'", str18, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid username or password. Please try again." + "'", str21, "Invalid username or password. Please try again.");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean16 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean19 = datalogin0.validateUser("", "");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        java.lang.String str6 = datalogin0.getUserRole("hi!");
        boolean boolean9 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean12 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        boolean boolean28 = datalogin0.validateUser("hi!", "Invalid username or password. Please try again.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        java.lang.String str4 = datalogin0.getUserRole("hi!");
        java.lang.String str6 = datalogin0.getUserRole("");
        java.lang.String str8 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str21 = buisnesslogin0.loginUser("", "hi!");
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
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
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
        java.lang.String str26 = datalogin0.getUserRole("hi!");
        java.lang.String str28 = datalogin0.getUserRole("hi!");
        java.lang.String str30 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "hi!");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str19 = datalogin0.getUserRole("");
        java.lang.String str21 = datalogin0.getUserRole("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        java.lang.String str12 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        boolean boolean15 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str19 = datalogin0.getUserRole("");
        java.lang.Class<?> wildcardClass20 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        java.lang.String str13 = datalogin0.getUserRole("hi!");
        boolean boolean16 = datalogin0.validateUser("hi!", "");
        java.lang.String str18 = datalogin0.getUserRole("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid username or password. Please try again." + "'", str3, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid username or password. Please try again." + "'", str6, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid username or password. Please try again." + "'", str9, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid username or password. Please try again." + "'", str12, "Invalid username or password. Please try again.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid username or password. Please try again." + "'", str15, "Invalid username or password. Please try again.");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("hi!", "");
        java.lang.String str15 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("hi!", "hi!");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
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
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str17 = datalogin0.getUserRole("");
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
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("Invalid username or password. Please try again.");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        java.lang.String str17 = datalogin0.getUserRole("hi!");
        boolean boolean20 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "");
        java.lang.String str12 = buisnesslogin0.loginUser("", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str24 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
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
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        boolean boolean6 = datalogin0.validateUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass7 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("hi!");
        boolean boolean13 = datalogin0.validateUser("", "");
        boolean boolean16 = datalogin0.validateUser("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        datalogin datalogin0 = new datalogin();
        java.lang.String str2 = datalogin0.getUserRole("hi!");
        boolean boolean5 = datalogin0.validateUser("", "");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str10 = datalogin0.getUserRole("");
        boolean boolean13 = datalogin0.validateUser("hi!", "hi!");
        boolean boolean16 = datalogin0.validateUser("", "hi!");
        java.lang.String str18 = datalogin0.getUserRole("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean11 = datalogin0.validateUser("", "");
        java.lang.String str13 = datalogin0.getUserRole("");
        java.lang.String str15 = datalogin0.getUserRole("hi!");
        boolean boolean18 = datalogin0.validateUser("Invalid username or password. Please try again.", "");
        java.lang.Class<?> wildcardClass19 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        datalogin datalogin0 = new datalogin();
        boolean boolean3 = datalogin0.validateUser("", "hi!");
        java.lang.String str5 = datalogin0.getUserRole("");
        boolean boolean8 = datalogin0.validateUser("hi!", "");
        boolean boolean11 = datalogin0.validateUser("", "hi!");
        boolean boolean14 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean17 = datalogin0.validateUser("Invalid username or password. Please try again.", "hi!");
        boolean boolean20 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        boolean boolean23 = datalogin0.validateUser("", "Invalid username or password. Please try again.");
        java.lang.Class<?> wildcardClass24 = datalogin0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("", "");
        java.lang.String str9 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str15 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str18 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "Invalid username or password. Please try again.");
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
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        buisnesslogin buisnesslogin0 = new buisnesslogin();
        java.lang.String str3 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str6 = buisnesslogin0.loginUser("hi!", "Invalid username or password. Please try again.");
        java.lang.String str9 = buisnesslogin0.loginUser("", "hi!");
        java.lang.String str12 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str15 = buisnesslogin0.loginUser("", "");
        java.lang.String str18 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "hi!");
        java.lang.String str21 = buisnesslogin0.loginUser("Invalid username or password. Please try again.", "");
        java.lang.String str24 = buisnesslogin0.loginUser("", "Invalid username or password. Please try again.");
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
}
