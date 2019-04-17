/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospooejercicio.Geometria;

/**
 *
 * @author Default
 */
class FigurasConLados extends Figura {

    protected float altura;
    protected float base;

    public FigurasConLados(float altura, float base) {
        super("blanco");
        this.altura = altura;
        this.base = base;
    }

    public FigurasConLados(String color, float altura, float base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
    
  
    
    //metodo to.string para convertir los objetos a string.
    @Override
    public String toString(){
        return "Rectangulo: " + " , base= " + this.getBase()
                    + ", altura= " + this.getAltura()
                    + ", color= " + this.getColor();
    }
}
