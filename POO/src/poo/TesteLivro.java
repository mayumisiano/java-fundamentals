package poo;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro Duna = new Livro();
		
		Duna.autor= "Frank Herbert";
		Duna.qntdPaginas = 600;
		Duna.titulo = "Duna";
		Duna.sinopse = "Lalalalallalallaa";
		
		System.out.println(Duna.autor);
		System.out.println(Duna.titulo);
		System.out.println(Duna.qntdPaginas);
	}

}
