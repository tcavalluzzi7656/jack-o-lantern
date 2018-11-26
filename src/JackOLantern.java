
public class JackOLanter  {
    String [][] faceFeatures;

    public JackOLanter (String [][] faceFeatures,int row, int column)
    {
        this.faceFeatures = faceFeatures;
    }



    public void edit(String replace, int row, int column)
    {
        faceFeatures [row] [column] = replace;
    }




    public void fill(String replace, int row, int column)
    {
        for (int i=0;i< faceFeatures.length;i++)
        {

        }
    }


}
