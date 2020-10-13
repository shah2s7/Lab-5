class Student {  
  String name;  
  Double gpa;  
  String major; 

  String getName() {    
    return name; 
    }  
    
  Double getGPA() {    
    return gpa;  
    }  
      
  String getMajor() {    
    return major;  
    }  
    
  void setName(String theName) {    
    name = theName;  
    }  
      
  void setGPA(double theGPA) {    
    gpa = theGPA;  
    }  
        
  void setMajor(String theMajor) {    
    major = theMajor;  
    }
    
    void print() {
      System.out.println("student's name is " + name + " and their GPA is " + gpa + " and their major is " + major);

    }
  }