package br.com.bg.comhibernate.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Rubens Leme
 */
public class ControladorTelaMenu extends ControladorTela {

    private JLabel jlaHora;
    private JLabel jlaData;
    private JLabel jlaDiaSemana;
    private Timer timer;

    public ControladorTelaMenu(JFrame telaMenu, JDesktopPane desktop, JLabel jlaHora, JLabel jlaData, JLabel jlaDiaSemana) {
        super(telaMenu, desktop);
        this.jlaHora = jlaHora;
        this.jlaData = jlaData;
        this.jlaDiaSemana = jlaDiaSemana;
        atualizacaoTimer();
    }

    private void atualizarHora() {
        // Hora
        jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void atualizarData() {
        // Data
        jlaData.setText(DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
        // Dia da semana
        jlaDiaSemana.setText(new SimpleDateFormat("EEEE").format(new Date()));
        // Hora
        jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void atualizacaoTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarHora();

            }
        });
        timer.start();

        atualizarData();
    }

}
