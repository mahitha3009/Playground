#include<iostream>
int fun(int n,int *arr);
using namespace std;
int main()
{
  int n;
 cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array\n";
  for(int i=0;i<=n;i++)
    cin>>a[i];
  int r=fun(n,a);
  if(r==n)
    cout<<"The array is Even";
  else if(r==0)
    cout<<"The array is Odd";
  else 
    cout<<"The array is Mixed";
}
int fun(int n,int *arr)
{
  int count=0;
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
      count++;
  }
  return count;
}