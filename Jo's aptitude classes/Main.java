#include<iostream>
  int gcd_two(int a,int b);
int main()
{
  int a,b,c,ans;
   int small=0;
    int gcd=0;
  std::cin>>a>>b>>c>>ans;
  if(a<b && a<c)
      small=a;
    else if(b<a && b<c)
      small=b;
  else
    small=c;
    while(small>=1)
    {
      if(a%small==0 && b%small==0 && c%small==0)
      {
        gcd=small;
        break;
      }
      small--;
   }
  if(small==ans)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}
  
    
    