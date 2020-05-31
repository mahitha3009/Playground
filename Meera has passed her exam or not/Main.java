#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  int key;
  std::cin>>key;
  for(int i=0;i<n;i++)
  {
    if(a[i]==key)
    {
      std::cout<<"She passed her exam";
      return 0;
    }
}
  std::cout<<"She failed";
}