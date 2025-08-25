package hospital.data;

import hospital.logic.usuarios.Administrador;
import hospital.logic.usuarios.Doctor;
import hospital.logic.medicamentos.Medicamento;
import hospital.logic.paciente.Paciente;
import hospital.logic.usuarios.Farmaceuta;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    List<Doctor> doctores;
    List<Farmaceuta> farmaceutas;
    List<Administrador> administradores;
    List<Paciente> pacientes;
    List<Medicamento> medicamentos;
    //Constructores
    public Listas() {
        this.doctores = new ArrayList<Doctor>();
        this.pacientes = new ArrayList<Paciente>();
        this.medicamentos = new ArrayList<Medicamento>();
        this.administradores = new ArrayList<Administrador>();
        this.farmaceutas = new ArrayList<Farmaceuta>();
    }

    //Setters | Getters
    public List<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(List<Doctor> doctores) {
        this.doctores = doctores;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Administrador> getAdministradores() { return administradores;}

    public void setAdministradores(List<Administrador> administradores) {this.administradores = administradores;}

    public List<Farmaceuta> getFarmaceutas() { return farmaceutas;}

    public void setFarmaceutas(List<Farmaceuta> farmaceutas) {this.farmaceutas = farmaceutas;}

    // Metodos de la clase


}
