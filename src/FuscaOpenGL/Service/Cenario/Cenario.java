package FuscaOpenGL.Service.Cenario;

import FuscaOpenGL.Service.GeradorDeFormas.GerarFormasNaTela;
import FuscaOpenGL.Model.Quadrado;
import FuscaOpenGL.Model.Triangulo;
import com.jogamp.opengl.GL2;

public class Cenario  {

    public static void cria(GL2 gl){

        GerarFormasNaTela gerador = new GerarFormasNaTela();


        Quadrado estrada = new Quadrado(0,0,0,0,
                0,0, 0,
                2.0f,1.0f,0.0f,
                0.2f, 0.2f, 0.2f);
        gerador.gerarQuadrado(estrada,gl);



        Quadrado faixa = new Quadrado(0,0,0,0,
                0,0, 0,
                2.0f,0.05f,0.0f,
                1.5f, 1.5f, 0.5f);
        gerador.gerarQuadrado(faixa,gl);



        Quadrado primeiraPartePlaca = new Quadrado(90,0,0,90,
                0.65f, 0.8f, 0.0f,
                0.3f,0.02f,0.0f,
                1.5f, 1.5f, 0.5f);
        gerador.gerarQuadrado(primeiraPartePlaca,gl);




        Triangulo segundaPartePlaca = new Triangulo(45,0,0,45,
                0.0f, 1.13f, 0.0f,
                0.2f,0.2f,0.0f,
                1.0f, 0.0f, 0.0f );
        gerador.gerarTriangulo(segundaPartePlaca,gl);



        Triangulo terceiraPartePlaca = new Triangulo(45,0,0,45,
                .02f, 1.15f, 0.0f,
                0.1f,0.1f,0.0f,
                1.0f, 1.0f, 1.0f );
        gerador.gerarTriangulo(terceiraPartePlaca,gl);



        Quadrado placa = new Quadrado(0,0,0,0,
                0.5f, 0.65f, 0.0f,
                0.4f,0.2f,0.0f,
                1.8f, 0.5f, 0.0f);
        gerador.gerarQuadrado(placa,gl);


        Quadrado placaSeta = new Quadrado(0,0,0,0,
                0.5f, 0.65f, 0.0f,
                0.1f,0.05f,0.0f,
                1.0f, 1.5f, 1.5f);
        gerador.gerarQuadrado(placaSeta,gl);



        Triangulo terceiraPartePlacaSeta = new Triangulo(135,0,0,135,
                .12f, -0.80f, 0.0f,
                0.09f,0.09f,0.0f,
                1.90f, 1.35f, 1.0f );
        gerador.gerarTriangulo(terceiraPartePlacaSeta,gl);


        Triangulo basePlaca = new Triangulo(45,0,0,45,
                0.7f, 0.0f, 0.0f,
                0.09f,0.09f,0.0f,
                1.8f, 0.5f, 0.0f );
        gerador.gerarTriangulo(basePlaca,gl);
    }
}
