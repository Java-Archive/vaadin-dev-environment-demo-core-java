package junit.org.rapidpm.vaadin.developer.demo.corejava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.rapidpm.vaadin.developer.demo.corejava.Service;

/**
 *
 */
public class ServiceTest {

  @Test
  void test001() {
    System.out.println("true = " + true);
    Assert.assertEquals(new Service().uppercase("hello world"),"HELLO WORLD");
  }
}
