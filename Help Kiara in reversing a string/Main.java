#include <iostream>
int main()
{
char str[20], rev[20];     
int count = 0, end, i;    
std::cin.getline(str,20);
  for(i=0;str[i]!='\0';i++);
  for(i=i-1;i>=0;i--)
   std::cout<<str[i];
}