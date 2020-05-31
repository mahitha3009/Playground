#include<iostream>
using namespace std;
int main()
{
  int r,c,row,max;
  cin>>r>>c;
  int a[r][c];
   for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  max=0;
  for(int i=0;i<r;i++)
  {
    int sum1=0;
    for(int j=0;j<c;j++)
    {
      sum1=sum1+a[i][j];     
    }
    cout<<sum1<<" ";
    if(sum1>max){
      max=sum1;
     row=i+1;
    }
    
  }
  cout<<endl<<"Row "<<row<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
   max=0;
   for(int i=0;i<c;i++)
  {
    int sum1=0;
    for(int j=0;j<r;j++)
    {
      sum1=sum1+a[j][i];     
    }
    cout<<sum1<<" ";
    if(sum1>max){
      max=sum1;
     row=i+1;
    }
    
  }
  cout<<endl<<"Column "<<row<<" has maximum sum"<<endl;
}