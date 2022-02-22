package main.com.java.access.modifiers.privatemodifier;

/** Private modifier. */
public class Private {

  /** String var. */
  private String privateAccess = "This is a private acess string value";

  /**
   * Access to private string var throught get method.
   *
   * @return String var
   */
  public String getPrivateAccess() {
    return privateAccess + " access by a public get method";
  }
}
