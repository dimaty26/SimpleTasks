package Collections.java;

import java.util.*;

 class Book {
     String nameAuthor;

     public Book(String nameAuthor) {
         this.nameAuthor = nameAuthor;
     }

     @Override
     public String toString() {
         return "Book{" +
                 "nameAuthor='" + nameAuthor + '\'' +
                 '}';
     }
 }

     public class Main {
         public static void main(String[] args) {

             Collection collection = new LinkedHashSet();
             collection.add("3");
             collection.add("2");
             collection.add("1");

             for (Object o : collection)
             {
                 System.out.println(o);
             }

         }
     }

