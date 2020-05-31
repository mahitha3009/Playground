#include<iostream>
using namespace std;
int main()
{
  int a[20],n,k,val;
 cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"\nEnter the location where you wish to insert an element";
   cin>>k;
  if(k<n)
  {
  cout<<"\nEnter the value to insert";
  cin>>val;
  if(val>0)
  {
  cout<<"\nArray after insertion is\n";
  for(int i=n;i>=k;i--)
    a[i]=a[i-1];
   a[k-1]=val;
  for(int i=0;i<n+1;i++)
  {
    cout<<a[i]<<"\n";
}
  }
}
  else
    cout<<"\nInvalid Input";
}