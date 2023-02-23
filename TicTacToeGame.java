import java.util.Scanner;
class TicTacToeGame {
	public void drawGrid(char [][]grid) {
		System.out.println("| "+grid[0][0]+" | "+grid[0][1]+" | "+grid[0][2]);
		System.out.println("------------");
		System.out.println("| "+grid[1][0]+" | "+grid[1][1]+" | "+grid[1][2]);
		System.out.println("------------");
		System.out.println("| "+grid[2][0]+" | "+grid[2][1]+" | "+grid[2][2]);

	}
	
	public void setPosition(int position , char t, char[][] grid ) {
		if(position == 1) 
			grid[0][0] = t;
		else if(position == 2)
			grid[0][1] = t;
		else if(position == 3)
			grid[0][2] = t;
	
		else if(position == 4) 
			grid[1][0] = t;
		else if(position == 5)
			grid[1][1] = t;
		else if(position == 6)
			grid[1][2] = t;
	
		else if(position == 7) 
			grid[2][0] = t;
		else if(position == 8)
			grid[2][1] = t;
		else if(position == 9)
			grid[2][2] = t;
	
		
	}
	
	public boolean checkPosition(char grid[][] , int position) {
		if((position == 1) && ((grid[0][0] == 'x') || (grid[0][0] == 'o'))){
		return false;
		}
		else if((position == 2) && ((grid[0][1] == 'x') || (grid[0][1] == 'o'))){
			return false;
			}
		else if((position == 3) && ((grid[0][2] == 'x') || (grid[0][2] == 'o'))){
			return false;
			}
		else if((position == 4) && ((grid[1][0] == 'x') || (grid[1][0] == 'o'))){
			return false;
			}
		else if((position == 5) && ((grid[1][1] == 'x') || (grid[1][1] == 'o'))){
			return false;
			}
		else if((position == 6) && ((grid[1][2] == 'x') || (grid[1][2] == 'o'))){
			return false;
			}
		else if((position == 7) && ((grid[2][0] == 'x') || (grid[2][0] == 'o'))){
			return false;
			}
		else if((position == 8) && ((grid[2][1] == 'x') || (grid[2][1] == 'o'))){
			return false;
			}
		else if((position == 9) && ((grid[2][2] == 'x') || (grid[2][2] == 'o'))){
			return false;
			}
		else
			return true;
			
	}
	
	public boolean checkTie(char grid[][]) {
		if((grid[0][0] != '1') && (grid[0][1] != '2') && (grid[0][2] != '3') && 
				(grid[1][0] != '4') && (grid[1][1] != '5')&& (grid[1][2] != '6')&&
				(grid[2][0] != '7') && (grid[2][1] != '8') && (grid[2][2] != '9')) {
			return true;
		}
		else
			return false;
	}
	
	public boolean checkWinner(char [][]grid, String p1 ,String p2){
				
		for(int i=0; i<3; i++) {
			if(grid[i][0] == 'x' && grid[i][1] == 'x' && grid[i][2] == 'x')
			{
			System.out.println(p1 + " Won the game");
			
			return true;
			//break;
			}
			else if(grid[0][i] == 'x' && grid[1][i] == 'x' && grid[2][i] == 'x')
			{
				System.out.println(p1 + " Won the game");
				return true;
				//break;
			}
			else if(grid[0][0] == 'x' && grid[1][1] == 'x' && grid[2][2] == 'x')
			{
				System.out.println(p1 + " Won the game");
				return true;
				//break;
			}
			else if(grid[0][2] == 'x' && grid[1][1] == 'x' && grid[2][0] == 'x')
			{
				System.out.println(p1 + " Won the game");
				return true;
				//break;
			}
			else if(grid[i][0] == 'o' && grid[i][1] == 'o' && grid[i][2] == 'o')
			{
				System.out.println(p2 + " Won the game");
				return true;
				//break;
			}
			else if(grid[0][i] == 'o' && grid[1][i] == 'o' && grid[2][i] == 'o')
			{
				System.out.println(p2 + " Won the game");
				return true;
			//	break;
			}
			else if(grid[0][0] == 'o' && grid[1][1] == 'o' && grid[2][2] == 'o')
			{
				System.out.println(p2 + " Won the game");
				return true;
				//break;
			}
			else if(grid[0][2] == 'o' && grid[1][1] == 'o' && grid[2][0] == 'o')
			{	
				System.out.println(p2 + " Won the game");
				return true;
				//break;
			}
				
		}

		return false;
	}
	public static void main(String[] args) {
		boolean temp3 = true;
		while(temp3 == true) {
		TicTacToeGame t1 = new TicTacToeGame();
		Scanner sc =  new Scanner(System.in);
		char grid[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		System.out.println(" ***************************");
		System.out.println("|     Tic Tac Toe Game      |");
		System.out.println(" ***************************");
		t1.drawGrid(grid);
		System.out.print("Enter player 1 Name: ");
		String p1 = sc.nextLine();
		System.out.print("Enter player 2 Name: ");
		String p2 = sc.nextLine();
		System.out.println("Who wants to take first turn.");
		System.out.println("1."+p1 + "(x)");
		System.out.println("2."+p2 + "(o)");
		int option = sc.nextInt();
		String player;
		char t = ' ';
		if(option == 1) {
			player = p1;
			t = 'x';
		}
		else {
			player = p2;
			t = 'o';
		}
	
		boolean temp = true;
		while(temp) {
			boolean temp2 = true;
			System.out.println(player + "'s turn ");

			System.out.println("Enter the position (1-9)");
		int position = sc.nextInt();

		if(t1.checkPosition(grid, position) == false) {
			System.out.println("Position already filled , try again");
			temp2=false;
		}
		else {
			t1.setPosition(position, t, grid);
			t1.drawGrid(grid);
			temp2=true;
		}

		if(t1.checkWinner(grid, p1, p2)
 == false) {
			if(t1.checkTie(grid) == true) {
				System.out.println("Game tie");
				temp=false;
			}
			if(temp != false)
			temp = true;
		}
		else {
			
			temp =false;
			
		}
		if((player.equalsIgnoreCase(p1)) && temp2 == true)
		{
			player = p2;
			t = 'o';
		}
			else if((player.equalsIgnoreCase(p2)) && temp2 == true) {
				player = p1;
				t='x';
			}
		
		}
	System.out.println("Do you want to play again ?");
	System.out.println("Press Y to cantinue   N to exit.");

	char c = sc.next().charAt(0);
	if(c == 'Y' || c== 'y')
		temp3 = true;
	else if(c== 'N' || c== 'n') {
		System.out.println("Thank you.");
		temp3 = false;
        }

		}	
	}

}
