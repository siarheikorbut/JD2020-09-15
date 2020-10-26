package by.it.siarheikorbut.jd01_10;

/**
 * @author Siarhei Korbut
 * @see <a href="https://drive.google.com/file/d/1NWv3k35f7iqw1vwxeZLH85PcjVS1L_6X/view?usp=sharing">Задание JD01_10 ( A )</a>
 */

public class Bean {
    @Param(a = 5, b = 8)
    static double sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    @Param(a = 333, b = 666)
    static double max(int a, int b) {
        return Math.max(a, b);
    }

    @Param(a = 345, b = 456)
    double min(int a, int b) {
        return Math.min(a, b);
    }

    double avg(int a, int b) {
        return (a + b) / 2.0;
    }
}