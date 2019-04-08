public void doublyLL(Node head)
{
if(head==null)return null;

while(head!=null)
{
hNode temp = head.next;
head.prev = head.next;
head.next = temp;
if(head.prev==null)head.prev=head;

head = head.prev;

}
return head;

}