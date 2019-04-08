public class Solution{

public ListNode plusOne(ListNode head)
{
    
   String a = "";
    
    ListNode t1 = head;
    
    while(t1!=null)
    {
        a = a + t1.val;
        t1=t1.next;
    }
    int sum = Integer.parseInt(a);
    sum=sum+1;
    a= "";
    a=""+ sum;
    ListNode d = head;
    ListNode e = d;
    for(int i=0;i<a.length();i++)
    {
        int abc = Character.getNumericValue( a.charAt(i) );
       d.val = abc;
        //d.next = new ListNode(abc);
        d=d.next;
    }
    
    return e;
    
/*
	ListNode dummy = new ListNode(0);
	dummy.next = head; // e.g if 1,2,3 -> 0,1,2,3
	ListNode i = dummy;
	ListNode j = dummy;

	while(j.next!=null)
    {
        j=j.next;
        if(j.val!=9)
        {
            i=j;
        }
    }

    if(j.val!=9)
    {
        j.val++;
    }
    
    else
    {
        i.val++;
        i=i.next;
        while(i!=null)
        {
             i.val=0;
            i=i.next;
        }
    }

    if(dummy.val==0)
    {return dummy.next;}
    
    return dummy;
    */
}

}
