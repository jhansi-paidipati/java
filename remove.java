class remove{
    public String rem(String s){
        StringBuilder sb=new StringBuilder();
        boolean[] seen=new boolean[125];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!seen[c])
{
    sb.append(c);
    seen[c]=true;
}        }
return sb.toString();
    }
    public static void main(String args[]){
        String s="aabbcd";
        remove r=new remove();
        String res=r.rem(s);
        System.out.print(res);
    }
}