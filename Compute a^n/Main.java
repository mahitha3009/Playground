#include<iostream>
int pow(int a,int n);
using namespace std;
int main()
{
  int a,n;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>n;
 int p= pow(a,n);
  cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<p;
}
int pow(int a,int n)
{
  if(n==0)
    return 1;
  else if(n==1)
    return a;
  else
    return a*pow(a,n-1);
}