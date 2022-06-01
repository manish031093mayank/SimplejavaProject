class A13
{
static int x=10;

static 
{
System.out.println("A is loaded...");
}

}


class LoadingTest //extends A
{

static 
{
System.out.println("LoadingTest is loaded...");
}

public static void main(String ss[])
{
//A a=new A();
System.out.println(A13.x);

System.out.println("helllo java");
}

}
