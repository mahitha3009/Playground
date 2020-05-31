#include<iostream>
int sum(int n);
int main()
{
  int n;
  std::cin>>n;
  int x=sum(n);
  std::cout<<x;
  return 0;
}
int sum(int n)
{
  int s=0;
  while(n>0)
  {
 int  r=n%10;
  s+=r;
  n=n/10;
  }
  if(s<=9)
    return s;
  else
    sum(s);
}