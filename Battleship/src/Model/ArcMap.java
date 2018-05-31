
package Model;

import java.io.File;
import java.util.Scanner;

public class ArcMap {

	private int arcWidth;
	private int arcHeight;

	private String arcTemporatyMatrix = "";
	private int[][] arcMatrix;

	private int arcFirstShip;
	private int arcSecondShip;
	private int arcThirdShip;
	private int arcFourthShip;
	private int arcFivethShip;
	private int arcFleet;


	private int var;
	private int cont;
	private int lenth;
	private String[] content;

	public ArcMap(String path) throws Exception {

		Scanner reader = new Scanner(new File(path));

		String row = reader.nextLine();

		//Pegando as dimenções
		row = reader.nextLine();

		content = row.split(" ");
		var = Integer.parseInt(content[0]);
		arcWidth = var;
		var = Integer.parseInt(content[1]);
		arcHeight = var;

		row = reader.nextLine();
		row = reader.nextLine();

		//Pegando a matriz da imagem e jogando em uma string
		for (int i = 0; i < arcHeight; i++) {
			row = reader.nextLine();
			arcTemporatyMatrix += row;
		}

		lenth = arcHeight * arcWidth;
		int[] numbers = new int[lenth];

		//Transformando a string em vetor de Int
		for (int i = 0; i < lenth; i++) {
			numbers[i] = Integer.parseInt(arcTemporatyMatrix.substring(i, i + 1));
		}

		arcMatrix = new int[arcHeight][arcWidth];

		//Transformando o vector em uma matriz
		for (int i = 0; i < arcHeight; i++) {
			for (int j = 0; j < arcWidth; j++) {
				arcMatrix[i][j] = numbers[cont];
				cont++;
			}
		}

		//Pegando numero dos barcos
		row = reader.nextLine();
		row = reader.nextLine();

		row = reader.nextLine();
		content = row.split(" ");
		var = Integer.parseInt(content[1]);
		arcFirstShip = var;

		row = reader.nextLine();
		content = row.split(" ");
		var = Integer.parseInt(content[1]);
		arcSecondShip = var;

		row = reader.nextLine();
		content = row.split(" ");
		var = Integer.parseInt(content[1]);
		arcThirdShip = var;

		row = reader.nextLine();
		content = row.split(" ");
		var = Integer.parseInt(content[1]);
		arcFourthShip = var;

		row = reader.nextLine();
		content = row.split(" ");
		var = Integer.parseInt(content[1]);
		arcFivethShip = var;
		
		arcFleet = getArcFirstShip()+getArcSecondShip()+getArcThirdShip()+getArcFourthShip()+getArcFivethShip();
		System.out.println(arcFleet+"eeeeeeeeeeeeee'");
	}

	public int getArcFirstShip() {
		return arcFirstShip;
	}

	public int getArcFleet() {
		return arcFleet;
	}

	public int getArcSecondShip() {
		return arcSecondShip;
	}

	public int getArcThirdShip() {
		return arcThirdShip;
	}

	public int getArcFourthShip() {
		return arcFourthShip;
	}

	public int getArcFivethShip() {
		return arcFivethShip;
	}

	public int getArcWidth() {
		return arcWidth;
	}

	public int getArcHeight() {
		return arcHeight;
	}

	public int[][] getArcMatrix() {
		return arcMatrix;
	}

	 

}
