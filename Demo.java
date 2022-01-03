import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

/**
 * @Author yolre
 * @Date 2020/07/22
 **/
public class Demo {
    //private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, MalformedURLException, IllegalAccessException, InstantiationException, InvocationTargetException, InterruptedException {
//        new StringBuilder()存在于常量池，append后指向堆对象
//        String s3 = new String(new StringBuilder("计算机").toString());
//        System.out.println(s3.intern()==s3);
//--------------------------------------------------------------------------
//        //4E00-9FA5是基本汉字,只占一个字符，也就是一个char，也就是2字节，也就是16位
//        String s = "一";//Unicode编码:4E00
//        String s1 = "龥";//Unicode编码:9FA5
//        //?是汉字扩展字符,占两个字符，也就是两个char，也就是4字节，也就是32位
//        String s2 = "?";//Unicode编码:20000
//        System.err.println("测试字符s:" + s);
//        System.err.println("测试字符s2:" + s2);
//        System.err.println("测试字符s长度:" +s.length());
//        System.err.println("测试字符s2长度:" +s2.length());
//        System.out.println("s转为二进制:" + Integer.toBinaryString(s.charAt(0)));
//        System.out.println("s2转为二进制:" + Integer.toBinaryString(s2.charAt(0)) + "-" + Integer.toBinaryString(s2.charAt(1)));
//        char c='?';//当我们设置一个占多字符的汉字给char的时候，编译器会报错
//--------------------------------------------------------------------------
        /*
         * 在进行无符号右移位结合赋值操作时，如果对byte或short值进行这样的移位运算，得到的可能不是正确的结果
         * 它们会先被转换成int类型，再进行右移操作，然后被截断，赋值给原来的类型，在这种情况下可能得到-1的结果
         *
         * 移位可与等号(<<=或>>=或>>>=)组合使用。此时，操作符左边的值会移动由右边的值指定的位数，再将得到的结果
         * 赋给左边的变量
         * */
//        System.out.println("---------int类型---------");
//        int i = -1;
//        System.out.println(Integer.toBinaryString(i)+"，"+Integer.toBinaryString(i).length());
//        i >>>= 10;
//        System.out.println(Integer.toBinaryString(i)+"，"+Integer.toBinaryString(i).length());
//        System.out.println("---------long类型---------");
//        long l = -1;
//        System.out.println(Long.toBinaryString(l)+"，"+Long.toBinaryString(l).length());
//        l >>>=10;
//        System.out.println(Long.toBinaryString(l)+"，"+Long.toBinaryString(l).length());
//        System.out.println("---------short类型---------");
//        short s = -1;
//        System.out.println(Integer.toBinaryString(s)+"，"+Integer.toBinaryString(s).length());
//        s >>>= 10;
//        System.out.println(Integer.toBinaryString(s)+"，"+Integer.toBinaryString(s).length());
//        System.out.println("---------byte类型---------");
//        byte b = -1;
//        System.out.println(Integer.toBinaryString(b)+"，"+Integer.toBinaryString(b).length());
//        b >>>= 10;
//        System.out.println(Integer.toBinaryString(b)+"，"+Integer.toBinaryString(b).length());
//        b = -1;
//        System.out.println(Integer.toBinaryString(b)+"，"+Integer.toBinaryString(b).length());
//        System.out.println(Integer.toBinaryString(b>>>10)+"，"+Integer.toBinaryString(b>>>10).length());
//--------------------------------------------------------------------------
//        Random rand = new Random(47);
//        int i = rand.nextInt();
//        int j = rand.nextInt();
//        printBinaryInt("-1",-1);
//        printBinaryInt("1",1);
//        int maxpos = 2147483647;
//        printBinaryInt("maxpos", maxpos);
//        int maxneg = -2147483648;
//        printBinaryInt("maxneg",maxneg);
//        printBinaryInt("i", i);
//        printBinaryInt("~i", ~i);
//        printBinaryInt("-i", -i);
//        printBinaryInt("j", j);
//        printBinaryInt("i & j", i & j);
//        printBinaryInt("i | j", i | j);
//        printBinaryInt("i ^ j", i ^ j);
//        printBinaryInt("i << 5", i << 5);
//        printBinaryInt("i >> 5", i >> 5);
//        printBinaryInt("(~i) >> 5", (~i) >> 5);
//        printBinaryInt("i >>> 5", i >>> 5);
//        printBinaryInt("(~i) >>> 5", (~i) >>> 5);
//
//        System.out.println("---------------------------------------------------------------------------");
//        long l = rand.nextLong();
//        long m = rand.nextLong();
//        printBinaryLong("-1L",-1L);
//        printBinaryLong("+1L",1L);
//        long ll = 9223372036854775807L;
//        printBinaryLong("maxpos", maxpos);
//        long lln = -9223372036854775808L;
//        printBinaryLong("maxneg",maxneg);
//        printBinaryLong("l", l);
//        printBinaryLong("~l", ~l);
//        printBinaryLong("-l", -l);
//        printBinaryLong("m", m);
//        printBinaryLong("l & m", l & m);
//        printBinaryLong("l | m", l | m);
//        printBinaryLong("l ^ m", l ^ m);
//        printBinaryLong("l << 5", l << 5);
//        printBinaryLong("l >> 5", l >> 5);
//        printBinaryLong("(~l) >> 5", (~l) >> 5);
//        printBinaryLong("l >>> 5", l >>> 5);
//        printBinaryLong("(~l) >>> 5", (~l) >>> 5);
//
//    }
//
//    static void printBinaryInt(String s, int i) {
//        System.out.println(s + "，int：" + i + ". binary：\n"+Integer.toBinaryString(i));
//    }
//    static void printBinaryLong(String s,long l){
//        System.out.println(s + "，long：" + l + ". binary：\n"+Long.toBinaryString(l));
//    }
//--------------------------------------------------------------------------
//        Queue<String> queue = new ConcurrentLinkedQueue<>();
//        queue.offer("A1");
//        queue.offer("A2");
//        queue.offer("A3");
//
//        String content = queue.element();
//        System.out.println("被提取的元素："+content);
//        for(String item: queue){
//            System.out.println("剩余元素："+item);
//        }

