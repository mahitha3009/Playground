#include<iostream>
int main()
{
  int r,c;
  std::cin>>r>>c;
  int m1[r][c];
  int m2[r][c];
  int sum[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>m1[i][j];
    }
}
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>m2[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      sum[i][j]=m1[i][j]+m2[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cout<<sum[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}
  