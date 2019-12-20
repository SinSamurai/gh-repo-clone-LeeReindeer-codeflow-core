package moe.leer.codeflowcore;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author leer
 * Created at 12/18/19 1:53 PM
 */
public class ForBlockTest extends BaseFlowchartTest {

  @Test
  public void testForCode() throws IOException {
    codeFlow.parseFile("forCode.cf").toFile("forCode");
  }

  @Test
  public void testForNestIf() throws IOException {
    codeFlow.parseFile("forNestIf.cf").toFile("forNestIf");
  }

  @Test
  public void testNestedFor() throws IOException {
    codeFlow.parseFile("nestedFor.cf").toFile("nestFor");
    codeFlow.parseFile("nestedFor2.cf").toFile("nestFor2");
  }

  @Test
  public void testForBreak() throws IOException {
    codeFlow.parseFile("forBreak.cf").toFile("forBreak");
  }

  @Test
  public void testNestedForBreak() throws IOException {
//    codeFlow.parseFile("dp.cf").toFile("nestedForBreak");
    codeFlow.parseFile("nestedForBreak.cf").toFile("nestedForBreak");
  }

  @Test
  public void mulTable() {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j <= i; j++) {
        if (j != 1) System.out.print(" ");
        System.out.printf("%d*%d=%d", i, j, i * j);
      }
      System.out.println();
    }
  }
}
