#include<iostream>
using namespace std;
int main()
{
  int n,dcount=0,fc,bc,j,temp,a;
  cin>>n;
  int x=n;
  a=n*2;
  int k=(n*(n+1))-n;
  bc=k;
  for(int i=1;i<=x;i++)
  {
    if(dcount==0)
    {
  		for( j=1;j<=n;j++)
          cout<<j<<"*";
            fc=j;
    
      for( j=n+1;j<2*n;j++){
        cout<<k+1<<"*";
        k=k+1;
      }
      k=k+1;
        cout<<k<<endl;
      dcount=dcount+2;
    
      
      
    } 
    else
    {
      
    n=n-1;
      for(j=1;j<=dcount;j++)
       cout<<"-";
      for(int p=1;p<=n;p++){
        cout<<fc<<"*";
        fc=fc+1;
      }
     
      bc=bc-n;
     for(j=1;j<n;j++){
       cout<<bc+1<<"*";
       bc=bc+1;
      }
      bc=bc+1;
      cout<<bc<<endl;
      dcount=dcount+2;
         bc=bc-n;
      }
  }
}