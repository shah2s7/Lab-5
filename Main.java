import java.util.*;

class Main {  
  public static void main(String[] args) {  
    Student student1 = new Student();  
    Student student2 = new Student();

    student1.setName("Arnold Spielberg");    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");

    student2.setName("Suraj Shah");    
    student2.setGPA(4.3);    
    student2.setMajor("Information Systems and Finance");

    student1.print();
    student2.print();
   

    ArrayList<Double> gpaArray = new ArrayList<Double>();
    gpaArray.add(student1.getGPA());
    gpaArray.add(student2.getGPA());

    double sum = 0.0;
    for(int j = 0; j < gpaArray.size(); ++j) {


      sum = gpaArray.get(j) + sum;
    }
    double avg = sum/(gpaArray.size()*1.0);

    System.out.println("AVG: " + avg);
  }
} 