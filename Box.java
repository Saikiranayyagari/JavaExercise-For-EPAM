import java.io.*;
import java.util.*;
class Box1
{
double w;
double d;
double h;
Box1(double width,double depth,double height)
{
	w=width;
	d=depth;
	h=height;
}
double Volume()
{
	double v;
	v=w*d*h;
	return v;
}
}
class Main
{
public static void main(String[] args)
{
	Box1 bc=new Box1(12.3,22.7,15.8);
	System.out.println(bc.Volume());
}
}
	