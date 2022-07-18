
public class MyClass {
	int arr[] = new int[20];
	public static int count(int key)
	{
		int []arr=new int[20];
		int low,high,cnt,mid;
		low = 0;
		high = arr.length-1;
		mid = (low+high)/2;
		cnt=0;
		while((arr[mid]!=key)&&(low<high))
		{
			if(key < arr[mid])
				high=mid - 1;
			else
				low=mid + 1;
			mid = (low + high)/2;
		}

		if(arr[mid]==key)
		{
			cnt = cnt + 1;
			low = mid-1;
			while(arr[low]==key)
			{
				cnt = cnt+1;
				low=low-1;
			}
			
			high=mid+1;
			while(arr[high]==key)
			{
				cnt=cnt+1;
				high=high+1;
			}
		}
		return cnt;
	}

public static void main(String []args)
{
	System.out.println(count(70) + "student");
}
}