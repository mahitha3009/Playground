#include<iostream>
int gcd(int a,int b);
int main()
{
  int a,b;
  std::cin>>a>>b;
  int x=gcd(a,b);
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<x;
  return 0;
}
int gcd(int a,int b)
{
  if(a==0 || b==0)
    return 0;
  else if(a==b)
    return a;
  else if(a<b)
  return gcd(a,b-a);
  else 
    return gcd(a-b,b);
}