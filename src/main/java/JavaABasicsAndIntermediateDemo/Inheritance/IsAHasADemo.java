package JavaABasicsAndIntermediateDemo.Inheritance;


 class Person{              //Person is => Super, Parent, Base class
    int age;                //Student is => Sub, Child, Derived class
 }
 class Book{
 }

 class Student extends Person{  // Student is a Person -> Is-A Relationship
    int studentId;
    Book studentBook = new Book();    // Student has a book (Object of book class
                                      //-> Is-A Relationship
 }

