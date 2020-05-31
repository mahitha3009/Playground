#include<iostream>
int fib(int n)
{
  if(n==1)
    return 0;
  else if(n==2)
    return 1;
  else
    return fib(n-1)+fib(n-2);
}
int main()
{
  int n;
    std::cin>>n;
    int f=fib(n);
    std::cout<<"The term "<<n<<" in the fibonacci series is "<<f;
}