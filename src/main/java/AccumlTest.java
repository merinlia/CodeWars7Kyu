import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccumlTest {

   @Test
   public void mumblingTest(){
    String expected = "A-Bb-Ccc-Dddd";
    String actual = Mumbling.accum("abcd");
    assertEquals(expected, actual);

}

//Mumbling problem form Code War
// System.out.println(actual);
//Output: A-Bb-Ccc-Dddd


}
