import java.util.*;  
class StrassenMatrix2{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in); 
int i,j,m,n,o,p;
System.out.println("give row length of a ");
m=sc.nextInt();
System.out.println("give column length of a ");
n=sc.nextInt();

System.out.println("give row length of b ");
o=sc.nextInt();

System.out.println("give column length of b ");
p=sc.nextInt();


if(n==o)
{


/*int[][] a=new int[m][n];
int[][] c=new int[o][p]; 
int[][] b=new int[o][p]; */
//int i,j,m,n,o,p;

System.out.println("finding largest element");
int largest1,largest2,largest3;
largest1=n;
largest2=p;
if(m>n)
largest1=m;
if(o>p)
largest2=o;
largest3=largest2;
if(largest1>largest2)
largest3=largest1;


System.out.println("largest element is "+largest3);


int pw2=2;
for(i=1;pw2<largest3;i++)
{
pw2=2*pw2;

}

System.out.println("power is "+pw2);


int[][] a=new int[pw2][pw2];
int[][] c=new int[pw2][pw2]; 
int[][] b=new int[pw2][pw2]; 

   System.out.println("Enter your array a");  
   //int rollno=sc.nextInt();

int count=1;
for(i=0;i<m;i++)
for(j=0;j<n;j++){
a[i][j]=count;
count++;   //sc.nextInt();
}

//int count=0;
System.out.println("take b is");

count=1;
for(i=0;i<o;i++)
for(j=0;j<p;j++){
b[i][j]=count; 
count++; //sc.nextInt();
}


for(i=0;i<pw2;i++)
for(j=0;j<pw2;j++){
//b[i][j]=count; 
System.out.println("a is "+a[i][j]);
}

for(i=0;i<pw2;i++)
for(j=0;j<pw2;j++){
//b[i][j]=count; 
System.out.println("b is "+b[i][j]);
}



c=strassens(a,b,pw2,pw2,pw2,pw2);



//c=base(a,b);


for(i=0;i<m;i++)
for(j=0;j<p;j++)
System.out.println("c is "+c[i][j]);

  
   sc.close();  
 }

else
System.out.println("it is not possible to multiply");  

}

