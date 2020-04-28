public class CountCharacterInString {
    public static void main(String[] args) {
        String name = "NGUYEN PHU TRONG";
        char n = 'N';
        int count =0;
        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i)==n){
                count++;
            }
        }
        System.out.println("so ki tu "+n+" trong chuoi la "+count );
    }
}
