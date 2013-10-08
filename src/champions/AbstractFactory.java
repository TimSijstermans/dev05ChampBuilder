package champions;

public abstract class AbstractFactory {
   abstract Champion getChampion(String champion);
   abstract Item getItem(String item);
}