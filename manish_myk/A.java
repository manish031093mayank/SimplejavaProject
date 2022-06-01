class A
{
static int x;

public static void main(String ss[])
{
System.out.println("main block"); 
new A(34);
new A();
new A(94,45);
}

A()
{
System.out.println("A con......");
}


A(int x)
{
System.out.println(x);
 
}

A(int x,int y)
{
System.out.println(x); 
System.out.println(y); 
}

{
System.out.println("init block1...");
}


{
System.out.println("init block2...");
}

static
{
x=10;
new A();
new A(12);
new A(45);
System.out.println("static block");
}


static
{
System.out.println("static block1");
}

{
System.out.println("init block3...");
}

static
{
//System.exit(0);
System.out.println("static block2");
}

}