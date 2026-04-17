package arreglo;

import java.util.ArrayList;

import clase.Celular;

public class Arreglos 
{
	private ArrayList<Celular>celu;
	public Arreglos() 
	{
		celu = new ArrayList<Celular>();
		Adicionar(new Celular(101540, "Iphone_15", 2, 5440));
		Adicionar(new Celular(8012, "Sansumg_S25", 1, 1440));
		Adicionar(new Celular(19010, "Honor_X7B", 3, 740));
		Adicionar(new Celular(10810, "Motorola_G54", 10, 840));
	}
	public void Adicionar(Celular x)
	{
		celu.add(x);
	}
	public int Tamaño() {
		return celu.size();
	}
	public Celular Obtener(int x) {
		return celu.get(x);
	}
	public Celular Buscar(int cod) {
		for (int i = 0; i < Tamaño(); i++) {
			if(Obtener(i).getCodigo()==cod) return Obtener(i);	
		}
		return null;
	}
	public void Eliminar (Celular x){
		celu.remove(x);
		}
}
