/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.services;

/**
 *
 * @author Jessica Arroliga
 */
public class CarteraCobro {
    double ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO;
    String Carnet;
    String NombreCompleto;
    String Aula;
    String EstudioIS;
    String EstudioIIS;
    double PagadoEnero;
    double PagadoFebrero;
    double PagadoMarzo;
    double PagadoAbril;
    double PagadoMayo;
    double PagadoJunio;
    double PagadoJulio;
    double PagadoAgosto;
    double PagadoSeptiembre;
    double PagadoOctubre;
    double PagadoNoviembre;
    double PagadoDiciembre;
    
    double DebeEnero;
    double DebeFebrero;
    double DebeMarzo;
    double DebeAbril;
    double DebeMayo;
    double DebeJunio;
    double DebeJulio;
    double DebeAgosto;
    double DebeSeptiembre;
    double DebeOctubre;
    double DebeNoviembre;
    double DebeDiciembre;
    
    public CarteraCobro(double ENERO, double FEBRERO, double MARZO, double ABRIL, double MAYO, double JUNIO, String Carnet, String NombreCompleto) {
        this.ENERO = ENERO;
        this.FEBRERO = FEBRERO;
        this.MARZO = MARZO;
        this.ABRIL = ABRIL;
        this.MAYO = MAYO;
        this.JUNIO = JUNIO;
        this.Carnet = Carnet;
        this.NombreCompleto = NombreCompleto;
    }

    public CarteraCobro() {
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String Aula) {
        this.Aula = Aula;
    }

    public String getEstudioIS() {
        return EstudioIS;
    }

    public void setEstudioIS(String EstudioIS) {
        this.EstudioIS = EstudioIS;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }
    
    
    public double getENERO() {
        return ENERO;
    }

    public void setENERO(double ENERO) {
        this.ENERO = ENERO;
    }

    public double getFEBRERO() {
        return FEBRERO;
    }

    public void setFEBRERO(double FEBRERO) {
        this.FEBRERO = FEBRERO;
    }

    public double getMARZO() {
        return MARZO;
    }

    public void setMARZO(double MARZO) {
        this.MARZO = MARZO;
    }

    public double getABRIL() {
        return ABRIL;
    }

    public void setABRIL(double ABRIL) {
        this.ABRIL = ABRIL;
    }

    public double getMAYO() {
        return MAYO;
    }

    public void setMAYO(double MAYO) {
        this.MAYO = MAYO;
    }

    public double getJUNIO() {
        return JUNIO;
    }

    public void setJUNIO(double JUNIO) {
        this.JUNIO = JUNIO;
    }

    public String getEstudioIIS() {
        return EstudioIIS;
    }

    public void setEstudioIIS(String EstudioIIS) {
        this.EstudioIIS = EstudioIIS;
    }

    public double getPagadoEnero() {
        return PagadoEnero;
    }

    public void setPagadoEnero(double PagadoEnero) {
        this.PagadoEnero = PagadoEnero;
    }

    public double getPagadoFebrero() {
        return PagadoFebrero;
    }

    public void setPagadoFebrero(double PagadoFebrero) {
        this.PagadoFebrero = PagadoFebrero;
    }

    public double getPagadoMarzo() {
        return PagadoMarzo;
    }

    public void setPagadoMarzo(double PagadoMarzo) {
        this.PagadoMarzo = PagadoMarzo;
    }

    public double getPagadoAbril() {
        return PagadoAbril;
    }

    public void setPagadoAbril(double PagadoAbril) {
        this.PagadoAbril = PagadoAbril;
    }

    public double getPagadoMayo() {
        return PagadoMayo;
    }

    public void setPagadoMayo(double PagadoMayo) {
        this.PagadoMayo = PagadoMayo;
    }

    public double getPagadoJunio() {
        return PagadoJunio;
    }

    public void setPagadoJunio(double PagadoJunio) {
        this.PagadoJunio = PagadoJunio;
    }

    public double getPagadoJulio() {
        return PagadoJulio;
    }

    public void setPagadoJulio(double PagadoJulio) {
        this.PagadoJulio = PagadoJulio;
    }

    public double getPagadoAgosto() {
        return PagadoAgosto;
    }

    public void setPagadoAgosto(double PagadoAgosto) {
        this.PagadoAgosto = PagadoAgosto;
    }

    public double getPagadoSeptiembre() {
        return PagadoSeptiembre;
    }

    public void setPagadoSeptiembre(double PagadoSeptiembre) {
        this.PagadoSeptiembre = PagadoSeptiembre;
    }

    public double getPagadoOctubre() {
        return PagadoOctubre;
    }

    public void setPagadoOctubre(double PagadoOctubre) {
        this.PagadoOctubre = PagadoOctubre;
    }

    public double getPagadoNoviembre() {
        return PagadoNoviembre;
    }

    public void setPagadoNoviembre(double PagadoNoviembre) {
        this.PagadoNoviembre = PagadoNoviembre;
    }

    public double getPagadoDiciembre() {
        return PagadoDiciembre;
    }

    public void setPagadoDiciembre(double PagadoDiciembre) {
        this.PagadoDiciembre = PagadoDiciembre;
    }

    public double getDebeEnero() {
        return DebeEnero;
    }

    public void setDebeEnero(double DebeEnero) {
        this.DebeEnero = DebeEnero;
    }

    public double getDebeFebrero() {
        return DebeFebrero;
    }

    public void setDebeFebrero(double DebeFebrero) {
        this.DebeFebrero = DebeFebrero;
    }

    public double getDebeMarzo() {
        return DebeMarzo;
    }

    public void setDebeMarzo(double DebeMarzo) {
        this.DebeMarzo = DebeMarzo;
    }

    public double getDebeAbril() {
        return DebeAbril;
    }

    public void setDebeAbril(double DebeAbril) {
        this.DebeAbril = DebeAbril;
    }

    public double getDebeMayo() {
        return DebeMayo;
    }

    public void setDebeMayo(double DebeMayo) {
        this.DebeMayo = DebeMayo;
    }

    public double getDebeJunio() {
        return DebeJunio;
    }

    public void setDebeJunio(double DebeJunio) {
        this.DebeJunio = DebeJunio;
    }

    public double getDebeJulio() {
        return DebeJulio;
    }

    public void setDebeJulio(double DebeJulio) {
        this.DebeJulio = DebeJulio;
    }

    public double getDebeAgosto() {
        return DebeAgosto;
    }

    public void setDebeAgosto(double DebeAgosto) {
        this.DebeAgosto = DebeAgosto;
    }

    public double getDebeSeptiembre() {
        return DebeSeptiembre;
    }

    public void setDebeSeptiembre(double DebeSeptiembre) {
        this.DebeSeptiembre = DebeSeptiembre;
    }

    public double getDebeOctubre() {
        return DebeOctubre;
    }

    public void setDebeOctubre(double DebeOctubre) {
        this.DebeOctubre = DebeOctubre;
    }

    public double getDebeNoviembre() {
        return DebeNoviembre;
    }

    public void setDebeNoviembre(double DebeNoviembre) {
        this.DebeNoviembre = DebeNoviembre;
    }

    public double getDebeDiciembre() {
        return DebeDiciembre;
    }

    public void setDebeDiciembre(double DebeDiciembre) {
        this.DebeDiciembre = DebeDiciembre;
    }
    
    
    
}
