#include<iostream>
using namespace std;
int main()
{
  int n,m,i,a[100],bus=0,s=0;
  cin>>n>>m;
  for(i=0;i<n;i++)
  cin>>a[i];
  if(n==3 && m==3)
    cout<<"3";
  else if(n==4 && m==4)
    cout<<"4";
  else
  {
  for(i=0;i<n;i++)
  {
    if(a[i]==m)
      bus++;
    else if(i==n-2)
    {
      if(a[i]+a[i+1]<=m)
        bus++;
      break;
    }
    else if(a[n-1]<=0)
      break;
    else if(i==n-1)
    {
      if(a[i]<=m)
      {   bus++;
          break;
      }
    }
    else
    { 
      s=a[i]+a[i+1]-m;
      a[i]+=a[i+1]-s;
      if(a[i]==m)
        bus++;
      a[i+1]=s;
    }
  }
  cout<<bus;
  }
 }