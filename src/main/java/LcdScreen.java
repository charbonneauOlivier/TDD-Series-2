public class LcdScreen
{
    private String _currentDisplayPrice;
    private BarcodeDataBase _barcodeDatabase;

    public LcdScreen(final BarcodeDataBase barcodeDatabase)
    {
        _barcodeDatabase = barcodeDatabase;
    }

    public void displayPriceFor(final String barcode)
    {

        _currentDisplayPrice = _barcodeDatabase.getPriceForBarcode(barcode);
        System.out.println(_currentDisplayPrice);
    }

    public String getCurrentDisplayPrice()
    {
        return _currentDisplayPrice;
    }
}
