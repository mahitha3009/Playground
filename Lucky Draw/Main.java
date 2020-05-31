#include<iostream>
int main()
{
  int n,count=0;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      count++;
  }
  if(count==2)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
}
    