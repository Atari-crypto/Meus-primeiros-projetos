package aula3;

public class ex2 {
	public static void main(String[] args) {
		
		String nomeC = "Camila";
		int idadeC=3;
		int notamatematicaC=10;
		int notaportuguesC=5;
		
		String nomeCA = "Carlos";
		int idadeCA=18;
		int notamatematicaCA=5;
		int notaportuguesCA=10;
		
		if( nomeC == "Camila" && idadeC < 4 && notaportuguesC <= 5 && notamatematicaC <= 5) {
			System.out.println( "Você foi aprovado!");
		}else {
			System.out.println( "Você foi reprovado!");
		}
		
		if(nomeCA == "Carlos" && idadeCA > 4 && notamatematicaCA <= 7 && notaportuguesCA<= 7) {
			System.out.println( "Você foi aprovado!");
		}else {
			System.out.println( "Você foi reprovado!");
		}
		
		String aluno1 = "Camila";
		String aluno2 = "Carlos";
		int idadeAlunol = 3;
		int idadeAluno2 = 18;
		int notaMat_Camila = 10;
		int notaPor_Camila = 5;
		int notaMat_Carlos = 5;
		int notaPor_Carlos = 16;
		int mediaAlunoMenor = 5;
		int mediaAlunoMaior = 7;
		
				 if (idadeAlunol <=3) {
				 if (notaMat_Camila >= mediaAlunoMenor && notaPor_Camila >= mediaAlunoMenor) {
				
					 System.out.println("Parabéns," + alunol   +  " Você passou!");
				 }else{	
					 		System.out.println("Que pena, "+ alunol  +" Você não passou!");
				 	}			
				 }
				 
				 if (idadeAluno2 >3 && idadeAluno2 <=18) {
					 if (notaMat_Carlos >= mediaAlunoMaior && notaPor_Carlos >= mediaAlunoMaior) {
					
						 System.out.println("Parabéns," + aluno2  +  " Você passou!");
					 } else {	
						 		System.out.println("Que pena, "+ aluno2 +" Você não passou!");
					 }	
				}		
		}	

	

