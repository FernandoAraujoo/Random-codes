public class reconhecimentoToken{
    public static void main(String[] args) {
        TOKEN getrelop(){
            TOKEN retToken = new(RELOP);
            itsLetter(char L) ={a,b,c,...,z};
            itsLetter(char D) ={a,b,c,...,z};
            while(1){
                switch(state){
                    case 0: c = nextChar();
                        if(Character.isLetter(c)) state =1;
                        else if (c=="D") state=1;
                        else if (c!="L" && c!="D") state=2;
                        else fail();
                    case 1: c = nextChar();
                        if(c == "L" ) state =1;
                        else if(c== "L") state =1;
                        else if (c!="L" && c!="D") state=2;
                        else fail();
                }
            }
    }
}