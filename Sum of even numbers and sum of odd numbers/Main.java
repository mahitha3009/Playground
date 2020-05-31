#include<iostream>
using namespace std;
int main()
{
int n;
  cin>>n;
  int a[n];
  int es=0,os=0;
 for(int i=0;i<n;i++)
   cin>>a[i];
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      es+=a[i];
    else
      os+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<es;
   cout<<"\nThe sum of the odd numbers in the array is "<<os;
}
