public class BarcodeReceiver
{
    private LcdScreen _lcdScreen;

    public BarcodeReceiver(final LcdScreen lcdScreen)
    {
        _lcdScreen = lcdScreen;
    }

    public void onBarcodeReceived(final String barcode)
    {
        _lcdScreen.displayPriceFor(barcode);
    }
}
