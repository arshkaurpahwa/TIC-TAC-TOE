public class Player{
    private String name;
    private char symbol;
    
    Player (String name,char symbol)                        //CONSTRUCTOR
    {
        setName(name);
        setSymbol(symbol);
    }
    
    public void setName(String name)                       //setter for name
    {
        if(!name.isEmpty())       //empty name set nhi kr skte // aur bhi check lga skte hai jo ap chaho number se start na ho and all
        {
            this.name=name;
        }
    }
    public String getName()                               //getter for name
    {
        return this.name;
    }
    public void setSymbol(char symbol)                     //setter for symbol
    {
        if(symbol!='\0')                               // null ni hona chahiye // aur baki ur choice 
        {
            this.symbol=symbol;
        }
    }

    public char getSymbol()                               // getter for symbol
    {
        return this.symbol;
    }
}