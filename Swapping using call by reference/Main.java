#include<iostream>
void swap(int &a,int &b)
{
  int t;
  t=a;
  a=b;
   b=t;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b<<"\n";
}
