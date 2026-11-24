package mantenimiento;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {

    private final ColaPrioridad cola = new ColaPrioridad();

    public VentanaPrincipal() {
        initComponents();
        aplicarEstilo();
        actualizarEstado();
        pack();
        setLocationRelativeTo(null);
    }

    private void aplicarEstilo() {
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        pnlTitulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 6, 10));
        pnlDatos.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(6, 10, 6, 6),
                BorderFactory.createTitledBorder("Datos de la solicitud")));
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(4, 10, 4, 10));
        lblEstado.setBorder(BorderFactory.createEmptyBorder(4, 12, 8, 10));
        txtSalida.setFont(new Font("Monospaced", Font.PLAIN, 13));
        txtSalida.setLineWrap(true);
        txtSalida.setWrapStyleWord(true);
        scrollSalida.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(6, 6, 6, 10),
                BorderFactory.createTitledBorder("Resultados")));
    }

    private void actualizarEstado() {
        lblEstado.setText("Solicitudes en cola: " + cola.getCantidad()
                + (cola.estaVacia() ? "  (cola vacía)" : ""));
    }

    private void mostrar(String texto) {
        txtSalida.setText(texto);
        txtSalida.setCaretPosition(0);
    }

    private Integer leerId() {
        try {
            return Integer.parseInt(txtId.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID numérico válido.",
                    "ID inválido", JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        lblSolicitante = new javax.swing.JLabel();
        txtSolicitante = new javax.swing.JTextField();
        lblUbicacion = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblPrioridad = new javax.swing.JLabel();
        cmbPrioridad = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        scrollSalida = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        pnlSur = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();
        btnVerFrente = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de solicitudes de mantenimiento universitario");

        pnlTitulo.setLayout(new java.awt.GridLayout(2, 1));

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Sistema de gestión de solicitudes de mantenimiento universitario");
        pnlTitulo.add(lblTitulo);

        getContentPane().add(pnlTitulo, java.awt.BorderLayout.NORTH);

        pnlDatos.setLayout(new java.awt.GridLayout(5, 2));

        lblSolicitante.setText("Solicitante:");
        pnlDatos.add(lblSolicitante);

        txtSolicitante.setColumns(18);
        pnlDatos.add(txtSolicitante);

        lblUbicacion.setText("Ubicación (edificio/aula):");
        pnlDatos.add(lblUbicacion);

        txtUbicacion.setColumns(18);
        pnlDatos.add(txtUbicacion);

        lblDescripcion.setText("Descripción del problema:");
        pnlDatos.add(lblDescripcion);

        txtDescripcion.setColumns(18);
        pnlDatos.add(txtDescripcion);

        lblPrioridad.setText("Prioridad:");
        pnlDatos.add(lblPrioridad);

        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crítica", "Alta", "Media", "Baja" }));
        pnlDatos.add(cmbPrioridad);

        lblId.setText("ID (buscar / cancelar):");
        pnlDatos.add(lblId);

        txtId.setColumns(18);
        pnlDatos.add(txtId);

        getContentPane().add(pnlDatos, java.awt.BorderLayout.WEST);

        txtSalida.setEditable(false);
        txtSalida.setColumns(40);
        txtSalida.setRows(14);
        scrollSalida.setViewportView(txtSalida);

        getContentPane().add(scrollSalida, java.awt.BorderLayout.CENTER);

        pnlSur.setLayout(new java.awt.BorderLayout());

        pnlBotones.setLayout(new java.awt.GridLayout(2, 4));

        btnInsertar.setText("Insertar solicitud");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnInsertar);

        btnAtender.setText("Atender siguiente");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        pnlBotones.add(btnAtender);

        btnVerFrente.setText("Ver primera");
        btnVerFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFrenteActionPerformed(evt);
            }
        });
        pnlBotones.add(btnVerFrente);

        btnBuscar.setText("Buscar por ID");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnBuscar);

        btnCancelar.setText("Cancelar por ID");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCancelar);

        btnImprimir.setText("Imprimir cola");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        pnlBotones.add(btnImprimir);

        btnTotal.setText("Total de solicitudes");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        pnlBotones.add(btnTotal);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlBotones.add(btnSalir);

        pnlSur.add(pnlBotones, java.awt.BorderLayout.CENTER);

        lblEstado.setText("Solicitudes en cola: 0");
        pnlSur.add(lblEstado, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlSur, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String solicitante = txtSolicitante.getText().trim();
        String ubicacion = txtUbicacion.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
        if (solicitante.isEmpty() || ubicacion.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete solicitante, ubicación y descripción.",
                    "Datos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int prioridad = cmbPrioridad.getSelectedIndex() + 1;
        Nodo nuevo = new Nodo(cola.siguienteId(), solicitante, ubicacion, descripcion,
                prioridad, LocalDateTime.now());
        cola.insertar(nuevo);
        mostrar("Solicitud registrada:\n" + nuevo + "\n\n" + cola.listar());
        txtSolicitante.setText("");
        txtUbicacion.setText("");
        txtDescripcion.setText("");
        cmbPrioridad.setSelectedIndex(0);
        txtSolicitante.requestFocus();
        actualizarEstado();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        Nodo atendida = cola.atender();
        if (atendida == null) {
            mostrar("No hay solicitudes para atender: la cola está vacía.");
        } else {
            mostrar("Solicitud atendida:\n" + atendida + "\n\nCola restante:\n" + cola.listar());
        }
        actualizarEstado();
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnVerFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFrenteActionPerformed
        Nodo primera = cola.verFrente();
        mostrar(primera == null ? "La cola está vacía." : "Próxima solicitud a atender:\n" + primera);
    }//GEN-LAST:event_btnVerFrenteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Integer id = leerId();
        if (id == null) {
            return;
        }
        Nodo encontrada = cola.buscarPorId(id);
        mostrar(encontrada == null ? "No existe una solicitud con ID " + id + " en la cola."
                : "Solicitud encontrada:\n" + encontrada);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Integer id = leerId();
        if (id == null) {
            return;
        }
        Nodo cancelada = cola.cancelarPorId(id);
        if (cancelada == null) {
            mostrar("No existe una solicitud con ID " + id + " en la cola.");
        } else {
            mostrar("Solicitud cancelada:\n" + cancelada + "\n\nCola actual:\n" + cola.listar());
            txtId.setText("");
        }
        actualizarEstado();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        mostrar(cola.listar());
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        JOptionPane.showMessageDialog(this, "Total de solicitudes en la cola: " + cola.getCantidad(),
                "Total de elementos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnVerFrente;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPrioridad;
    private javax.swing.JLabel lblSolicitante;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JScrollPane scrollSalida;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtSolicitante;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
