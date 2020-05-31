#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int j=11,k=4;
  for(int i=1;i<=n;i++)
  {
    cout<<j*j<<" ";
    j=j+k;
}
}