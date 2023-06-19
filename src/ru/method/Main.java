package ru.method;

public class Main {


  public static void main(String[] args) {
     Realization realization = new Realization();
     System.out.println("Print: "+realization.sumProp(31, "Ì", "Ð"));
     System.out.println("Print: "+realization.sumProp(22, "Ñ", "Ò"));
     System.out.println("Print: "+realization.sumProp(154323, "Ì", "È"));
     System.out.println("Print: "+realization.sumProp(154323, "Ì", "Ò"));
  }
}
