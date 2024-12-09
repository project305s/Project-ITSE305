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
        // The following exception was thrown during execution in test generation
        try {
            Customer customer2 = new Customer("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        PresentationLayer presentationLayer0 = new PresentationLayer();
        java.lang.Class<?> wildcardClass1 = presentationLayer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        DataLayer dataLayer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            BusinessLayer businessLayer1 = new BusinessLayer(dataLayer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DataLayer cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer2 = new Customer("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) '#');
        Customer customer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dataLayer0.save(customer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        DataLayer dataLayer0 = new DataLayer();
        // The following exception was thrown during execution in test generation
        try {
            Customer customer2 = dataLayer0.findById(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass5 = dataLayer0.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dataLayer0.save(customer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer10 = businessLayer3.registerCustomer("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer5 = businessLayer3.getCustomerDetails((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer10 = businessLayer3.registerCustomer("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (short) 100);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        Customer customer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dataLayer0.save(customer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer7 = businessLayer3.getCustomerDetails((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer9 = businessLayer3.getCustomerDetails((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass4 = businessLayer3.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass6 = dataLayer0.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        java.lang.Class<?> wildcardClass6 = dataLayer0.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer4 = new DataLayer();
        Customer customer6 = dataLayer4.findById((int) ' ');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer4);
        Customer customer9 = businessLayer7.getCustomerDetails((int) (short) 1);
        Customer customer11 = businessLayer7.getCustomerDetails((int) (byte) 10);
        Customer customer14 = businessLayer7.registerCustomer("hi!", "hi!");
        dataLayer0.save(customer14);
        Customer customer17 = dataLayer0.findById((int) '4');
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer9);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertNull(customer17);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Customer customer2 = new Customer("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            customer2.setId((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            customer10.setId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer2 = new Customer("Customer{id=1, name='hi!', email='hi!'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer2 = new Customer("", "Customer{id=1, name='hi!', email='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer10 = businessLayer7.registerCustomer("", "Customer{id=0, name='hi!', email='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer6 = businessLayer3.registerCustomer("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer7 = dataLayer0.findById((int) (byte) 10);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = customer5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.getEmail();
        java.lang.String str5 = customer2.toString();
        // The following exception was thrown during execution in test generation
        try {
            customer2.setId((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str5, "Customer{id=0, name='hi!', email='hi!'}");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass8 = businessLayer7.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        DataLayer dataLayer0 = new DataLayer();
        DataLayer dataLayer1 = new DataLayer();
        Customer customer3 = dataLayer1.findById((int) ' ');
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer1);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 1);
        Customer customer8 = businessLayer4.getCustomerDetails((int) (byte) 10);
        Customer customer11 = businessLayer4.registerCustomer("hi!", "hi!");
        customer11.setId((int) (short) 10);
        dataLayer0.save(customer11);
        // The following exception was thrown during execution in test generation
        try {
            customer11.setId((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer3);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer4 = new DataLayer();
        Customer customer6 = dataLayer4.findById((int) ' ');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer4);
        Customer customer9 = businessLayer7.getCustomerDetails((int) (short) 1);
        Customer customer11 = businessLayer7.getCustomerDetails((int) (byte) 10);
        Customer customer14 = businessLayer7.registerCustomer("hi!", "hi!");
        dataLayer0.save(customer14);
        java.lang.String str16 = customer14.getName();
        customer14.setId((int) ' ');
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer9);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer6 = businessLayer3.registerCustomer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Customer customer2 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        int int3 = customer2.getId();
        java.lang.String str4 = customer2.getName();
        // The following exception was thrown during execution in test generation
        try {
            customer2.setId((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = businessLayer5.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer11 = businessLayer5.registerCustomer("", "Customer{id=0, name='hi!', email='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = businessLayer5.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            customer8.setId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.getEmail();
        customer2.setId((int) 'a');
        java.lang.String str7 = customer2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        Customer customer7 = dataLayer0.findById((int) (byte) 100);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        Customer customer11 = businessLayer8.registerCustomer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer14 = businessLayer8.registerCustomer("", "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) '#');
        Customer customer4 = dataLayer0.findById(10);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer7 = businessLayer5.getCustomerDetails((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer10 = businessLayer5.registerCustomer("Customer{id=1, name='hi!', email='hi!'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer9 = dataLayer0.findById(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = businessLayer5.registerCustomer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=0, name='hi!', email='hi!'}");
        Customer customer11 = businessLayer5.registerCustomer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = new Customer("hi!", "hi!");
        dataLayer0.save(customer8);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer11 = dataLayer0.findById((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.getEmail();
        customer2.setId((int) '4');
        java.lang.String str6 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Customer customer2 = new Customer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        int int3 = customer2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer7 = businessLayer5.getCustomerDetails((int) (byte) 10);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            Customer customer7 = dataLayer0.findById((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        Customer customer7 = dataLayer0.findById((int) (byte) 100);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer10 = dataLayer0.findById((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = dataLayer0.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        Customer customer6 = dataLayer0.findById((int) (short) 10);
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        Customer customer9 = dataLayer0.findById((int) '#');
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer4 = new DataLayer();
        Customer customer6 = dataLayer4.findById((int) ' ');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer4);
        Customer customer9 = businessLayer7.getCustomerDetails((int) (short) 1);
        Customer customer11 = businessLayer7.getCustomerDetails((int) (byte) 10);
        Customer customer14 = businessLayer7.registerCustomer("hi!", "hi!");
        dataLayer0.save(customer14);
        // The following exception was thrown during execution in test generation
        try {
            customer14.setId((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer9);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNotNull(customer14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Customer customer2 = new Customer("Customer{id=1, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        Customer customer7 = dataLayer0.findById((int) (byte) 100);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        Customer customer11 = businessLayer8.registerCustomer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        Customer customer14 = businessLayer8.registerCustomer("hi!", "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNotNull(customer14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.toString();
        int int4 = customer2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str3, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = new Customer("hi!", "hi!");
        dataLayer0.save(customer8);
        java.lang.String str10 = customer8.getName();
        java.lang.Class<?> wildcardClass11 = customer8.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        int int9 = customer8.getId();
        java.lang.String str10 = customer8.getName();
        dataLayer0.save(customer8);
        java.lang.String str12 = customer8.getName();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Customer customer2 = new Customer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=1, name='hi!', email='hi!'}");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer2 = new Customer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) '#');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass4 = dataLayer0.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        DataLayer dataLayer0 = new DataLayer();
        DataLayer dataLayer1 = new DataLayer();
        Customer customer3 = dataLayer1.findById((int) ' ');
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer1);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 1);
        Customer customer8 = businessLayer4.getCustomerDetails((int) (byte) 10);
        Customer customer11 = businessLayer4.registerCustomer("hi!", "hi!");
        customer11.setId((int) (short) 10);
        dataLayer0.save(customer11);
        Customer customer17 = new Customer("hi!", "hi!");
        java.lang.String str18 = customer17.getEmail();
        java.lang.String str19 = customer17.toString();
        dataLayer0.save(customer17);
        java.lang.Class<?> wildcardClass21 = customer17.getClass();
        org.junit.Assert.assertNull(customer3);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str19, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) 'a');
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        int int7 = customer6.getId();
        int int8 = customer6.getId();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Customer customer2 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        int int3 = customer2.getId();
        customer2.setId((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        DataLayer dataLayer0 = new DataLayer();
        DataLayer dataLayer1 = new DataLayer();
        Customer customer3 = dataLayer1.findById((int) ' ');
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer1);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 1);
        Customer customer8 = businessLayer4.getCustomerDetails((int) (byte) 10);
        Customer customer11 = businessLayer4.registerCustomer("hi!", "hi!");
        customer11.setId((int) (short) 10);
        dataLayer0.save(customer11);
        customer11.setId(1);
        java.lang.String str17 = customer11.toString();
        java.lang.String str18 = customer11.toString();
        org.junit.Assert.assertNull(customer3);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Customer{id=1, name='hi!', email='hi!'}" + "'", str17, "Customer{id=1, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Customer{id=1, name='hi!', email='hi!'}" + "'", str18, "Customer{id=1, name='hi!', email='hi!'}");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Customer customer2 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str3, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str4, "Customer{id=0, name='hi!', email='hi!'}");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str11 = customer10.toString();
        int int12 = customer10.getId();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str11, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Customer customer2 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        java.lang.String str3 = customer2.toString();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}" + "'", str3, "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str4, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = new Customer("hi!", "hi!");
        dataLayer0.save(customer8);
        java.lang.String str10 = customer8.toString();
        java.lang.String str11 = customer8.getEmail();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id=1, name='hi!', email='hi!'}" + "'", str10, "Customer{id=1, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer7 = dataLayer0.findById((int) 'a');
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = new Customer("hi!", "hi!");
        dataLayer0.save(customer8);
        java.lang.Class<?> wildcardClass10 = dataLayer0.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        Customer customer6 = dataLayer0.findById((int) (short) 10);
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer9 = businessLayer7.getCustomerDetails((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertNull(customer6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer3.registerCustomer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "hi!");
        Customer customer8 = businessLayer3.getCustomerDetails((int) '#');
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertNull(customer8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer7 = businessLayer4.registerCustomer("", "Customer{id=0, name='hi!', email='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.getEmail();
        java.lang.String str5 = customer2.toString();
        customer2.setId((int) (byte) 100);
        int int8 = customer2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str5, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.getEmail();
        java.lang.String str5 = customer2.toString();
        customer2.setId((int) (byte) 100);
        customer2.setId((int) '#');
        int int10 = customer2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str5, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        Customer customer7 = dataLayer0.findById((int) (byte) 100);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer11 = businessLayer8.registerCustomer("Customer{id=1, name='hi!', email='hi!'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.toString();
        // The following exception was thrown during execution in test generation
        try {
            customer2.setId((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str3, "Customer{id=0, name='hi!', email='hi!'}");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        dataLayer0.save(customer6);
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer2 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        Customer customer8 = dataLayer0.findById((int) '4');
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer0);
        Customer customer12 = businessLayer9.registerCustomer("hi!", "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Customer customer2 = new Customer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        java.lang.String str3 = customer2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}'}" + "'", str3, "Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}'}");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer3 = new Customer("hi!", "hi!");
        dataLayer0.save(customer3);
        Customer customer6 = dataLayer0.findById((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        Customer customer12 = businessLayer3.getCustomerDetails(10);
        Customer customer14 = businessLayer3.getCustomerDetails(35);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNull(customer12);
        org.junit.Assert.assertNull(customer14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str11 = customer10.getEmail();
        java.lang.Class<?> wildcardClass12 = customer10.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str11, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        Customer customer7 = dataLayer0.findById((int) (byte) 100);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        Customer customer11 = businessLayer8.registerCustomer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer13 = businessLayer8.getCustomerDetails(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        Customer customer9 = dataLayer0.findById((int) (byte) 100);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Customer customer2 = new Customer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str3 = customer2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str3, "Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        Customer customer9 = businessLayer3.registerCustomer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        customer9.setId((int) (byte) 100);
        java.lang.String str12 = customer9.getEmail();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertNotNull(customer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id=1, name='hi!', email='hi!'}" + "'", str12, "Customer{id=1, name='hi!', email='hi!'}");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Customer customer2 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        int int3 = customer2.getId();
        java.lang.String str4 = customer2.getName();
        java.lang.String str5 = customer2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Customer{id=0, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}" + "'", str5, "Customer{id=0, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        DataLayer dataLayer0 = new DataLayer();
        BusinessLayer businessLayer1 = new BusinessLayer(dataLayer0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer8 = businessLayer5.registerCustomer("", "Customer{id=1, name='hi!', email='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer7 = businessLayer5.getCustomerDetails((int) (byte) 1);
        Customer customer10 = businessLayer5.registerCustomer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.Class<?> wildcardClass11 = businessLayer3.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            Customer customer2 = new Customer("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer5 = dataLayer0.findById((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Customer customer2 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        int int3 = customer2.getId();
        customer2.setId((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) '#');
        Customer customer4 = dataLayer0.findById((int) (byte) 100);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = businessLayer5.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        Customer customer10 = businessLayer5.getCustomerDetails((int) (byte) 10);
        Customer customer12 = businessLayer5.getCustomerDetails((int) (short) 100);
        Customer customer14 = businessLayer5.getCustomerDetails((int) (byte) 100);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer8);
        org.junit.Assert.assertNull(customer10);
        org.junit.Assert.assertNull(customer12);
        org.junit.Assert.assertNull(customer14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer3 = new Customer("hi!", "hi!");
        dataLayer0.save(customer3);
        Customer customer6 = dataLayer0.findById((int) (short) 1);
        DataLayer dataLayer7 = new DataLayer();
        Customer customer9 = dataLayer7.findById((int) ' ');
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer7);
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer7);
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer7);
        Customer customer15 = new Customer("hi!", "hi!");
        dataLayer7.save(customer15);
        java.lang.String str17 = customer15.getEmail();
        dataLayer0.save(customer15);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertNull(customer9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Customer customer2 = new Customer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str3 = customer2.getName();
        java.lang.Class<?> wildcardClass4 = customer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}" + "'", str3, "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 10);
        Customer customer8 = businessLayer4.getCustomerDetails(100);
        Customer customer11 = businessLayer4.registerCustomer("Customer{id=1, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        Customer customer13 = businessLayer4.getCustomerDetails((int) (short) 10);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNull(customer13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        Customer customer9 = businessLayer3.registerCustomer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        java.lang.Class<?> wildcardClass10 = customer9.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertNotNull(customer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        Customer customer9 = businessLayer3.registerCustomer("Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertNotNull(customer9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Customer customer2 = new Customer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str3 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str3, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) '#');
        Customer customer4 = dataLayer0.findById(35);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        Customer customer10 = businessLayer8.getCustomerDetails((int) ' ');
        java.lang.Class<?> wildcardClass11 = businessLayer8.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Customer customer2 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        java.lang.Class<?> wildcardClass3 = customer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer4 = new DataLayer();
        Customer customer6 = dataLayer4.findById((int) ' ');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer4);
        Customer customer9 = businessLayer7.getCustomerDetails((int) (short) 1);
        Customer customer11 = businessLayer7.getCustomerDetails((int) (byte) 10);
        Customer customer14 = businessLayer7.registerCustomer("hi!", "hi!");
        dataLayer0.save(customer14);
        java.lang.String str16 = customer14.getName();
        java.lang.String str17 = customer14.getEmail();
        java.lang.String str18 = customer14.toString();
        int int19 = customer14.getId();
        java.lang.String str20 = customer14.getEmail();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer9);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Customer{id=1, name='hi!', email='hi!'}" + "'", str18, "Customer{id=1, name='hi!', email='hi!'}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        int int7 = customer6.getId();
        java.lang.String str8 = customer6.getName();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str8, "Customer{id=0, name='hi!', email='hi!'}");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str11 = customer10.toString();
        java.lang.String str12 = customer10.getEmail();
        java.lang.String str13 = customer10.toString();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str11, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str12, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str13, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Customer customer2 = new Customer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "hi!");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str4, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Customer customer2 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}'}");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) (short) 1);
        Customer customer8 = new Customer("hi!", "hi!");
        java.lang.String str9 = customer8.getEmail();
        java.lang.String str10 = customer8.getEmail();
        java.lang.String str11 = customer8.getName();
        dataLayer0.save(customer8);
        DataLayer dataLayer13 = new DataLayer();
        Customer customer15 = dataLayer13.findById((int) ' ');
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer13);
        Customer customer18 = businessLayer16.getCustomerDetails((int) (short) 1);
        Customer customer20 = businessLayer16.getCustomerDetails((int) (byte) 10);
        Customer customer23 = businessLayer16.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str24 = customer23.toString();
        dataLayer0.save(customer23);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(customer15);
        org.junit.Assert.assertNull(customer18);
        org.junit.Assert.assertNull(customer20);
        org.junit.Assert.assertNotNull(customer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str24, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = businessLayer5.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            customer8.setId((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 10);
        Customer customer8 = businessLayer4.getCustomerDetails(100);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer11 = businessLayer4.registerCustomer("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) '#');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer5 = businessLayer3.getCustomerDetails((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        Customer customer10 = businessLayer8.getCustomerDetails((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            Customer customer13 = businessLayer8.registerCustomer("Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer7 = businessLayer5.getCustomerDetails((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = businessLayer5.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        Customer customer10 = businessLayer7.registerCustomer("Customer{id=0, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}", "Customer{id=0, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNotNull(customer10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 10);
        Customer customer8 = businessLayer4.getCustomerDetails(100);
        Customer customer11 = businessLayer4.registerCustomer("Customer{id=1, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        java.lang.String str12 = customer11.toString();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id=1, name='Customer{id=1, name='hi!', email='hi!'}', email='Customer{id=1, name='hi!', email='hi!'}'}" + "'", str12, "Customer{id=1, name='Customer{id=1, name='hi!', email='hi!'}', email='Customer{id=1, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        Customer customer8 = dataLayer0.findById((int) '4');
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer0);
        Customer customer12 = businessLayer9.registerCustomer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str13 = customer12.getName();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}" + "'", str13, "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        Customer customer10 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        dataLayer0.save(customer10);
        int int12 = customer10.getId();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Customer customer2 = new Customer("hi!", "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        int int3 = customer2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) (short) 1);
        Customer customer8 = new Customer("hi!", "hi!");
        java.lang.String str9 = customer8.getEmail();
        java.lang.String str10 = customer8.getEmail();
        java.lang.String str11 = customer8.getName();
        dataLayer0.save(customer8);
        Customer customer15 = new Customer("hi!", "hi!");
        java.lang.String str16 = customer15.getEmail();
        java.lang.String str17 = customer15.getEmail();
        java.lang.String str18 = customer15.getName();
        java.lang.String str19 = customer15.toString();
        dataLayer0.save(customer15);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str19, "Customer{id=0, name='hi!', email='hi!'}");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            Customer customer4 = dataLayer0.findById(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        Customer customer8 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        dataLayer0.save(customer8);
        Customer customer12 = new Customer("hi!", "hi!");
        java.lang.String str13 = customer12.getEmail();
        java.lang.String str14 = customer12.getEmail();
        java.lang.String str15 = customer12.toString();
        dataLayer0.save(customer12);
        java.lang.String str17 = customer12.toString();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str15, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Customer{id=2, name='hi!', email='hi!'}" + "'", str17, "Customer{id=2, name='hi!', email='hi!'}");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        int int9 = customer8.getId();
        java.lang.String str10 = customer8.getName();
        dataLayer0.save(customer8);
        java.lang.Class<?> wildcardClass12 = dataLayer0.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        Customer customer6 = dataLayer0.findById((int) (short) 10);
        Customer customer8 = dataLayer0.findById((int) (byte) 1);
        Customer customer10 = dataLayer0.findById((int) (short) 10);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNull(customer10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer8 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        int int9 = customer8.getId();
        java.lang.String str10 = customer8.getName();
        dataLayer0.save(customer8);
        java.lang.String str12 = customer8.toString();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id=1, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}" + "'", str12, "Customer{id=1, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) (short) 1);
        DataLayer dataLayer6 = new DataLayer();
        Customer customer8 = dataLayer6.findById((int) ' ');
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer6);
        Customer customer11 = dataLayer6.findById((int) '4');
        Customer customer13 = dataLayer6.findById((int) (byte) 100);
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer6);
        Customer customer17 = businessLayer14.registerCustomer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        dataLayer0.save(customer17);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNull(customer13);
        org.junit.Assert.assertNotNull(customer17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Customer customer2 = new Customer("hi!", "Customer{id=1, name='hi!', email='hi!'}");
        int int3 = customer2.getId();
        customer2.setId(10);
        int int6 = customer2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Customer customer2 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        java.lang.String str3 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str3, "Customer{id=0, name='hi!', email='hi!'}");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str11 = customer10.toString();
        java.lang.String str12 = customer10.getEmail();
        int int13 = customer10.getId();
        int int14 = customer10.getId();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str11, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str12, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer3 = new Customer("hi!", "hi!");
        dataLayer0.save(customer3);
        java.lang.String str5 = customer3.getName();
        customer3.setId(1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.getEmail();
        customer2.setId((int) 'a');
        int int7 = customer2.getId();
        java.lang.String str8 = customer2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id=97, name='hi!', email='hi!'}" + "'", str8, "Customer{id=97, name='hi!', email='hi!'}");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Customer customer2 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        java.lang.String str3 = customer2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=1, name='hi!', email='hi!'}" + "'", str3, "Customer{id=1, name='hi!', email='hi!'}");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        Customer customer10 = businessLayer8.getCustomerDetails((int) ' ');
        Customer customer13 = businessLayer8.registerCustomer("Customer{id=2, name='hi!', email='hi!'}", "hi!");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer10);
        org.junit.Assert.assertNotNull(customer13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.toString();
        java.lang.String str4 = customer2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str3, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer6 = new DataLayer();
        Customer customer8 = dataLayer6.findById((int) ' ');
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer6);
        Customer customer11 = businessLayer9.getCustomerDetails((int) (short) 1);
        Customer customer13 = businessLayer9.getCustomerDetails((int) (byte) 10);
        Customer customer16 = businessLayer9.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        dataLayer0.save(customer16);
        Customer customer20 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        java.lang.String str21 = customer20.toString();
        dataLayer0.save(customer20);
        DataLayer dataLayer23 = new DataLayer();
        Customer customer26 = new Customer("hi!", "hi!");
        dataLayer23.save(customer26);
        java.lang.String str28 = customer26.getName();
        dataLayer0.save(customer26);
        BusinessLayer businessLayer30 = new BusinessLayer(dataLayer0);
        Customer customer32 = dataLayer0.findById(35);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNull(customer13);
        org.junit.Assert.assertNotNull(customer16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}" + "'", str21, "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(customer32);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        Customer customer7 = dataLayer0.findById((int) (byte) 100);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        Customer customer11 = businessLayer8.registerCustomer("Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}'}", "Customer{id=97, name='hi!', email='hi!'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer3.registerCustomer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "hi!");
        Customer customer9 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        Customer customer12 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}", "Customer{id=0, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertNotNull(customer9);
        org.junit.Assert.assertNotNull(customer12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer3 = new Customer("hi!", "hi!");
        dataLayer0.save(customer3);
        Customer customer6 = dataLayer0.findById((int) (short) 1);
        DataLayer dataLayer7 = new DataLayer();
        Customer customer9 = dataLayer7.findById((int) ' ');
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer7);
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer7);
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer7);
        DataLayer dataLayer13 = new DataLayer();
        Customer customer15 = dataLayer13.findById((int) ' ');
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer13);
        Customer customer18 = businessLayer16.getCustomerDetails((int) (short) 1);
        Customer customer20 = businessLayer16.getCustomerDetails((int) (byte) 10);
        Customer customer23 = businessLayer16.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        dataLayer7.save(customer23);
        Customer customer27 = new Customer("Customer{id=0, name='hi!', email='hi!'}", "hi!");
        java.lang.String str28 = customer27.toString();
        dataLayer7.save(customer27);
        BusinessLayer businessLayer30 = new BusinessLayer(dataLayer7);
        BusinessLayer businessLayer31 = new BusinessLayer(dataLayer7);
        DataLayer dataLayer32 = new DataLayer();
        Customer customer34 = dataLayer32.findById((int) ' ');
        BusinessLayer businessLayer35 = new BusinessLayer(dataLayer32);
        BusinessLayer businessLayer36 = new BusinessLayer(dataLayer32);
        BusinessLayer businessLayer37 = new BusinessLayer(dataLayer32);
        DataLayer dataLayer38 = new DataLayer();
        Customer customer40 = dataLayer38.findById((int) ' ');
        BusinessLayer businessLayer41 = new BusinessLayer(dataLayer38);
        Customer customer43 = businessLayer41.getCustomerDetails((int) (short) 1);
        Customer customer45 = businessLayer41.getCustomerDetails((int) (byte) 10);
        Customer customer48 = businessLayer41.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        dataLayer32.save(customer48);
        dataLayer7.save(customer48);
        dataLayer0.save(customer48);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertNull(customer9);
        org.junit.Assert.assertNull(customer15);
        org.junit.Assert.assertNull(customer18);
        org.junit.Assert.assertNull(customer20);
        org.junit.Assert.assertNotNull(customer23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}" + "'", str28, "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        org.junit.Assert.assertNull(customer34);
        org.junit.Assert.assertNull(customer40);
        org.junit.Assert.assertNull(customer43);
        org.junit.Assert.assertNull(customer45);
        org.junit.Assert.assertNotNull(customer48);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer10 = businessLayer7.registerCustomer("Customer{id=2, name='hi!', email='hi!'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.getEmail();
        customer2.setId((int) 'a');
        customer2.setId((int) (short) 10);
        int int9 = customer2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        Customer customer6 = dataLayer0.findById((int) (byte) 100);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertNull(customer6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer6 = new DataLayer();
        Customer customer8 = dataLayer6.findById((int) ' ');
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer6);
        Customer customer11 = businessLayer9.getCustomerDetails((int) (short) 1);
        Customer customer13 = businessLayer9.getCustomerDetails((int) (byte) 10);
        Customer customer16 = businessLayer9.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        dataLayer0.save(customer16);
        customer16.setId(10);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNull(customer13);
        org.junit.Assert.assertNotNull(customer16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Customer customer7 = businessLayer5.getCustomerDetails((int) (byte) 100);
        Customer customer9 = businessLayer5.getCustomerDetails((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer11 = businessLayer5.getCustomerDetails((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNull(customer9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        DataLayer dataLayer0 = new DataLayer();
        DataLayer dataLayer1 = new DataLayer();
        Customer customer3 = dataLayer1.findById((int) ' ');
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer1);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 1);
        Customer customer8 = businessLayer4.getCustomerDetails((int) (byte) 10);
        Customer customer11 = businessLayer4.registerCustomer("hi!", "hi!");
        customer11.setId((int) (short) 10);
        dataLayer0.save(customer11);
        DataLayer dataLayer15 = new DataLayer();
        Customer customer17 = dataLayer15.findById((int) ' ');
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer15);
        DataLayer dataLayer19 = new DataLayer();
        Customer customer21 = dataLayer19.findById((int) ' ');
        BusinessLayer businessLayer22 = new BusinessLayer(dataLayer19);
        Customer customer24 = businessLayer22.getCustomerDetails((int) (short) 1);
        Customer customer26 = businessLayer22.getCustomerDetails((int) (byte) 10);
        Customer customer29 = businessLayer22.registerCustomer("hi!", "hi!");
        dataLayer15.save(customer29);
        java.lang.String str31 = customer29.getName();
        java.lang.String str32 = customer29.getEmail();
        java.lang.String str33 = customer29.toString();
        java.lang.String str34 = customer29.getName();
        dataLayer0.save(customer29);
        org.junit.Assert.assertNull(customer3);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNull(customer17);
        org.junit.Assert.assertNull(customer21);
        org.junit.Assert.assertNull(customer24);
        org.junit.Assert.assertNull(customer26);
        org.junit.Assert.assertNotNull(customer29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Customer{id=1, name='hi!', email='hi!'}" + "'", str33, "Customer{id=1, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str11 = customer10.toString();
        java.lang.String str12 = customer10.getEmail();
        java.lang.String str13 = customer10.getName();
        java.lang.String str14 = customer10.getName();
        int int15 = customer10.getId();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str11, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str12, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str13, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str14, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        Customer customer8 = dataLayer0.findById((int) '4');
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer0);
        Customer customer11 = businessLayer9.getCustomerDetails((int) (byte) 100);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNull(customer11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = dataLayer0.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        int int7 = customer6.getId();
        java.lang.String str8 = customer6.getEmail();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(customer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id=1, name='hi!', email='hi!'}" + "'", str8, "Customer{id=1, name='hi!', email='hi!'}");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Customer customer2 = new Customer("Customer{id=1, name='hi!', email='hi!'}", "Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}'}");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        Customer customer4 = dataLayer0.findById((int) (byte) 10);
        Customer customer6 = dataLayer0.findById((int) (short) 10);
        Customer customer8 = dataLayer0.findById((int) (byte) 1);
        DataLayer dataLayer9 = new DataLayer();
        Customer customer11 = dataLayer9.findById((int) ' ');
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer9);
        Customer customer15 = businessLayer12.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        int int16 = customer15.getId();
        dataLayer0.save(customer15);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNotNull(customer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = dataLayer0.findById((int) '4');
        Customer customer7 = dataLayer0.findById((int) (byte) 100);
        BusinessLayer businessLayer8 = new BusinessLayer(dataLayer0);
        Customer customer11 = businessLayer8.registerCustomer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}");
        Customer customer14 = businessLayer8.registerCustomer("Customer{id=97, name='hi!', email='hi!'}", "Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNotNull(customer14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer3 = new Customer("hi!", "hi!");
        dataLayer0.save(customer3);
        Customer customer6 = dataLayer0.findById(10);
        org.junit.Assert.assertNull(customer6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = dataLayer0.findById((int) 'a');
        Customer customer9 = new Customer("Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=0, name='hi!', email='hi!'}");
        dataLayer0.save(customer9);
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Customer customer2 = new Customer("hi!", "hi!");
        java.lang.String str3 = customer2.getEmail();
        java.lang.String str4 = customer2.toString();
        java.lang.String str5 = customer2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str4, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) '#');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Customer customer6 = businessLayer3.registerCustomer("Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer email cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customer2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Customer customer2 = new Customer("hi!", "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        java.lang.String str3 = customer2.getName();
        java.lang.String str4 = customer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 10);
        Customer customer8 = businessLayer4.getCustomerDetails(100);
        Customer customer11 = businessLayer4.registerCustomer("Customer{id=1, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='hi!'}");
        Customer customer14 = businessLayer4.registerCustomer("Customer{id=97, name='hi!', email='hi!'}", "Customer{id=1, name='hi!', email='Customer{id=1, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertNotNull(customer14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        DataLayer dataLayer0 = new DataLayer();
        DataLayer dataLayer1 = new DataLayer();
        Customer customer3 = dataLayer1.findById((int) ' ');
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer1);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 1);
        Customer customer8 = businessLayer4.getCustomerDetails((int) (byte) 10);
        Customer customer11 = businessLayer4.registerCustomer("hi!", "hi!");
        customer11.setId((int) (short) 10);
        dataLayer0.save(customer11);
        Customer customer17 = new Customer("hi!", "hi!");
        java.lang.String str18 = customer17.getEmail();
        java.lang.String str19 = customer17.toString();
        dataLayer0.save(customer17);
        DataLayer dataLayer21 = new DataLayer();
        Customer customer23 = dataLayer21.findById((int) ' ');
        BusinessLayer businessLayer24 = new BusinessLayer(dataLayer21);
        Customer customer26 = businessLayer24.getCustomerDetails((int) (short) 1);
        Customer customer28 = businessLayer24.getCustomerDetails((int) (byte) 10);
        Customer customer31 = businessLayer24.registerCustomer("hi!", "hi!");
        dataLayer0.save(customer31);
        org.junit.Assert.assertNull(customer3);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer8);
        org.junit.Assert.assertNotNull(customer11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Customer{id=0, name='hi!', email='hi!'}" + "'", str19, "Customer{id=0, name='hi!', email='hi!'}");
        org.junit.Assert.assertNull(customer23);
        org.junit.Assert.assertNull(customer26);
        org.junit.Assert.assertNull(customer28);
        org.junit.Assert.assertNotNull(customer31);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Customer customer6 = businessLayer4.getCustomerDetails((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = businessLayer4.getClass();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Customer customer2 = new Customer("Customer{id=0, name='Customer{id=0, name='Customer{id=0, name='hi!', email='hi!'}', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}", "Customer{id=1, name='hi!', email='hi!'}");
        int int3 = customer2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Customer customer5 = businessLayer3.getCustomerDetails((int) (short) 1);
        Customer customer7 = businessLayer3.getCustomerDetails((int) (byte) 10);
        Customer customer10 = businessLayer3.registerCustomer("Customer{id=0, name='hi!', email='hi!'}", "Customer{id=0, name='hi!', email='hi!'}");
        java.lang.String str11 = customer10.toString();
        java.lang.String str12 = customer10.toString();
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer5);
        org.junit.Assert.assertNull(customer7);
        org.junit.Assert.assertNotNull(customer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str11, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}" + "'", str12, "Customer{id=1, name='Customer{id=0, name='hi!', email='hi!'}', email='Customer{id=0, name='hi!', email='hi!'}'}");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        DataLayer dataLayer0 = new DataLayer();
        Customer customer2 = dataLayer0.findById((int) ' ');
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer4 = new DataLayer();
        Customer customer6 = dataLayer4.findById((int) ' ');
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer4);
        Customer customer9 = businessLayer7.getCustomerDetails((int) (short) 1);
        Customer customer11 = businessLayer7.getCustomerDetails((int) (byte) 10);
        Customer customer14 = businessLayer7.registerCustomer("hi!", "hi!");
        dataLayer0.save(customer14);
        java.lang.String str16 = customer14.getEmail();
        customer14.setId((int) ' ');
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNull(customer6);
        org.junit.Assert.assertNull(customer9);
        org.junit.Assert.assertNull(customer11);
        org.junit.Assert.assertNotNull(customer14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        PresentationLayer presentationLayer0 = new PresentationLayer();
// flaky "1) test168(RegressionTest0)":         presentationLayer0.displayMenu();
// flaky "1) test168(RegressionTest0)":         presentationLayer0.displayMenu();
// flaky "1) test168(RegressionTest0)":         presentationLayer0.displayMenu();
// flaky "1) test168(RegressionTest0)":         presentationLayer0.displayMenu();
// flaky "1) test168(RegressionTest0)":         presentationLayer0.displayMenu();
// flaky "1) test168(RegressionTest0)":         presentationLayer0.displayMenu();
    }
}
