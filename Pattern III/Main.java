#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(j<i)
        std::cout<<i<<"*";
      else
      std::cout<<i;
    }
    std::cout<<"\n";
  }
  for(int i=n;i>=1;i--)
  {
    for(int j=1;j<=i;j++)
    {
      if(j<i)
      std::cout<<i<<"*";
      else
        std::cout<<i;
    }
    std::cout<<"\n";
  }
}
      