#include<iostream>
int main()
{
   int r,c;
  std::cin>>r>>c;
  int s[r][c],s1[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>s[i][j];
    }
  }
  if(r==c)
  {
   for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      s1[i][j]=s[j][i];
      std::cout<<s1[i][j]<<" ";
    }
     std::cout<<"\n";
   }
}
  else
  {
    for(int i=0;i<c;i++)
    {
      for(int j=0;j<r;j++)
      {
        s1[i][j]=s[j][i];
        std::cout<<s1[i][j]<<" ";
      }
      std::cout<<"\n";
    }
  }
}