package org.khangpbm.mathutil.core.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.khangpbm.mathutil.core.MathUtility;
/**
 *
 * @author PHAMKHANG
 */
public class MathUtilityTest {
        // catch exception, xem hàm có trả về ngoại lệ như đã design không
        // ngoại lệ xuất hiện => logically app sụp đổ
        // riêng cho UnitTest, chỉ quan tâm 
        // expected == actual -> xanh else đỏ
        // actual là gì không cần biết, chỉ cần expected == actual
        // nếu đưa vào -1, thì kì vọng xuất hiện ngaoi5 lệ ILLEGalargumentexception xuất hiện
        // vậy nên nếu đưa vào -1 và ngaoi5 lệ xh thật => xanh, else đỏ lè :v
        // Assert.assertEquals(50, 50);
//       @Test(expected = IllegalArgumentException.class)
//       public void testFactorialGivenRightArgumentWrongReturnsWell(){
//           // Expect exception appears. If it does => xanh, else đỏ
//           assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-1));
//       }
       @Test
       public void testFactorialGivenRightArgument0ReturnsWell(){
           assertEquals(1, MathUtility.getFactorial(0));
       }
       @Test
       public void testFactorialGivenRightArgument1ReturnsWell(){
           // Assert.assertEquals(50, 50);
           assertEquals(1, MathUtility.getFactorial(1));
           assertEquals(2, MathUtility.getFactorial(2));
           assertEquals(6, MathUtility.getFactorial(3));
           assertEquals(720, MathUtility.getFactorial(6));
       }
}

// Khi tất cả cùng xanh => all test cases pass
// Xanh: Thảo mãn expected == actual, nghĩa là hàm xử lí đúng 
// Đỏ: chỉ 1 thằng đỏ, coi như hàm đỏ, sai
// Hàm đúng <=> test cases used passes
// Can't check all test cases but check cái nào đúng cái đó
// 1 đỏ => chứng minh hàm xử lí đang sai

//TDD: TEST DRIVEN DEVELOPMENT
//DDT: DATA DRIVEN TESTING
