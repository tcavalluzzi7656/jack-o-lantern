
public class JackOLantern  {
    String [][] faceFeatures;

    public JackOLantern (String [][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }



    public void edit(String replace, int row, int column)
    {
        faceFeatures [row] [column] = replace;
    }




    public void fill(String str)
    {
        for (int x=0;x< faceFeatures.length;x++)
        {
            for(int y=0;y<faceFeatures[x].length;y++)
            {
                faceFeatures[x][y]=str;
            }
        }
    }

    public String toString()
    {

        for (int z=0;z<faceFeatures.length;z++)
        {
            String line="";
            for (int q=0;q<faceFeatures[z].length;q++)
            {
                line= line + faceFeatures[z][q];
            }
            System.out.println(line);
        }

        return "";
    }


}
