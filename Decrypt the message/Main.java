#include<iostream>
int main()
{
  int i=1,n1,n2,temp=0;
  std::cin>>n1>>n2;
  int sum=n1+n2;
  while(i<sum)
  {
      if(sum%i==0)
       temp=temp+i;
       i++;
   }
  if(sum==temp)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}