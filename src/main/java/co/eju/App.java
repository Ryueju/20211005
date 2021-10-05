package co.eju;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 //   	Exam01 ex = new Exam01();
 //   	ex.stringTest();
    
    DateTest dateTest = new DateTest();
    dateTest.dateTest();
    dateTest.calendarTest();
    System.out.println("=================");
    
    
    SqlDateTest sd = new SqlDateTest();
    sd.sqlDate();
    
    }
    
}
