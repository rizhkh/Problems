class outerparanthesis {
    public String removeOuterParentheses(String S) {

        Stack<Character> a = new Stack<Character>();
        String b = "";
        for(int i=0;i<S.length(); i++)
        {
            if(!a.empty())
            if(a.peek()=='(')
            {
                if(S.charAt(i)==')')a.pop();
                if(!a.empty())b = b + S.charAt(i);
            }
            if(S.charAt(i)!=')')a.push(S.charAt(i));
        }

        return b;
    }
}