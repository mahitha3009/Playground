#include <iostream>
using namespace std;
int main() {
   int n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
      std::cout<<i+1;
    for(int j=1;j<=n-1;j++)
    {
      std::cout<<i;
    }
    if(i%2!=0)
      std::cout<<i+1;
    std::cout<<"\n";
  }
    return 0;
}