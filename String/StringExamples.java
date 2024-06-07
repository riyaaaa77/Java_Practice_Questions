class StringExample{
    public static void main(String [] args)
    {
        String s = new String("Hello");
        String s1 = new String("hy");

        System.out.println(s.equals(s1));
        System.out.println(s.length());
        System.out.println(s1.length());
        System.out.println(s.charAt(4));
        System.out.println(s1.charAt(1));
        System.out.println(s.toLowerCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s1.toUpperCase());

        char c [] = s.toCharArray();
        for(char i : c)
        {
            System.out.print(i + " ");
        }

    }
}