import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    this.current = start;
  }

  public void reset(){
    current = start;
  }
  public int length(){
    return (end-start)+1;
  }

  public boolean hasNext(){
    if (end >= current){
      return true;
    }
    else{
      return false;
    }
  }

  public int next(){
    int temp = current;
    if (!(hasNext())){
      throw new NoSuchElementException();
    }
    else{
      current = current + 1;
      return temp;
    }
  }

}
