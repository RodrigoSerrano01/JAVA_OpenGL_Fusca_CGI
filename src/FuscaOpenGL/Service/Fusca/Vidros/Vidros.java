package FuscaOpenGL.Service.Fusca.Vidros;

import FuscaOpenGL.Service.GeradorDeFormas.GerarFormasNaTela;
import FuscaOpenGL.Model.Circulo;
import FuscaOpenGL.Model.Quadrado;
import com.jogamp.opengl.GL2;

public  abstract class Vidros {




    public static void cria(GL2 gl){



        GerarFormasNaTela gerador = new GerarFormasNaTela();

        Circulo vidro = new Circulo(0,0,0,0,
                -0.03f, 0.3f, 0.0f,
                1.2f,0.7f,0.0f,
                1.0f, 1.0f, 1.0f);
        gerador.gerarCirculo(vidro,gl, 1);




        Quadrado detalheUm = new Quadrado(0,0,0,0,
                0.00f, 0.37f, 0.0f,
                0.02f,0.15f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarQuadrado(detalheUm,gl);




        Quadrado detalheDois = new Quadrado(143,0,0,143,
                0.4f, -0.17f, 0.0f,
                0.03f,0.19f,0.0f,
                0.5f, 0.5f, 0.5f);
        gerador.gerarQuadrado(detalheDois,gl);


    }
}
