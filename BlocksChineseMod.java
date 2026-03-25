import java.util.Scanner;

public class BlocksChineseMod {
    // Chinese Remainder Theorem for two equations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a1, m1, a2, m2:");
        long a1 = sc.nextLong();
        long m1 = sc.nextLong();
        long a2 = sc.nextLong();
        long m2 = sc.nextLong();

        long g = gcd(m1, m2);
        if((a1 - a2) % g != 0) {
            System.out.println("No solution");
            return;
        }

        long m = m1 * m2 / g;
        long inv = modInverse(m1 / g, m2 / g);
        long x = (a1 + m1 * ((a2 - a1) / g % (m2 / g) * inv % (m2 / g))) % m;
        System.out.println("Solution: x ≡ " + x + " mod " + m);
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long modInverse(long a, long m) {
        long m0 = m, t, q;
        long x0 = 0, x1 = 1;
        if (m == 1) return 0;
        while (a > 1) {
            q = a / m;
            t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }
        if (x1 < 0) x1 += m0;
        return x1;
    }
}