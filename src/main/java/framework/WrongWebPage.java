package framework;

/**
 * Created by Администратор on 29.05.2017.
 */
public class WrongWebPage extends  RuntimeException
{
    public WrongWebPage (String message)
    {
        super(message);
    }

}
