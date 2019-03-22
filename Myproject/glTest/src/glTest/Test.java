package glTest;

import java.util.Set;

// https://www.jdoodle.com/online-java-compiler
public class Test {
    
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        
        System.out.println("Start Test");
        
        System.out.println("\nTest 1 - Candidate can Override");
        test(candidate.toString() != null);
        
        System.out.println("\nTest 2 - Candidate can Inherit");
        test(Person.class.isAssignableFrom(Candidate.class));
        
        System.out.println("\nTest 3 - Candidate can Inherit a lot");
        test(Candidate.class.isAssignableFrom(Associate.class));
        test(Person.class.isAssignableFrom(Associate.class));
        
        System.out.println("\nTest 4 - Candidate can Throw");
        test(candidateCanThrow(candidate));
        
        System.out.println("\nTest 5 - Candidate can Overload");
        test(candidateCanOverload());
        
        System.out.println("\nTest 6 - Candidate is Shocking");
        String lunchOne = "Tasty Lunch";
        String lunchTwo = "Savory Lunch";
        Candidate otherCandidate = new Candidate();
        otherCandidate.setLunch(lunchTwo);
        candidate.setLunch(lunchOne);
        test(lunchOne.equalsIgnoreCase(otherCandidate.getLunch()));
        otherCandidate.setLunch(lunchTwo);
        test(lunchTwo.equalsIgnoreCase(candidate.getLunch()));
        test(lunchTwo.equalsIgnoreCase(otherCandidate.getLunch()));
        
        System.out.println("\nTest Finished");
        
    }
    
    public static void test(boolean condition) {
        if (condition == true) {
            System.out.println("Test Passed");
            return;
        }
        
        System.out.println("Test Failed");
    }
    
    public static boolean candidateCanThrow(Candidate candidate) {
        try {
            candidate.throwRuntime();
            return false;
        } catch (RuntimeException e) {
            return true;
        }
    }
    
    public static boolean candidateCanOverload() {
        try {
            Candidate.class.getMethod("answerQuestion", java.util.Set.class);
        } catch (NoSuchMethodException e) {
            System.out.println("No Clue");
            return false;
        } catch (SecurityException e) {
            System.out.println("Should never get here");
            return false;
        }
        
        return true;
    }
    
    // Do not Edit Above this line
    // Edit Below this line
    
    public static class Question {
        private static int number = 0;
        public final int thought;
        
        public Question() {
            thought = number++;
        }
        
    }
    
    public static class Person {
        private String name="ganesh";
        
        public String toString() {
            return name;
        }
        
        public String answerQuestion(Question question) {
            return String.valueOf(question.thought);
        }
    }
    
    public static class Candidate extends Person {
        private static String lunch;
        int i=0;
        
        public static String getLunch() {
            return lunch;
        }
        
        public void setLunch(String lunch) {
            this.lunch = lunch;
        }
        
        public void throwRuntime() {
        }
    }
    
    public static class Associate extends Candidate {}
    
}