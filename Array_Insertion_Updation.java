
class Array_Insertion_Updation
{

//a method to Display an array:
public void ArrayPrint(int[] arr)
{
int n=arr.length;
for (int i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
	}
System.out.println("\n");
	}

		
//Array Insertion :
public void  ArrayImpliment()
{
int myarray[]={1,365,8,433,67,};
//int myarray[]=new int[5];
//myarray[0]=1;
//myarray[1]=23;
//myarray[2]=6;
//myarray[3]=78;

//updating the value of a particular index:
myarray[4]=5;
ArrayPrint(myarray);
System.out.println("length: "+myarray.length);
	}

public static void main(String[] args)
{
Array_Insertion_Updation a = new Array_Insertion_Updation();
a.ArrayImpliment();
	}

	}