public static int[][] strassens(int a[][],int b[][],int m,int n,int o,int p)
{
int i,j;
int c[][]=new int[o][p];
if(m==2&&n==2&&o==2&&p==2)
{
c=base(a,b);
return c;
}
int a11[][]=new int[m/2][n/2];
int a12[][]=new int[m/2][n/2];
int a21[][]=new int[m/2][n/2];
int a22[][]=new int[m/2][n/2];


int b11[][]=new int[o/2][p/2];
int b12[][]=new int[o/2][p/2];
int b21[][]=new int[o/2][p/2];
int b22[][]=new int[o/2][p/2];


for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
a11[i][j]=a[i][j];


for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
System.out.println("a11 is"+a11[i][j]);




for(i=0;i<m/2;i++)
for(j=n/2;j<n;j++)
a12[i][j-(n/2)]=a[i][j];



for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
System.out.println("a12 is"+a12[i][j]);


for(i=m/2;i<m;i++)
for(j=0;j<n/2;j++)
a21[i-(m/2)][j]=a[i][j];


for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
System.out.println("a21 is"+a21[i][j]);





for(i=m/2;i<m;i++)
for(j=n/2;j<n;j++)
a22[i-(m/2)][j-(n/2)]=a[i][j];




for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
System.out.println("a22 is"+a22[i][j]);



for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
b11[i][j]=b[i][j];


for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
System.out.println("b11 is"+b11[i][j]);




for(i=0;i<m/2;i++)
for(j=n/2;j<n;j++)
b12[i][j-(n/2)]=b[i][j];



for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
System.out.println("b12 is"+b12[i][j]);


for(i=m/2;i<m;i++)
for(j=0;j<n/2;j++)
b21[i-(m/2)][j]=b[i][j];


for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
System.out.println("b21 is"+b21[i][j]);





for(i=m/2;i<m;i++)
for(j=n/2;j<n;j++)
b22[i-(m/2)][j-(n/2)]=b[i][j];




for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
System.out.println("b22 is"+b22[i][j]);


int p1[][]=new int[m/2][n/2];
int p2[][]=new int[m/2][n/2];
int p3[][]=new int[m/2][n/2];
int p4[][]=new int[m/2][n/2];
int p5[][]=new int[m/2][n/2];
int p6[][]=new int[m/2][n/2];
int p7[][]=new int[m/2][n/2];




int s1[][]=new int[m/2][n/2];
int s2[][]=new int[m/2][n/2];
int s3[][]=new int[m/2][n/2];
int s4[][]=new int[m/2][n/2];
int s5[][]=new int[m/2][n/2];
int s6[][]=new int[m/2][n/2];
int s7[][]=new int[m/2][n/2];
int s8[][]=new int[m/2][n/2];
int s9[][]=new int[m/2][n/2];
int s10[][]=new int[m/2][n/2];



s1=subsmatrix(b12,b22,b12.length,b12[0].length,b22.length,b22[0].length);
s2=addmatrix(a11,a12,a11.length,a11[0].length,a12.length,a12[0].length);
s3=addmatrix(a21,a22,a21.length,a21[0].length,a22.length,a22[0].length);
s4=subsmatrix(b21,b11,b21.length,b21[0].length,b11.length,b11[0].length);
s5=addmatrix(a11,a22,a11.length,a11[0].length,a22.length,a22[0].length);
s6=addmatrix(b11,b22,b11.length,b11[0].length,b22.length,b22[0].length);
s7=subsmatrix(a12,a22,a12.length,a12[0].length,a22.length,a22[0].length);
s8=addmatrix(b21,b22,b21.length,b21[0].length,b22.length,b22[0].length);
s9=subsmatrix(a11,a21,a11.length,a11[0].length,a21.length,a21[0].length);
s10=addmatrix(b11,b12,b11.length,b11[0].length,b12.length,b12[0].length);






//p1=addmatrix(a11,b11,a11.length,a11[0].length,b11.length,b11[0].length);


p1=strassens(a11,s1,m/2,m/2,m/2,m/2);
p2=strassens(s2,b22,m/2,m/2,m/2,m/2);
p3=strassens(s3,b11,m/2,m/2,m/2,m/2);
p4=strassens(a22,s4,m/2,m/2,m/2,m/2);
p5=strassens(s5,s6,m/2,m/2,m/2,m/2);
p6=strassens(s7,s8,m/2,m/2,m/2,m/2);
p7=strassens(s9,s10,m/2,m/2,m/2,m/2);



int buf1[][]=new int[m/2][m/2];
int buf2[][]=new int[m/2][m/2];
int buf3[][]=new int[m/2][m/2];
int buf4[][]=new int[m/2][m/2];
int c11[][]=new int[m/2][m/2];
int c12[][]=new int[m/2][m/2];
int c21[][]=new int[m/2][m/2];
int c22[][]=new int[m/2][m/2];




buf1=addmatrix(p5,p4,m/2,m/2,m/2,m/2);
buf2=subsmatrix(buf1,p2,m/2,m/2,m/2,m/2);
c11=addmatrix(buf2,p6,m/2,m/2,m/2,m/2);
c12=addmatrix(p1,p2,m/2,m/2,m/2,m/2);
c21=addmatrix(p3,p4,m/2,m/2,m/2,m/2);
buf3=addmatrix(p5,p1,m/2,m/2,m/2,m/2);
buf4=subsmatrix(buf3,p3,m/2,m/2,m/2,m/2);
c22=subsmatrix(buf4,p7,m/2,m/2,m/2,m/2);

//int c[][]=new int[m][n];



for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
c[i][j]=c11[i][j];


for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
c[i][j+m/2]=c12[i][j];

for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
c[i+m/2][j]=c21[i][j];


for(i=0;i<m/2;i++)
for(j=0;j<n/2;j++)
c[i+m/2][j+m/2]=c22[i][j];




return c;

}

public static int[][] addmatrix(int a[][],int b[][],int m,int n,int o,int p)
{
System.out.println("m is "+m);
System.out.println("n is "+n);
System.out.println("o is "+o);
System.out.println("p is "+p);
int c[][]=new int[m][n];
int i,j;

if(m==o&&n==p)
{
for(i=0;i<m;i++)
for(j=0;j<n;j++)
c[i][j]=a[i][j]+b[i][j];

}
return c;

}




public static int[][] subsmatrix(int a[][],int b[][],int m,int n,int o,int p)
{
System.out.println("m is "+m);
System.out.println("n is "+n);
System.out.println("o is "+o);
System.out.println("p is "+p);
int c[][]=new int[m][n];
int i,j;

if(m==o&&n==p)
{
for(i=0;i<m;i++)
for(j=0;j<n;j++)
c[i][j]=a[i][j]-b[i][j];

}
return c;

}









public static int[][] base(int a[][],int b[][])
{
int p1,p2,p3,p4,p5,p6,p7;
int a11,a12,a21,a22,b11,b12,b21,b22;
int c11,c12,c21,c22;
int[][] c=new int[2][2];

a11=a[0][0];
a12=a[0][1];
a21=a[1][0];
a22=a[1][1];


b11=b[0][0];
b12=b[0][1];
b21=b[1][0];
b22=b[1][1];

p1=a11*(b12-b22);
p2=(a11+a12)*b22;
p3=(a21+a22)*b11;
p4=a22*(b21-b11);
p5=(a11+a22)*(b11+b22);
p6=(a12-a22)*(b21+b22);
p7=(a11-a21)*(b11+b12);


c11=p5+p4-p2+p6;
c12=p1+p2;
c21=p3+p4;
c22=p5+p1-p3-p7;

c[0][0]=c11;
c[0][1]=c12;
c[1][0]=c21;
c[1][1]=c22;



return c;


}

}   