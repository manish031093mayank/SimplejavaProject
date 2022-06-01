class A12
{ 

A12()
{
System.out.println("A cons......");
}

static 
{
System.out.println("A is loaded...");
}

}

class B12
{ 


B12()
{
System.out.println("B cons......");
}

static 
{
System.out.println("B is loaded...");
}

}


class LoadingTest  
{

static 
{
System.out.println("LoadingTest is loaded...");
}

public static void main(String ss[])
{
try
{
Class c=Class.forName(ss[0]);
c.newInstance();

System.out.println(c);

}
catch(Exception e)
{
System.out.println("Pleases entere the name of class to be loadeddd...");
}
 
}

}
