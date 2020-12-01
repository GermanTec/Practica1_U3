
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class Lienzo extends Canvas {
public NewJFrame puntero;    
public int indiceFrase=0;
Random r=new Random();
public String []frase=new String[]{"Hola","Al final, la Navidad es como los caramelos; se deshace lentamente en tu boca,endulza tus sentidos y te hace desear que durase para siempre",
    "Bendito es el tiempo en que todo el mundo se dedica a una conspiración de amor","Honraré la Navidad en mi corazón y procuraré conservarla durante todo el año",
    "La navidad no es una fecha; es un estado en la mente",
    "Bendita sea la fecha que une a todo el mundo en una conspiración de amor",
    "Ojala pudiesemos meter el espiritud de navidad en jarros y abrir un jarro cada mes del año",
    "La Navidad no es un momento ni una estación, sino un estado de la mente. Valorar la paz y la generosidad y tener merced es comprender el verdadero significado de Navidad",
    "No existe la Navidad ideal, solo la Navidad que usted decida crear como reflejo de sus valores, deseos, queridos y tradiciones",
    "La navidad agita una varita mágica sobre el mundo, y por eso, todo es mas suave y mas hermoso",
    "La Navidad es la época del año en que se nos acaba el dinero antes que los amigos",
    "Este es el mensaje de Navidad: Nunca estamos solos",
    "No hay nada más triste en este mundo que despertarse la mañana de Navidad y no ser un niño",
    "La Navidad no es una temporada, es un sentimiento",
    "La Navidad es el día que une todos los tiempos",
    "Si quieres regalar algo en navidad, regala paz y buenos deseos a todos los que te rodean",
    "Esta Navidad no nos podremos ver, por eso uso este medio para decirles… ¡Felices fiestas, amigos",
    "En Navidad, tener a tu amigo de vecino, ¡es lo más! ¡Felices fiestas!",
    "Que en navidad el niño Jesús te regale un hogar repleto de risas, salud inquebrantable y muchas bendiciones",
    "La navidad es época de amor, reencuentro y mucha felicidad. ¡Felices fiestas!",
    "Siento la Navidad en mi corazón, que se llena de felicidad y de amor. ¡Felices fiestas!",
    "El espíritu de la Navidad ya ha llegado a mi casa, que está hermosa y preparada para recibir visitas, aquí te espero y… ¡felices fiestas!",
    "En esta navidad canta, baila, abraza fuerte y no te olvides de sonreír, pues esta es época de alegría",
    "Mis mejores deseos para ti y para los tuyos, y que podamos seguir cerrando años de amistad juntos. ¡Feliz Navidad y próspero Año Nuevo!",
    "Que la magia y la belleza de estos días se contagie al resto del año. ¡Feliz Navidad y próspero Año Nuevo!",
    "Hoy la estrella de Belén resplandece en nuestros corazones. ¡Feliz Navidad!",
    "Que el niño Dios haga resplandecer el amor, la unión y la paz. ¡Feliz Navidad a todos!",
    "Mirar atrás, darte cuenta de todo lo que conseguiste, y también de lo que perdiste, forma parte, sin duda, de estas fechas. ¡Feliz Navidad y próspero Año Nuevo!",
    "Llega un año más para poner en práctica todo lo aprendido en este que se va. ¡Feliz Navidad y próspero Año Nuevo!",
    "Demos la bienvenida a la temporada de magia, amor y mucha alegría. ¡Feliz Navidad!",
    "Que estos días te sirvan para recargar las pilas de amor, cariño, paz, esperanza y armonía. ¡Feliz Navidad y próspero Año Nuevo!" +
    "Es la época de comer mucho turrón, abrigarse, estar con la familia y derrochar alegría. ¡Feliz Navidad y próspero año nuevo!",
    "En estas fiestas les deseo a todos mucho amor, paz y que la alegría sea la reina de sus casas. ¡Feliz Navidad!",
    "Tengo mil razones para desearte feliz navidad, ¡Gracias por tu valiosa amistad y felices fiestas!",
    "Hay dos momentos de la vida que adoro, estar con amigos y la Navidad, así que, ¡nada mejor que juntar los dos!",
    "Reunirme con mis amigas en Navidad, es una de las cosas que me gusta más. ¡Felices fiestas!",
    "En estos días pasamos más tiempo alejados, pues es momento de estar en familia, pero os tengo en mi corazón. ¡Feliz Navidad, amigos!",
    "En fiestas como estas me recuerdo lo valiosa que es para mí tu amistad. ¡Espero tengas una linda navidad!",
    "Deseo que la bondad, la paz, el amor y la felicidad invadan tu hogar. ¡Feliz Navidad!",
    "Que el mejor adorno de navidad de este año sea la salud y felicidad.",
    "El regalo que le he pedido a Papa Noel es que el año que viene tenga muchos más momentos con mis amigas. ¡Feliz Navidad, chicas!",
    "Los abrazos son económicos ¡Regala muchos en esta navidad!","",""};


Timer t=new Timer(2000,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            indiceFrase++;
            if(indiceFrase==40){
            indiceFrase=0;
            
            }
        repaint();
        }
            
    });

    
public Lienzo(){
    t.start();
    
}

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        Graphics2D g2=(Graphics2D)g;
        
        this.setBackground(Color.black);
        g2.setFont(new Font("Arial",Font.PLAIN,25));
        g2.setColor(new Color(100,r.nextInt(200-50),r.nextInt(200-50),200));
        g2.drawString(frase[indiceFrase],r.nextInt(600-599),r.nextInt(800-150)+10);
        
    }
    
}
