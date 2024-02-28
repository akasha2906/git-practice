import java.util.Scanner;

public class Stack1 
{
	static int[] stack;
	static int top;

	static void createstack(int i) 
	{
		stack=new int [i];	
		top=-1;
		System.out.println("stack is created with a size of"+i);
	}
	static void push(int e) 
	{
		if(top==stack.length-1)
		{
			System.out.println("stack overflow......");
		}
		else
		{
			top++;
			stack[top]=e;
			System.out.println(e+" had been added");
		}
	}
	public static void pop()
	{
		System.out.println(stack[top]+"had been deleted");
		stack[top]=0;
		top--;
	}
	static boolean isEmpty()
	{
				return top==-1;
	}
	static boolean isFull()
	{
		return top==stack.length-1;
	}
	static void clear()
	{
		top=-1;
		System.out.println("your stack is cleared");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean f=true;
		while(f)
		{
			System.out.println();
			System.out.println("======Menu======");
			System.out.println(" 1.Create Stack \n 2.push \n 3.Display \n 4.pop \n 5.isEmpty \n 6.isFull \n 7.clear \n 8.exit");
			System.out.println("Select your option\n");
			int op=sc.nextInt();
			switch(op)
			{
			case 1:
			{
				System.out.println("Enter the size of the stack: ");
				int size=sc.nextInt();
				createstack(size);
				break;
			}
			case 2:
			{
				System.out.println("enter the element: ");
				int ele=sc.nextInt();
				push(ele);
				break;
			}
			case 3:
			{
				if(top==-1)
				{
					System.out.println("stack is Empty");
				}
				else
				{
					for(int i:stack)
					{
						System.out.println(i);
					}
				}
				break;
			}
			case 4:
			{
				pop();
				break;
			}
			case 5:
			{
				System.out.println(isEmpty());
				break;
				
			}
			case 6:
			{
				System.out.println(isFull());
				break;
			}
			case 7:
			{
				clear();
				break;
			}
			case 8:
			{
				System.out.println("Thank you!!!");
				f=false;
				break;
			}
			default:
			{
				System.out.println("invalid input");
			}
			}
			
		}
	}
}
