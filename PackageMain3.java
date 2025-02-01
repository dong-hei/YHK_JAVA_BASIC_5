package section6_pkg;

import section6_pkg.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User uA = new User();
        section6_pkg.b.User uB = new section6_pkg.b.User(); //a.user를 import 했기때문에 b.user는 이렇게 써야함

    }
}
