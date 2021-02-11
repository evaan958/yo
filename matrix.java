//Evaan J 
//Feb 7
//Final project - The Game of Life

public class matrix {
    
    //Creating global objects so it can be refferencede in other classes
    public static matrix matrix = new matrix ();
    public static data data = new data ();
    public static gameGrid gameGrid = new gameGrid ();
    public static print print = new print ();
    public static end end = new end ();
    
    //Creating a global static boolean array and int so it can be refferenced in the main class and other methods
    public static boolean [][] cor1 = new boolean [0][0];
    public static int rowValue;
    public static int colValue;
    
    //Creating global ints so it can be refferenced in other methods
    int numValue;
    int genValue;
    int user;
    int rowUpdate;
    int colUpdate;
    int w = 0;
    int k = -1;
    
    public static void main(String [] args){

        //Creating an object for the different classes
        intro intro = new intro ();
        
        //Setting visibility of a gui to true so it can be seen by the user
        intro.setVisible(true);
        
        cor1 = new boolean [rowValue][colValue];
        
    }
    
    //Creating a void that will intake data
    public void data (int data){
        
        //Setting the value of data equal to user
        user = data;
        

    }
    public void rowInput(){
        
        //Setting the value of one int equal to another
        rowValue = user;
        
        //Asking to run code inside the method "outputSet" while giving input
        data.outputSet("Choose a number of columns");

    }
    public void columnInput (){
        
        colValue = user;
        data.outputSet("Choose a number of organisms");

    }
    public void numOrganism(){
        
        numValue = user;
        data.outputSet("How many generations would you like to see?");
        
    }
    public void gen(){
        
        genValue = user;
        matrix.row();
       
    }public void row (){
        
        //Creating a if statement that will run different code under different codiotions
        if(w<numValue){
            data.outputSet("What is the row of organism " + (1+w) +" ?");
        }else{
            data.setVisible(false);
            gameGrid.print();
            matrix.lead();
            
        }
    }
   
    public void lead (){
        
        if(k<genValue){
            gameGrid.nextGen();
            gameGrid.print();
            k++;
        }else {
            print.setVisible(false);
            end.setVisible(true);
        }
    
    }
     
    
    
}
