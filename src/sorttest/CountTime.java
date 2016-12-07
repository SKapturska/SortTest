package sorttest;


import org.junit.AssumptionViolatedException;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

public class CountTime extends Stopwatch{
    
 private static void logInfo(Description description, String status, long nanos) {
    String testName = description.getMethodName();
    System.out.println("Test " + testName + " " + status + ", upłyneło " + nanos + " nanosekund");
}

 @Override
   protected void succeeded(long nanos, Description description) {
       logInfo(description, "został zakończony pomyślnie", nanos);
   }

   @Override
   protected void failed(long nanos, Throwable e, Description description) {
       logInfo(description, "nie zakończył się", nanos);
   }

   @Override
   protected void skipped(long nanos, AssumptionViolatedException e, Description description) {
       logInfo(description, "został pominięty", nanos);
   }

   @Override
   protected void finished(long nanos, Description description) {
       logInfo(description, "został zakończony", nanos);
   }
    
}
