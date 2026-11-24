package mantenimiento;

public class ColaPrioridad {

    private Nodo frente;   
    private Nodo fin;      
    private int cantidad;
    private int contadorId;

    public ColaPrioridad() {
        this.frente = null;
        this.fin = null;
        this.cantidad = 0;
        this.contadorId = 0;
    }

    public boolean estaVacia() { return frente == null; }

    public int getCantidad() { return cantidad; }

    public int siguienteId() {
        contadorId++;
        return contadorId;
    }

    
    public Nodo verFrente() { return frente; }

    public void insertar(Nodo nuevo) {
        if (frente == null) {
            frente = nuevo;
            fin = nuevo;
        } else if (nuevo.getPrioridad() < frente.getPrioridad()) {
           
            nuevo.setSiguiente(frente);
            frente = nuevo;
        } else if (nuevo.getPrioridad() >= fin.getPrioridad()) {
            
            fin.setSiguiente(nuevo);
            fin = nuevo;
        } else {
            
            Nodo actual = frente;
            while (actual.getSiguiente() != null
                    && actual.getSiguiente().getPrioridad() <= nuevo.getPrioridad()) {
                actual = actual.getSiguiente();
            }
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);                
        }
        cantidad++;
    }

    public Nodo atender() {
        if (frente == null) {
            return null;
        }
        Nodo atendido = frente;
        frente = frente.getSiguiente();
        atendido.setSiguiente(null);
        if (frente == null) {
            fin = null;
        }
        cantidad--;
        return atendido;
    }

    public Nodo buscarPorId(int id) {
        Nodo actual = frente;
        while (actual != null) {
            if (actual.getId() == id) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

  
    public Nodo cancelarPorId(int id) {
        if (frente == null) {
            return null;
        }
        if (frente.getId() == id) {
            return atender();
        }
        Nodo anterior = frente;
        Nodo actual = frente.getSiguiente();
        while (actual != null && actual.getId() != id) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if (actual == null) {
            return null;
        }
        anterior.setSiguiente(actual.getSiguiente());
        if (actual == fin) {
            fin = anterior;
        }
        actual.setSiguiente(null);
        cantidad--;
        return actual;
    }

    
    public String listar() {
        if (frente == null) {
            return "La cola está vacía.";
        }
        StringBuilder sb = new StringBuilder();
        Nodo actual = frente;
        int posicion = 1;
        while (actual != null) {
            sb.append(posicion).append(". ").append(actual).append("\n");
            actual = actual.getSiguiente();
            posicion++;
        }
        return sb.toString();
    }
}
