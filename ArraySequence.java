import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  public ArraySequence(int [] other){
    data = new int[other.length];
    int i = 0;
    while (i < other.length){
      data[i] = other[i];
      i += 1;
    }
  }

  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    int i = 0;
    while (otherseq.hasNext()){
      data[i] = otherseq.next();
      i += 1;
    }
    otherseq.reset();
  }






  public void reset(){
    currentIndex = 0;
  }
  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    if (data.length > currentIndex){
      return true;
    }
    else{
      return false;
    }
  }

  public int next(){
    int temp = data[currentIndex];
    if (!(hasNext())){
      throw new NoSuchElementException();
    }
    else{
      currentIndex = currentIndex + 1;
      return temp;
    }
  }

}
