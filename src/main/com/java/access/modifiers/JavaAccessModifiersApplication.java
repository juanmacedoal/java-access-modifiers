package main.com.java.access.modifiers;

import main.com.java.access.modifiers.defaultmodifier.Default;
import main.com.java.access.modifiers.privatemodifier.Private;
import main.com.java.access.modifiers.protectedmodifier.OtherClassAccessToProtected;
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
    OtherClassAccessToProtected otherClassAccessToProtected = new OtherClassAccessToProtected();
    System.out.println("\n" + otherClassAccessToProtected.returnProtectedValue());
    Default defaultClass = new Default();
    Default.InnerClass innerClass = defaultClass.new InnerClass();
    System.out.println("\n" + innerClass.anotherSubClass());
  }
}
