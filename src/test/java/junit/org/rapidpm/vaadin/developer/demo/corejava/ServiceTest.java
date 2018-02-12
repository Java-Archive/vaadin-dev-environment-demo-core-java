package junit.org.rapidpm.vaadin.developer.demo.corejava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rapidpm.vaadin.developer.demo.corejava.Service;

/**
 *
 */
public class ServiceTest {

  @Test
  void test001() {
    System.out.println("true = " + true);
    Assertions.assertEquals(new Service().uppercase("hello world"), "HELLO WORLD");
  }
}
