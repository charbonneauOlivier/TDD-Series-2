
public class BarcodeDataBase
{

    public String getPriceForBarcode(final String barcode)
    {
        if(barcode == null)
            return "Error: Unknown item";
        switch(barcode)
        {
            case "1":
                return "1$";
            case "2":
                return "2$";
            default:
                return "Error: Unknown item";
        }
    }
}
