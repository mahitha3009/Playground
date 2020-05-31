#include<iostream>
#include<math.h>
int main()
{
  int m,n,req;
  std::cin>>m>>n>>req;
  int x=pow(m,n);
  if(x>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
  