public class BarcodeReceiver
{
    private LcdScreen _lcdScreen;
    private BarcodeDataBase _barcodeDatabase;

    public BarcodeReceiver(final LcdScreen lcdScreen, final BarcodeDataBase barcodeDatabase)
    {
        _lcdScreen = lcdScreen;
        _barcodeDatabase = barcodeDatabase;
    }

    public void onBarcodeReceived(final String barcode)
    {

        _lcdScreen.displayPrice(_barcodeDatabase.getPriceForBarcode(barcode));
    }
}
