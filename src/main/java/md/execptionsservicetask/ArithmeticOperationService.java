package md.execptionsservicetask;

public class ArithmeticOperationService {
    public static double divideWithoutExceptionHandling(int a, int b){
        return a/b;
    }
    public static double divideWithExceptionHandling(int a, int b){
        try{
            return a/b;
        }catch (ArithmeticException capturedException){
            System.out.println(capturedException.getMessage());
            System.out.println("This code block code is execude only if there is an exception in the try section" );
            return 0.0;
        }finally {
            System.out.println("This block code is executed all the times");
        }
    }
}
