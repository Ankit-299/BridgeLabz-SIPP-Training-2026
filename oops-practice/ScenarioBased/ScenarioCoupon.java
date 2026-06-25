// 2. Online Coupon Validator
// An e-commerce website validates discount coupons.
// ● Create an interface CouponValidator containing:
// ○ abstract method validateCoupon(String code)
// ○ static method isLengthValid(String code)
// ● Store coupon codes in a String[].
// ● Implement the interface in a class ShoppingCart.
// Task: Check each coupon from the array and print whether it is valid or
// invalid.
public class ScenarioCoupon {
    public static void main(String[] args) {
        String[] coupons = {"SAVE10", "DISCOUNT20", "INVALIDCOUPON", "FREESHIP", "WELCOME5"};
        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (ShoppingCart.isLengthValid(coupon)) {
                boolean isValid = cart.validateCoupon(coupon);
                System.out.println("Coupon: " + coupon + " is " + (isValid ? "valid" : "invalid"));
            } else {
                System.out.println("Coupon: " + coupon + " is invalid due to length.");
            }
        }
    }
}

interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 5 && code.length() <= 15;
    }
}

class ShoppingCart implements CouponValidator {
    private static final String[] VALID_COUPONS = {"SAVE10", "DISCOUNT20", "FREESHIP", "WELCOME5"};

    @Override
    public boolean validateCoupon(String code) {
        if (code == null) {
            return false;
        }
        for (String valid : VALID_COUPONS) {
            if (valid.equals(code)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLengthValid(String code) {
        return CouponValidator.isLengthValid(code);
    }
}