        //System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
//--------------------------------------------------------------------------
//        int max = 5;
//        //控制行数
//        for(int i = 1; i<=5 ; i++) {
//            //控制空格
//            for (int j = 1; j <= max - i; j++)
//                System.out.print(" ");
//            //控制星数
//            for (int k = 1; k <= i * 2 - 1; k++)
//                System.out.print("*");
//            System.out.println();
//        }
//--------------------------------------------------------------------------

//        int i = G.i;
//        System.out.println(i);
        //System.out.println(new String("a") == "a");
//--------------------------------------------------------------------------
//        URL url = new URL("file:D:/IdeaProjects/Test/src/main/java/TestDemo.jar");
//        URLClassLoader loader = new URLClassLoader(new URL[]{url});
//        Class<?> c = loader.loadClass("TestDemo");
//        Method method = c.getMethod("getMessage", null);
//        Method method1 = c.getMethod("getString", null);
//        method.invoke(c.newInstance());
//        String s = (String) method1.invoke(c.newInstance());
//        System.out.println(s);
//--------------------------------------------------------------------------

//        for (int i = 0; i < 5; i++) {
//            Thread base.thread = new Thread(() -> {
//                lock.lock();
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    lock.unlock();
//                }
//            });
//            base.thread.start();
//        }
//--------------------------------------------------------------------------
//        new MyThread1().start();
//        new MyThread1().start();

//--------------------------------------------------------------------------
//        int num = 10;
//        String str = "hello";
//
//        num = 20;
//        str = "java";
//
//        foo(num); // num 没有被改变
//
//        foo(str); // str 也没有被改变
//
//        //第三个例子：提供了改变自身方法的引用类型
//        StringBuilder sb = new StringBuilder("iphone");
//
//        foo(sb);
//        System.out.println(num);
//        System.out.println(str);
//        System.out.println(sb.toString());
//        System.out.println(System.getProperty("file.encoding"));
//--------------------------------------------------------------------------
        cal(2);
    }

    static int cal(int n) {
        int sum = 0;
        int i = 1;
        int j = 1;
        for (; i <= n; i++) {
            j = 1;
            for (; j <= n; j++) {
                sum = sum + i * j;
            }
        }
        return sum;
    }

//    static void foo(int value) {
//        value = 100;
//    }

    //第二个例子：没有提供改变自身方法的引用类型
//    static void foo(String text) {
//        text = "windows";
//    }

//    static void foo(StringBuilder builder) {
//        builder.append("4");
//    }

//    static void foo(StringBuilder builder) {
//        builder = new StringBuilder("ipad");
//    }

//    private static String buildString(int length) {
//        String str = "";
//        for (int i = 0; i < length; i++) {
//            str += "s";
//        }
//        return str;
//    }

}

//class MyThread extends Thread {
//    public void run() {
//        for (int i = 0; i < 2; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + Math.random());
//        }
//    }
//}

//class MyThread1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 2; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + ThreadLocalRandom.current().nextDouble());
//        }
//    }
//}