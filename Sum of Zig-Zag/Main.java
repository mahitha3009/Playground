#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,s=0;
    cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      if(i+j==n-1)
        s=s+a[i][j];
  i=0;
    for(j=0;j<n;j++)
    {
      if(j!=n-1)
        s=s+a[i][j];
    }
   i=n-1;
    for(j=1;j<n;j++)
    {
        s=s+a[i][j];
    }
  cout<<"Sum of Zig-Zag pattern is "<<s;       
}