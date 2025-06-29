package com.fiit.access;

class UnConditional {
    void breakDemo() {
        System.out.println("Begin the break demo");
        for(int i=1;i<5;i++){
            System.out.println("i="+i);
            if(i==5){
                break;
            }
        }
        System.out.println("End the break demo");
    }
    void continueDemo() {
        System.out.println("Begin the continue demo");
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println("i="+i);
        }
        System.out.println("End the continue demo");
    }
    void returnDemo() {
        System.out.println("Begin the return demo");
        for(int i=1;i<=10;i++){
            if(i==5){
                return;
            }
            System.out.println("i="+i);
        }
        System.out.println("End the return demo");
    }
}

public class BreakContinueReturn {
    public static void main(String[] args) {
        UnConditional unconditional = new UnConditional();
        unconditional.returnDemo();
    }
}
