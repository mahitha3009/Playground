#include<iostream>
int fact(int n);
int main()
{
  int n;
  std::cin>>n;
  int f=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<f;
  return 0;
}
int fact(int n)
{
  if(n==0 || n==1)
    return 1;
  else
    return n*fact(n-1);
}