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


  // Test Soc
}
