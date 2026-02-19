class example {
    static String college="HICET";
    String name;
    example(String name){
        this.name=name;
    }
    public void disp(){
        System.out.println(name+" Studies @"+college);
    }

    public static void main() {
//        String name="Ramya";
        example obj=new example("lona");
        obj.disp();
    }
}
