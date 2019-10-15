abstract class shape
{
    abstract double area(double dim1,double dim2);
}

class circle extends shape
{
    double area(double dim1,double dim2)
    {
        return 3.14*dim1*dim1;
    }
}

class rectangle extends shape
{
    double area(double dim1,double dim2)
    {
        return dim1*dim2;

    }
}

class square extends shape
{
    double area(double dim1,double dim2)
    {
        return dim1*dim1;
    }
}

class absclass
{
    public static void main(String args[])
    {
        shape ref;
        square sq=new square();
        circle cir=new circle();
        rectangle rect=new rectangle();
        ref=sq;
        System.out.println("square:"+ref.area(5,0));
        ref=cir;
        System.out.println("circle:"+ref.area(5,0));
        ref=rect;
        System.out.println("square:"+ref.area(5,6));
    }
}