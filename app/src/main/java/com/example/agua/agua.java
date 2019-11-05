package com.example.agua;

public class agua {
    double metros;
    double agua;
    double aseo;
    double local1;
    double local2;
    double local3;
    double local4;
    double resul1;
    double resul2;
    double resul3;
    double resul4;
    double resul5;
    double calcular;
    int a = 4;

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public void setAseo(double aseo) {
        this.aseo = aseo;
    }

    public void setLocal1(double local1) {
        this.local1 = local1;
    }

    public void setLocal2(double local2) {
        this.local2 = local2;
    }

    public void setLocal3(double local3) {
        this.local3 = local3;
    }

    public void setLocal4(double local4) {
        this.local4 = local4;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }


    public double getAgua() {
        return agua;
    }

    public double getAseo() {
        return aseo;
    }

    public double getLocal1() {
        return local1;
    }

    public double getLocal2() {
        return local2;
    }

    public double getLocal3() {
        return local3;
    }

    public double getLocal4() {
        return local4;
    }

    public double getMetros() {
        return metros;
    }


    // public double getCalcular() {
    //  resul1 = getAgua() / getMetros() * getLocal1();

    //  resul2 = getAgua() / getMetros() * getLocal2();

    //  resul3 = getAgua() / getMetros() * getLocal3();

    //  resul4 = getAgua() / getMetros() * getLocal4();

    //  resul5 = getAseo() / 4;

    //  return calcular;
    //}

    public double calcu1() {
        resul1 = getAgua() / getMetros() * getLocal1();
        return resul1;
    }
    public double calcu2() {
        resul2 = getAgua() / getMetros() * getLocal2();
        return resul2;
    }
    public double calcu3() {
        resul3 = getAgua() / getMetros() * getLocal3();

        return resul3;
    }
    public double calcu4() {
        resul4 = getAgua() / getMetros() * getLocal4();
        return resul4;
    }

    public double aguaresul() {
        resul5 = getAseo()/ 4;
        return resul5;
    }
}

