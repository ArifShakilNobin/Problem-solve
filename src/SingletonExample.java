public class SingletonExample{
    public static void main(String[] args) {
//        Singleton s2 = Singleton.getInstance();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Singleton s1 = Singleton.getInstance();
//
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Singleton s2 = Singleton.getInstance();
//            }
//        });
//        t1.start();
//        t2.start();


//        s1.getMessage();
//        if (s1 == s2) {
//            System.out.println("Objects are same");
//        } else {
//            System.out.println("Objects are different");
//        }


        numJewelsInStones numJewelsInStones = new numJewelsInStones();
        numJewelsInStones.numJewelsInStones("aA", "aAAbbbb");
    }
}
