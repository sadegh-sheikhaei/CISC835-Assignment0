public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+"+"+b+"="+new Solution().sum(a, b));
        System.out.println(a+"-"+b+"="+new Solution().diff(a, b));
        System.out.println(a+"*"+b+"="+new Solution().prod(a, b));
    }
}
