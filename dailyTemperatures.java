class Solution {
public int[] dailyTemperatures(int[] T)
    {

    int i = 0;
    int j = i+1;
    int[] a = new int[T.length];
    int sum = 0;

    while(i<T.length)
    {

        if(j==T.length)
        {
            i++;
            j=i+1;
            sum=0;
        }

        else
        {
            if(T[i]<T[j])
            {
                sum++;
                a[i]=sum;
                i++;
                j=i+1;
                sum=0;
            }
            else
            {
                sum++;
                j++;
            }

        }

    }

    return a;
    }

}



    /*
    public int[] dailyTemperatures(int[] T) {
        HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();


        for(int i=0;i<T.length; i++ )
        {
            a.put(i,T[i]);
        }
        int sum=0;
        for(int i=0;i<T.length; i++ )
        {
            for(int j=i;j<T.length; j++ )
            {
                if(j!=i)
                {

                    if(a.get(j)>T[i])
                    {
                    sum++;
                    T[i] = sum;
                    break;
                    }

                    if(j==T.length-1 && a.get(j)<=T[i])
                    {
                    sum++;
                    T[i] = 0;
                        break;
                    }

                    else if(a.get(j)<=T[i])
                    {
                        sum++;
                    }
                }
            }

                if(i==T.length-1)
                {T[i]=0;}
            sum = 0;
        }

        return T;
    }
    */