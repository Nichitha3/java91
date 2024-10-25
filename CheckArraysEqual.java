import java.util.Arrays;
public class CheckArraysEqual
{
public static void main(String[]args)
{
int a[] = {30,40,50};
int b[] = {30,40,50};
boolean result = Arrays.equals(a,b);
if (result==true)
{
System.out.println("Two arrays are eqal");
}
else{
System.out.println("Two arrays are not eqaual");
}
}
}