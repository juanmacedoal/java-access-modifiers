package main.com.java.access.modifiers.protectedmodifier;

/** Class that has a protected method. */
class Protected {

  /** Protected method. @return String value */
  protected String protectedMethod() {
    return "This only can be access through another class in the same package because is protected the method and the class is default";
  }
}
