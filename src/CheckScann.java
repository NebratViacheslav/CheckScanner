public class CheckScann {
    public static void main(String[] args) {
        SavedName savedName = new SavedName();
        String users1Name = savedName.getUsersName();
        if (!"".equals(users1Name) ) {
            System.out.println("Hello user " + users1Name + "!!!");
        }else{
        New num = new New();
        num.Hello();
        }
    }
}