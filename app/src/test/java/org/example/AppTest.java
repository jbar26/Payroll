package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  PayrollCalc pc = new PayrollCalc();

  // Testing GrossPay with a rate of 16.78 for a various amount of hours
  @Test
  void test0hrsGrossPay() { assertEquals(0, pc.calcGrossPay(16.78, 0));}
  @Test
  void test1hrsGrossPay() { assertEquals(16.78, pc.calcGrossPay(16.78, 1));}
  @Test
  void test2hrsGrossPay() { assertEquals(33.56, pc.calcGrossPay(16.78, 2));}
  @Test
  void test27hrsGrossPay() { assertEquals(453.06, pc.calcGrossPay(16.78, 27));}
  @Test
  void test30halfHrsGrossPay() { assertEquals(511.79, pc.calcGrossPay(16.78, 30.5));}
  @Test
  void test39hrsGrossPay() { assertEquals(654.42, pc.calcGrossPay(16.78, 39));}
  @Test
  void test40hrsGrossPay() { assertEquals(671.20, pc.calcGrossPay(16.78, 40));}
  @Test
  void test41hrsGrossPay() { assertEquals(696.37, pc.calcGrossPay(16.78, 41));}
  @Test
  void test53hrsGrossPay() { assertEquals(998.41, pc.calcGrossPay(16.78, 53));}


  // Testing GrossPay for a various amount of rates
  @Test
  void test0rateGrossPay() { assertEquals(0, pc.calcGrossPay(0, 30));}
  @Test
  void test1rateGrossPay() { assertEquals(30, pc.calcGrossPay(1.00, 30));}
  @Test
  void test12and25rateGrossPay() { assertEquals(367.50, pc.calcGrossPay(12.25, 30));}
  @Test
  void test27rateGrossPay() { assertEquals(1282.5, pc.calcGrossPay(27.00, 45));}
  @Test
  void test30halfRateGrossPay() { assertEquals(1448.75, pc.calcGrossPay(30.50, 45));}
  @Test
  void test24and33rateGrossPay() { assertEquals(973.2, pc.calcGrossPay(24.33, 40));}


  // Test SocSec with different gross amounts
  @Test
  void test0grossSocSec() { assertEquals(0, pc.calcSocSec(0)); }
  @Test
  void test1grossSocSec() { assertEquals(0.06, pc.calcSocSec(1)); }
  @Test
  void test2grossSocSec() { assertEquals(0.12, pc.calcSocSec(2)); }
  @Test
  void test250grossSocSec() { assertEquals(15, pc.calcSocSec(250));
  }@Test
  void test5678grossSocSec() { assertEquals(340.68, pc.calcSocSec(5678)); }
  @Test
  void test45and67grossSocSec() { assertEquals(2.74, pc.calcSocSec(45.67)); }



  // Test FedTax with different gross amounts
  @Test
  void test0grossFedTax() { assertEquals(0, pc.calcFedTax(0)); }
  @Test
  void test1grossFedTax() { assertEquals(0.14, pc.calcFedTax(1)); }
  @Test
  void test2grossFedTax() { assertEquals(0.28, pc.calcFedTax(2)); }
  @Test
  void test250grossFedTax() { assertEquals(35, pc.calcFedTax(250));
  }@Test
  void test5678grossFedTax() { assertEquals(794.92, pc.calcFedTax(5678)); }
  @Test
  void test45and67grossFedTax() { assertEquals(6.39, pc.calcFedTax(45.67)); }



  // Test StTax with different gross amounts
  @Test
  void test0grossStTax() { assertEquals(0, pc.calcStTax(0)); }
  @Test
  void test1grossStTax() { assertEquals(0.05, pc.calcStTax(1)); }
  @Test
  void test2grossStTax() { assertEquals(0.10, pc.calcStTax(2)); }
  @Test
  void test250grossStTax() { assertEquals(12.5, pc.calcStTax(250));
  }@Test
  void test5678grossStTax() { assertEquals(283.9, pc.calcStTax(5678)); }
  @Test
  void test45and67grossStTax() { assertEquals(2.28, pc.calcStTax(45.67)); }


  // Test Union Dues
  @Test
  void testNoUnionDues() { assertEquals(0, pc.calcUnionDues(false)); }
  @Test
  void testYesUnionDues() { assertEquals(10, pc.calcUnionDues(true)); }

  // Test Insurance
  @Test
  void test0dependentsInsurance() { assertEquals(15, pc.calcInsurance(0)); }
  @Test
  void test1dependentInsurance() { assertEquals(15, pc.calcInsurance(1)); }
  @Test
  void test2dependentInsurance() { assertEquals(15, pc.calcInsurance(2)); }
  @Test
  void test3dependentInsurance() { assertEquals(35, pc.calcInsurance(3)); }
  @Test
  void test4dependentInsurance() { assertEquals(35, pc.calcInsurance(4)); }
  @Test
  void test5dependentInsurance() { assertEquals(35, pc.calcInsurance(5)); }
  @Test
  void test10dependentInsurance() { assertEquals(35, pc.calcInsurance(10)); }



}
