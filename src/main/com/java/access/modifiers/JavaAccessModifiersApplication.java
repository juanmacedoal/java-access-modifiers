package main.com.java.access.modifiers;

import main.com.java.access.modifiers.privatemodifier.Private;
import main.com.java.access.modifiers.publicmodifier.Public;

/** Java Access Modifiers application. */
public class JavaAccessModifiersApplication {

  /**
   * Main Java Application.
   *
   * @param args Java Args program
   */
  public static void main(String[] args) {
    Public publicVar = new Public();
    System.out.println("\n" + publicVar.publicMessage());
    Private privateVar = new Private();
    System.out.println("\n" + privateVar.getPrivateAccess());
  }
}
