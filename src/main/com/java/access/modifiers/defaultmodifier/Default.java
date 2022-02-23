package main.com.java.access.modifiers.defaultmodifier;

/** Default class. */
public class Default {

  /** Default method. @return String */
  String defaultMethod() {
    return "Default method only call in a subclass or another class in the same package";
  }

  /** SubClass. */
  public class InnerClass {

    /**
     * Method of subclass.
     *
     * @return String
     */
    public String anotherSubClass() {
      Default defaultClass = new Default();
      return defaultClass.defaultMethod();
    }
  }
}
