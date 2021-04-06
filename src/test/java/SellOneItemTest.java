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
}
