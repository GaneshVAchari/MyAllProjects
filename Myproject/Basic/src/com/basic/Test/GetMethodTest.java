package com.basic.Test;

import java.lang.reflect.Method;

public class GetMethodTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
       Candidate c=new Candidate();
       Method m=c.getClass().getMethod("answerQuestion",Question.class);
       System.out.println("methd ---"+m);
	}

	public static class Question {
		private static int number = 0;
		public final int thought;

		public Question() {
			thought = number++;
		}

	}

	public static class Person {
		private String name = "ganesh";

		public String toString() {
			return name;
		}

		public String answerQuestion(Question question) {
			return String.valueOf(question.thought);
		}
	}

	public static class Candidate extends Person {
		private String lunch;

		public String getLunch() {
			return lunch;
		}

		public void setLunch(String lunch) {
			this.lunch = lunch;
		}

		public void throwRuntime() {
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

}
