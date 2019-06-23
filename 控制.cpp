#include<iostream>
#include<string>
using namespace std;
#define MAX_SIZE 32767
typedef struct node {
int id;
int adr;
int size;
struct node *next;
}Node;
Node *head1,*head2,*back1,*back2,*assign;
int request;
int check(int add,int siz,char c)//���ڼ��ָ�����ͷſ飨���û����룩�ĺϷ���
{
Node *p,*head;
int check=1;
if(add<0||siz<0)
   check=0;/*��ַ�ʹ�С����Ϊ��*/
if(c=='a'||c=='A')
   head=head1;
else
  head=head2;
   p=head->next;
while((p!=NULL)&&check)
if(((add<p->adr)&&(add+siz>p->adr))||((add>=p->adr)&&(add<p->adr+p->size))) 
	check=0;
else
   p=p->next;
if(check==0)
      cout<<"\t�����ͷ�����ַ���С�д��󣡣���";
   return check;
}
void init()
{
  Node *p;
   head1=(Node*)malloc(sizeof(Node));// ��ʼ�����н�������ͷ���
   head2=(Node*)malloc(sizeof(Node));
   p=(Node*)malloc(sizeof(Node));
   head1->next=p;
   head2->next=p;
   p->size=MAX_SIZE;
   p->adr=0;
   p->next=NULL;
   p->id=0;
}
Node* assignment1(int num,int req)//ʵ��First Fit Algorithm
{
   Node *before,*after,*ass;
   ass=(Node*)malloc(sizeof(Node));
   before=head1;
   after=head1->next;
    ass->id=num;
    ass->size=req;
while(after->size<req)
{
    before=before->next;
    after=after->next;
}
if(after==NULL)
{
   ass->adr=-1;
}
else
{
if(after->size==req)
{
   before->next=after->next;
   ass->adr=after->adr;
}
else
{
  after->size-=req;
  ass->adr=after->adr;
  after->adr+=req;
}
}
   return ass;
}
void acceptment1(int address,int siz,int rd)//ʵ��First Fit Algorithm�Ļ����㷨
{
  Node *before,*after;
   int insert=0;
    back1=(Node*)malloc(sizeof(Node));
   before=head1;
   after=head1->next;
   back1->adr=address;
   back1->size=siz;
   back1->id=rd;
   back1->next=NULL;
while(!insert&&after)
{//��Ҫ�����յķ������������������ַ��С��С������룩
    if((after==NULL)||((back1->adr<=after->adr)&&(back1->adr>=before->adr))) {
    before->next=back1;
    back1->next=after;
    insert=1;
}
else
{
   before=before->next;
   after=after->next;
}
}
if(insert)
{
    if(back1->adr==before->adr+before->size)
{ //��ǰ�߷����ϲ�
    before->size+=back1->size;
    before->next=back1->next;
  free(back1);
}
else if(after&&back1->adr+back1->size==after->adr)
{//�ͺ�߷����ϲ�
   back1->size+=after->size;
   back1->next=after->next;
   back1->id=after->id;
  free(after);
   after=back1;
}
  cout<<"\t������Ӧ�㷨�����ڴ�ɹ���";
}
else
  cout<<"\t������Ӧ�㷨�����ڴ�ʧ�ܣ�";
}
Node* assignment2(int num,int req)//ʵ��Best Fit Algorithm
{
   Node *before,*after,*ass,*q;
   ass=(Node*)malloc(sizeof(Node));
   q=(Node*)malloc(sizeof(Node));
    before=head2;
   after=head2->next;
    ass->id=num;
    ass->size=req;
while(after->size<req)
{
   before=before->next;
    after=after->next;
}
if(after==NULL)
{
    ass->adr=-1;
}
else
{
    if(after->size==req)
{
    before->next=after->next;
    ass->adr=after->adr;
}
else
{
   q=after;
   before->next=after->next;
   ass->adr=q->adr;
   q->size-=req;
   q->adr+=req;
   before=head2;
   after=head2->next;
  if(after==NULL)
{
     before->next=q;
     q->next=NULL;
}
else
{
    while((after->size)<(q->size))
{
       before=before->next;
       after=after->next;
}
  before->next=q;
  q->next=after;
}
}
}
return (ass);
}
void acceptment2(int address,int siz,int rd) //ʵ��Best Fit Algorithm�Ļ����㷨
{
Node *before,*after;
  int insert=0;
   back2=(Node*)malloc(sizeof(Node));
   before=head2;
   after=head2->next;
   back2->adr=address;
   back2->size=siz;
   back2->id=rd;
    back2->next=NULL;
if(head2->next==NULL)
{//���ж���Ϊ��
    head2->next=back2;
    head2->size=back2->size;
}
   else
{//���ж��в�Ϊ��
      while(after)
{
if(back2->adr==after->adr+after->size) 
{//��ǰ�߿��з����ϲ�
    before->next=after->next;
      after->size+=back2->size;
     back2=after;
}
else
{
    before=before->next;
     after=after->next;
}
}
    before=head2;
   after=head2->next;
while(after)
{
     if(after->adr==back2->adr+back2->size) 
	 {//�ͺ�߿������ϲ�
       before->next=after->next;
       back2->size+=after->size;
}
else
{
    before=before->next;
    after=after->next;
}
}
    before=head2;
    after=head2->next;
    while(!insert)
{//�������յĿ���뵽ǡ����λ�ã���������С��С����
       if(after==NULL||((after->size>back2->size)&&(before->size<back2->size))) {
          before->next=back2;
           back2->next=after;
             insert=1;
               break;
}
else
{
       before=before->next;
       after=after->next;
}
}
}
if(insert)
    cout<<"\t�����Ӧ�㷨�����ڴ�ɹ���";
else
    cout<<"\t�����Ӧ�㷨�����ڴ�ʧ�ܣ���";
}
void print(char choice)//���������������Ϣ,��ӡ����������
{
Node *p;
if(choice=='a'||choice=='A')
    p=head1->next;
else
   p=head2->next;
if(p)
{
  cout<<"\n���������е����Ϊ��"<<endl;
   cout<<"\t���\t��ַ\t��ַ\t��С"<<endl;
while(p)
{
    cout<<"\t"<<p->id<<"      "<<p->adr<<"      "<<p->adr+p->size-1<<"      "<<p->size<<endl; 
	p=p->next;
}
}
}
void menu()//�˵�����Ҫ����
{
   char chose;
   int ch,r,add,rd;
   int num=0;
while(1)
{
    system("cls");
   cout<<"ѡ��������Ӧ�㷨������A��ѡ�������Ӧ�㷨������B���˳�����������E\n\n"; 
   cout<<"���������:";
    cin>>chose;
if(chose=='e'||chose=='E')
exit(0);
else
{
   system("cls");
while(1)
{
if(chose=='a'||chose=='A')
    cout<<"������Ӧ�㷨(First-Fit)ģ��:\n";
if(chose=='b'||chose=='B')
     cout<<"�����Ӧ�㷨(Best-Fit)ģ��:\n";
      cout<<"1.�����ڴ�,2.�����ڴ�,3.�鿴�ڴ�,4.����\n\n";
      cout<<"���������:";
      cin>>ch;
fflush(stdin);
switch(ch)
{
case 1:
cout<<"������������Ĵ�С��"<<endl;
   cin>>r;
if(chose=='a'||chose=='A')
    assign=assignment1(num,r);
else
    assign=assignment2(num,r);
if(assign->adr==-1)
{
     cout<<"�ռ䲻�㣬�����ڴ�ʧ�ܣ�\n";
}
else
     cout<<"����ɹ���������ڴ����ַΪ:"<<assign->adr<<endl;
break;
case 2:
   cout<<"�����ͷŵ��ڴ����ַ��"<<endl;
   cin>>add;
   cout<<"�����ͷŵ��ڴ�Ĵ�С��"<<endl;
   cin>>r;
   cout<<"�����ͷŵ��ڴ�ı�ţ�"<<endl;
   cin>>rd;
if(check(add,r,chose)) 
{
    if(chose=='a'||chose=='A') 
		acceptment1(add,r,rd); 
	else
        acceptment2(add,r,rd);
}
break;
case 3:
    print(chose);
break;
case 4:
     menu();
break;
}
}
}
}
}
void main()//������ 
{
  init();
  menu();
