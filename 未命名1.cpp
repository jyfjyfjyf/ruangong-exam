#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX_SIZE 32767
typedef struct node   //��������������Ľṹ
{
 int id;        //���
 int adr;       //�����׵�ַ
 int size;        //������С
 struct node *next;//ָ����һ��������ָ��
}Node;
Node *head1,*head2,*back1,*back2,*assign;/*head--������������ָ��
                back--ָ���ͷ���Node�ṹ��ָ��
                assign-ָ��������ڴ����Node�ṹ��ָ��*/
int request; //�û�����洢���Ĵ�С�����û����룩
int check(int add,int siz,char c)//���ڼ��ָ�����ͷſ飨���û����룩�ĺϷ���
{
 Node *p,*head;
 int check=1;
 if(add<0||siz<0)
   check=0;/*��ַ�ʹ�С����Ϊ��*/
 if(c=='f'||c=='F')
  head=head1;
 else
  head=head2;
 p=head->next;
 while((p!=NULL)&&check)/*��ַ���ܺͿ��������н������ص�*/
      if(((add<p->adr)&&(add+siz>p->adr))||((add>=p->adr)&&(add<p->adr+p->size)))
         check=0;
      else
         p=p->next;
 if(check==0)
      printf("\t�����ͷ�����ַ���С�д��󣡣���\n");
     return check;  /*���ؼ����*/
}
void init()//��ʼ��������������ͷ�ڵ�Ŀ��ж���ָ�룬
{   //head1ָ��first-fit�Ŀ��ж���ͷ��head2ָ��best-fit�Ŀ��ж���ͷ
 Node *p,*q;
 head1=(Node*)malloc(sizeof(Node));
 head2=(Node*)malloc(sizeof(Node));
 p=(Node*)malloc(sizeof(Node));
 q=(Node*)malloc(sizeof(Node));
 head1->next=p;
 head2->next=q;
 p->size=q->size=MAX_SIZE;
 p->adr=q->adr=0;
 p->next=q->next=NULL;
 p->id=q->id=0;
 }
Node*  assignment1(int num,int req)//ʵ���״���Ӧ�㷨�ķ���
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
  ass->adr=-1;//����ʧ��
 }
 else
 {
 if(after->size==req)
 {//���з���ǡ�õ�����������ڴ��С
  before->next=after->next;
  ass->adr=after->adr;
 }
 else
 {//���з���������������ڴ��С
  after->size-=req;
  ass->adr=after->adr;
  after->adr+=req;
 }
 }
 return ass;
}
void acceptment1(int address,int siz,int rd)//ʵ���״���Ӧ�㷨�Ļ���
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
  if((after==NULL)||((back1->adr<=after->adr)&&(back1->adr>=before->adr)))
  {
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
 {//��ǰ�߷����ϲ�
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
 printf("\t���ȷ����㷨�����ڴ�ɹ�������\n");
 }
 else
  printf("\t���ȷ����㷨�����ڴ�ʧ�ܣ�����\n");
}
Node*  assignment2(int num,int req)//ʵ�������Ӧ�㷨�ķ���
{ Node *before,*after,*ass,*q;
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
  //printf("\nzphzph1\n");
 }
 if(after==NULL)
 {
  ass->adr=-1;//����ʧ��
  //printf("\nzphzph2\n");
 }
 else
 {
  if(after->size==req)
  {//���з���ǡ�õ�����������ڴ��С
   before->next=after->next;
   ass->adr=after->adr;
//printf("\nzphzph3\n");
  }
  else
  {//���з���������������ڴ��С
   q=after;
   before->next=after->next;
   ass->adr=q->adr;
   q->size-=req;
   q->adr+=req;
    //printf("\nzphzph4\n");
 before=head2;
   after=head2->next;
   //printf("\nzphzph4\n");
   if(after==NULL)
   {
    //printf("\nzphzph5\n");
    before->next=q;
    q->next=NULL;
    after=q;
   }
   else
   {//printf("\nzphzph6\n");
    while(after&&((after->size)<(q->size)))
    {printf("\nzphzph7\n");
     before=before->next;
     after=after->next;
    }
//printf("\nzphzph8\n");
    before->next=q;
    q->next=after;
    after=q;
   }
  }
 }
 return (ass);
}
void acceptment2(int address,int siz,int rd)//ʵ�������Ӧ�㷨�Ļ���
{
 Node *before,*after;
 int insert=0;//�Ƿ񱻻��յı�־
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
  //head2->size=back2->size;
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
    after=before->next; }
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
    after=before->next;
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
   if(after==NULL||((after->size>back2->size)&&(before->size<back2->size)))
         {
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
  printf("\t�����Ӧ�㷨�����ڴ�ɹ�������\n");
 else
  printf("\t�����Ӧ�㷨�����ڴ�ʧ�ܣ�����\n");
}
void print(char choice)//���������������Ϣ
{
 Node *p;
 if(choice=='f'||choice=='F')
   p=head1->next;
 else
   p=head2->next;
 if(p)
 {
  printf("\n���������е����Ϊ��\n");
    printf("\t���\t��ַ\t��ַ\t��С\n");
  while(p)
  {
   printf("\t%d\t%d\t%d\t%d\n",p->id,p->adr,p->adr+p->size-1,p->size);
   p=p->next;
  }
 }
 }
void menu()//�˵�����Ҫ����
{
  char chose;
  int ch,num,r,add,rd;
   while(1)
  {
  system("cls");
  printf("\t\t�洢����̬�������估�����㷨ģ��\n\n");
  printf("\tF.������Ӧ�㷨(First-Fit)\n\n");
  printf("\tB.�����Ӧ�㷨(Best-Fit)\n\n");
  printf("\tE.�˳�����\n\n");
  printf("\t��ѡ��f/b��:");
  scanf("%c",&chose);
  if(chose=='e'||chose=='E')
   exit(0);
  else
  {
   system("cls");
   while(1)
  {
    if(chose=='f'||chose=='F')
    printf("\t\t������Ӧ�㷨(First-Fit)ģ��\n\n");
   if(chose=='b'||chose=='B')
    printf("\t\t�����Ӧ�㷨(Best-Fit)ģ��\n\n");
   printf("\t1.�����ڴ�\t\t2.�����ڴ�\n\n");
   printf("\t3.�鿴�ڴ�\t\t4.����\n\n");
   printf("\t��ѡ��1/2/3/4��:");
    scanf("%d",&ch);
   fflush(stdin);
   switch(ch)
   {
   case 1:
    printf("��������ţ�");scanf("%d",&num);
    printf("��������ķ�����С��");scanf("%d",&r);
    if(chose=='f'||chose=='F')
     assign=assignment1(num,r);
    else
     assign=assignment2(num,r);
    if(assign->adr==-1)
    {
     printf("�����ڴ�ʧ�ܣ�\n");
    }
    else
     printf("����ɹ���������ڴ����ַΪ:%d\n",assign->adr);
  break;
   case 2:
    printf("�����ͷŵ��ڴ����ַ��");scanf("%d",&add);
    printf("�����ͷŵ��ڴ�Ĵ�С��");scanf("%d",&r);
    printf("�����ͷŵ��ڴ�ı�ţ�");scanf("%d",&rd);
    if(check(add,r,chose))
    {
     if(chose=='f'||chose=='F')
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
int main()//������
 {
   init();
  menu();
  }
