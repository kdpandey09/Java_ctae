package Access_modifiers;

class twelfth {

    public static void main(String[] args) {
        modifiers B = new modifiers();
        B._default_();
        B._public_();
        B._protected_();

    }
}

public class modifiers {
    void _default_() {
        System.out.println("This is a Default access modifier");
    }

    public void _public_() {
        System.out.println("This is a Public access modifier");
    }

    private void _private_() {
        System.out.println("This is a Private access modifier");
    }

    protected void _protected_() {
        System.out.println("This is a Protected access modifier");
    }
}
