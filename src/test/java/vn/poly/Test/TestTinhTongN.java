package vn.poly.Test;

import vn.poly.Service.TinhTongNSoLeDaNhapService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTinhTongN {
   TinhTongNSoLeDaNhapService tinhTongNSoDaNhap = new TinhTongNSoLeDaNhapService();
   @Test
    public void testTinhTongN1() {
         int [] arr = {1, 2, 3, 4, 5};
         int expected = 15;
         int result = tinhTongNSoDaNhap.tinhTong(arr);
         assertEquals(expected, result);
    }
    @Test
    public void testTinhTongN2() {
         int [] arr = {0, 0, 0, 0, 0};
         int expected = 0;
         int result = tinhTongNSoDaNhap.tinhTong(arr);
         assertEquals(expected, result);
    }
    @Test
    public void testTinhTongN3() {
         int [] arr = {1, 2, 3, 4, 5, 6};
         int expected = 21;
         int result = tinhTongNSoDaNhap.tinhTong(arr);
         assertEquals(expected, result);
    }
    @Test
    public void testTinhTongN4() {
         int [] arr = {10, 20, 30, 40, 50};
         int expected = 150;
         int result = tinhTongNSoDaNhap.tinhTong(arr);
         assertEquals(expected, result);
    }
    @Test
    public void testTinhTongN5() {
         int [] arr = {};
         try {
             tinhTongNSoDaNhap.tinhTong(arr);
         } catch (IllegalArgumentException e) {
             assertEquals("Mảng không được null hoặc rỗng", e.getMessage());
         }
    }


}
