public class LcdScreen
{
    private String _currentDisplayPrice;

    public LcdScreen()
    {
    }

    public void displayPrice(final String price)
    {
        _currentDisplayPrice = price;
        System.out.println(price);
    }

    public String getCurrentDisplayPrice()
    {
        return _currentDisplayPrice;
    }
}
