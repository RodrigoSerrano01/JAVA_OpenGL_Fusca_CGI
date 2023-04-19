package FuscaOpenGL.Service.Fusca.Carroceria;

import FuscaOpenGL.Service.GeradorDeFormas.GerarFormasNaTela;
import FuscaOpenGL.Model.Circulo;
import com.jogamp.opengl.GL2;

public abstract class Carroceria  {




    public static void cria(GL2 gl) {

        //Carroceria
        GerarFormasNaTela gerador = new GerarFormasNaTela();

        Circulo primeraParte = new Circulo(0,0,0,0,
                0.0f, -0.0f, 0.0f,
                2.0f,2.5f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarCirculo(primeraParte,gl, 1);


        Circulo segundaParte = new Circulo(0,0,0,0,
                -0.05f, 0.29f, 0.0f,
                1.3f,1.0f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarCirculo(segundaParte,gl, 1);

        Circulo terceiraParte = new Circulo(0,0,0,0,
                -0.37f, 0.0f, 0.0f,
                1.2f,1.5f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarCirculo(terceiraParte,gl, 1);


        Circulo quartaParte = new Circulo(90,0,0,90,
                -0.55f, 0.06f, 0.0f,
                0.2f,0.4f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarCirculo(quartaParte,gl, 1);



        Circulo quintaParte = new Circulo(270,0,0,270,
                0.37f, 0.06f, 0.0f,
                0.2f,0.4f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarCirculo(quintaParte,gl, 1);


    }
}
