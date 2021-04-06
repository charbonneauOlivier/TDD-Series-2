
public class BarcodeDataBase
{

    public String getPriceForBarcode(final String barcode)
    {
        switch(barcode)
        {
            case "2":
                return "2$";
            default:
                return "1$";
        }
    }
}
