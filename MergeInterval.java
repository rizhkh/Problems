class MergeInterval {
    static int counter = 0;
    public int[][] merge(int[][] intervals) {

    HashMap<Integer,String> a = new HashMap<Integer,String>();
    int[][] b = new int[1][2];
    int[][] temparr = new int[intervals.length][2];
    //for(int i=0;i<intervals.length(); i++)
    int check=0;
        int i=0;
    while(i<intervals.length)
    {
            if(i!=0)
            {
                if(check==1)
                {
                    if(intervals[i][0]>=b[0][0] && intervals[i][0]<=b[0][1])
                    {
                        temparr[counter][0] = intervals[i][0];
                        temparr[counter][1] = intervals[i][1];
                        b[0][0] = b[0][0];
                        b[0][1] = intervals[i][1];
                        //a.put(counter,s);
                        counter++;
                    }
                    else
                    {
                        check = 0;
                        temparr[counter][0] = intervals[i][0];
                        temparr[counter][1] = intervals[i][1];
                        counter++;
                        i++; //Jumps a position so the next position compares with the position that is skipped and not that is already processes
                    }
                }

                // 2>=1          &&     2<=3
                if(intervals[i][0]>=intervals[i-1][0] && intervals[i][0]<=intervals[i-1][1]  && check!=1) //if overlap then add that one in hashset
                {
                    temparr[counter][0] = intervals[i-1][0];
                    temparr[counter][1] = intervals[i][1];
                    b[0][0] = intervals[i-1][0];
                    b[0][1] = intervals[i][1];
                    counter++;
                    check=1;
                }

                else //add current set that does not overlap
                {
                    temparr[counter][0] = intervals[i][0];
                    temparr[counter][1] = intervals[i][1];
                    counter++;
                }
            }
        i++;
    }

    int[][] narray = new int[counter][2];
        for(int j=0;j<counter;j++)
        {
            narray[j][0] = temparr[j][0];
            narray[j][1] = temparr[j][1];
        }


        return narray;
    }
}