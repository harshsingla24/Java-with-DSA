package Milestone3.OOPS3_Generics;

public class Pair<T,S>
{

    private T first;
    private S second;

    Pair(T first, S second) 
    {
        this.first = first;
        this.second = second;
    }

    Pair(){
        
    }
    public T getFirst() 
    {
        return first;
    }

    public void setFirst(T first) 
    {
        this.first = first;
    }

    public S getSecond() 
    {
        return second;

    }

    public void setSecond(S second) 
    {
        this.second = second;
    }


}
