#include<iostream>
using namespace std;
int main()
{
  int n,a,sum=0,count;
  cin>>n;
  for(count=0;sum<n;count++)
    {
        cin>>a; 
        sum=sum+a; 
    }
  cout<<"The number of turns is "<<count;
}