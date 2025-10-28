package Easy;

public class DefanginganIPAddressANDinterpret {
    static void main() {
        /*
        Given a valid (IPv4) IP address, return a defanged version of that IP address.
        A defanged IP address replaces every period "." with "[.]".

        Example 1:
        Input: address = "1.1.1.1"
        Output: "1[.]1[.]1[.]1"
         */

        String ip = "1.1.1.1";

        String aa = "G()()()()(al)";

//        System.out.println(defangIPaddr(ip));

        System.out.println(interpret(aa));

    }

    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    static String interpret(String command) {
        String replace = command.replace("()", "o").replace("(al)","al");
        return replace;
    }
}
