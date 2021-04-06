import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.*;

public class SellOneItemTest
{
    private BarcodeReceiver _barcodeReceiver;
    private LcdScreen _lcdScreen;

    @Before
    public void setup()
    {
        final BarcodeDataBase barcodeDatabase = new BarcodeDataBase();
        _lcdScreen = new LcdScreen(barcodeDatabase);
        _barcodeReceiver = new BarcodeReceiver(_lcdScreen);
    }

    @Test
    public void whenBarcodeScanned_ShowPriceOnLcdScreen()
    {
        _barcodeReceiver.onBarcodeReceived("1");
        assertThat(_lcdScreen.getCurrentDisplayPrice(), is(equalTo("1$")));
    }
    
    @Test
    public void whenBarcodeScanned_ShownPriceIsEqualToPriceInDatabase()
    {
        _barcodeReceiver.onBarcodeReceived("2");
        assertThat(_lcdScreen.getCurrentDisplayPrice(), is(equalTo("2$")));
    }

    @Test
    public void whenUnkownBarcodeScanned_ShowErrorOnDisplay()
    {
        _barcodeReceiver.onBarcodeReceived("3");
        assertThat(_lcdScreen.getCurrentDisplayPrice(), is(equalTo("Error: Unknown item")));
    }

    @Test
    public void whenNullBarcodeScanned_ShowErrorOnDisplay()
    {
        _barcodeReceiver.onBarcodeReceived(null);
        assertThat(_lcdScreen.getCurrentDisplayPrice(), is(equalTo("Error: Unknown item")));
    }
}
