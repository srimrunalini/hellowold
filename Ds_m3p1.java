package ds_m3;

public class Ds_m3p1 {
	void merge(String arr[], int beg, int mid, int end)  
	{                        
	  
	int l = mid - beg + 1;  
	int r = end - mid;  
	  
	String LeftArray[] = new String [l];  
	String RightArray[] = new String [r];  
	  
	for (int i=0; i<l; ++i)  
	LeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<r; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg;  
	while (i<l&&j<r)  
	{  
	if (LeftArray[i].compareTo(RightArray[j])<0)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<l)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<r)  
	{  
	arr[k] = RightArray[j];  
	j++;  
	k++;  
	}  
	}  
	void sort(String arr[], int beg, int end)  
	{  
	if (beg<end)  
	{  
	int mid = (beg+end)/2;  
	sort(arr, beg, mid);  
	sort(arr , mid+1, end);  
	merge(arr, beg, mid, end);  
	}  
	}  
	public static void main(String args[])  
	{  
	String arr[] = {"e","a","s","y","q","u","e","t","i","o","n"};  
	Ds_m3p1 ob = new Ds_m3p1();  
	ob.sort(arr, 0, arr.length-1);  
	  
	System.out.println("\nSorted array");  
	for(int i =0; i<arr.length;i++)  
	{  
	    System.out.println(arr[i]+"");  
	}  
	}  	
	}
