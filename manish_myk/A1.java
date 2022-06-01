class A1
{
static int x=10;

static void show()
{
System.out.println("show of A");
}

A1()
{
System.out.println(x);
show();
}

void m1()
{
System.out.println(x);
show();
}



public static void main(String ss[])
{
new A1().show();
System.out.println(new A1().x);

A1 a=new A1();
a.show();
System.out.println(a.x);
a.m1();
System.out.println(A1.x);
A1.show();

System.out.println(x);
show();

}
}

class B
{
public static void main(String ss[])
{
new A1().show();
System.out.println(new A1().x);

A1 a=new A1();
a.show();
System.out.println(a.x);
a.m1();

System.out.println(A1.x);
A1.show();

}

}