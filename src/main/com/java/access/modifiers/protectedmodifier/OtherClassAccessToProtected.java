package main.com.java.access.modifiers.protectedmodifier;

/** OtherClassAccess. */
public class OtherClassAccessToProtected {

  /**
   * Return protected class string.
   *
   * @return String
   */
  public String returnProtectedValue() {
    Protected protectedClass = new Protected();
    return protectedClass.protectedMethod();
  }
}
