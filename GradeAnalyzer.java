/* . -Grade Analyzer -
    A simple program that can Analyze an ArrayList of Integers as grades in a class
    .getHighest .getLowest .getAverage
    Methods take an ArrayList<Integer> parameter
    returns an Integer and prints to the console
*/
import java.util.ArrayList;

class GradeAnalyzer {
  GradeAnalyzer() {
    
  }
  
    public int getHighest(ArrayList<Integer> grades) {
    if (grades.size() < 1) {
      System.out.println("No Grades");
      return 0;
    } else {
      int highest = 0;
      for (int grade : grades) {
        if (grade > highest) {
         highest = grade;
        } else {
          highest = highest;
        }
      }
      System.out.println("Highest: " + highest);
        return highest;
      
  }
  }
  
  public int getLowest(ArrayList<Integer> grades) {
    if (grades.size() < 1) {
      System.out.println("No Grades");
      return 0;
    } else {
      int lowest = 100;
      for (int grade : grades) {
        if (grade < lowest) {
          lowest = grade;
        } else {
          lowest = lowest;
        }
      }
      System.out.println("Lowest: " + lowest);
        return lowest;
      
  }
  }
  
  public int getAverage(ArrayList<Integer> grades) {
    if (grades.size() < 1) {
      System.out.println("No Grades");
      return 0;
    } else {
      int sum = 0;
      for (int grade : grades) {
        sum += grade;
      }
    int average = sum / grades.size();
    System.out.println(average);
      return average;
    }
    
  }
  
  public static void main (String[] args) {
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    
    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.getLowest(myClassroom);
    myAnalyzer.getHighest(myClassroom);
    
  }
  
}