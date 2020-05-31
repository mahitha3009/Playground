#include<iostream>
using namespace std;
int main()
{
  int r;
  cin>>r;
  int a[r][r];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<r;j++)
    {
      cin>>a[i][j];
    }
  }
  int n1=a[0][0]+a[r-1][r-1];
  int n2=a[0][r-1]+a[r-1][0];
  if(n1==n2)
    cout<<"Yes";
  else
    cout<<"No";
}
  

