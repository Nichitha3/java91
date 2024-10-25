public class Sum of digits 
{
static int findsum (int number)
{
int sum=0;
while (number!=0)
{
sum=sum+number% 10;
number=number/10;
}
return sum;
}
public static void main (String args[])
{
int number=5678;
System.out.println("The sum of digits:"+find(number) );
}
}