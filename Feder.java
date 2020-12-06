public class Feder
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public double Federrate;
    public double Arbeit;
    public double Federweg;
    public double Wt;
    public double Wb;
    public double It;
    public double Ib;
    public double pi;
    public double d;
    public double b;
    public double Mb;
    public double F;
    public double L;
    public double E;
    public double G;
    public double tana;
    public double h;
    public double taob;
    /**
     * Konstruktor für Objekte der Klasse Feder
     */
    public Feder()
    {
        // Instanzvariable initialisieren
        pi = 3.1415926;
        E = 210000; //N/mm2
        G= 80000;
        Mb = F*L;
    }

    public double Arbeit()
    {
        // tragen Sie hier den Code ein
        return Arbeit;
    }
    
    public void FederKreis(double d)
    {
        It=pi*Math.pow(d,4)/32;
        Ib=pi*Math.pow(d,4)/64;
        Wt=pi/16*Math.pow(d,3);
        Wb=pi/32*Math.pow(d,3);
        System.out.println("It="+ It+", Ib="+ Ib+", Wt="+Wt+", Wb="+Wb);
    }
    
    public void FederQuer(double b, double h)
    {
        Ib=Math.pow(b,3)/12;
        Wb=b*Math.pow(b,2)/6;
        System.out.println("Ib="+ Ib+"Wb="+Wb);
    }
    
    public void BiegeFederKreis(double d, double L,double F)
    {
        Ib=pi*Math.pow(d,4)/64;
        Federrate=3*E*Ib/Math.pow(L,3);
        Federweg = F*Math.pow(L,3)/(3*E*Ib);
        System.out.println("c="+Federrate + "s="+ Federweg);
    }
    
    public void BiegeFederQuer(double L, double h, double b,double F)
    {
        tana = 6*F*Math.pow(L,2)/(E*b*Math.pow(h,3));
        Ib=Math.pow(b,3)/12;
        Federrate = E*b*Math.pow(h,3)/(4*Math.pow(L,3));
        Federweg = 4*F*Math.pow(L,3)/(E*b*Math.pow(h,3));
        System.out.println("c="+Federrate + " s="+ Federweg+" tana="+tana);
    }
    
    public double FederkraftKreis(double Wb,double L)
    {
        taob=Mb/Wb;
        return F;
    }
}
