class outer {
    int parentx = 5;

    void accessToInnerClass(outer obj) {
        outer.inner obj2 = obj.new inner();
        obj2.disp();
        System.out.println(obj2.y);
    }

    private class inner {
       private int y=8;
        void disp() {
            System.out.println("surya" + parentx);

        }
    }
}